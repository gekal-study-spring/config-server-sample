package cn.gekal.sample.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "test")
public class ConfigClientProperties {

    private String key = "default value";

    @Override
    public String toString() {
        return "ConfigClientProperties{" +
                "key='" + key + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
