package cn.gekal.sample.configserver.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * セキュリティコンフィグ
 * <p>
 * Ref: <a href="https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter">Spring Security without the WebSecurityConfigurerAdapter</a>
 */
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        // "ACTUATOR"と"USER"という2つのロールのユーザーを作る
        // 本番ではDefaultPasswordEncoderは使わないで！
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("client")
                .password("password")
                .roles("CLIENT")
                .build();

        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(authz -> authz.anyRequest().authenticated())
                .httpBasic(withDefaults());

        return http.build();
    }
}
