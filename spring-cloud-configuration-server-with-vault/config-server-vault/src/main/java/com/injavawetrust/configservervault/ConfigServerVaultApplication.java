package com.injavawetrust.configservervault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerVaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerVaultApplication.class, args);
    }

}
