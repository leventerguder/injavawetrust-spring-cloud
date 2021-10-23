package com.injavawetrust.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

/**
 * Spring Cloud Config Server provides an HTTP resource-based API for external configuration (name-value pairs or equivalent YAML content).
 * The server is embeddable in a Spring Boot application, by using the @EnableConfigServer annotation.
 */
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

    // When you request an environment-specific profile, both the requested profile and
    // the default profile are returned.

    // http://localhost:8071/config-client1/uat
    // http://localhost:8071/config-client1/dev
    // http://localhost:8071/config-client1/default
}
