package com.injavawetrust.config.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableConfigurationProperties
@RefreshScope

/*
Spring Boot applications , only read their properties at startup, so property changes
made in the Config Server won't be automatically picked up by the Spring Boot application.
But Spring Boot Actuator offers a @RefreshScope annotation that allows a development team
to access a /refresh endpoint that will force the Spring Boot application to reread its application
configuration

http://localhost:8080/actuator/refresh HTTP POST will refresh the new values.
 */

public class ConfigClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient1Application.class, args);

        // http://localhost:8080/configs
    }

}
