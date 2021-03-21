package cn.gekal.sample.configclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConfigClientRestController {

    private final ConfigClientProperties properties;

    public ConfigClientRestController(ConfigClientProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public String hello() {

        return "test.key = " + this.properties.getKey();
    }
}
