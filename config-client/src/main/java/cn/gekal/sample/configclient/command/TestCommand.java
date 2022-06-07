package cn.gekal.sample.configclient.command;

import cn.gekal.sample.configclient.property.ConfigClientProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCommand implements CommandLineRunner {

    /** LOGGER */
    private static final Logger LOGGER = LoggerFactory.getLogger(TestCommand.class);

    private final ConfigClientProperties configClientProperties;

    public TestCommand(ConfigClientProperties configClientProperties) {
        this.configClientProperties = configClientProperties;
    }

    @Override
    public void run(String... args) {

        LOGGER.info("ConfigClientProperties = {}", this.configClientProperties);
    }
}
