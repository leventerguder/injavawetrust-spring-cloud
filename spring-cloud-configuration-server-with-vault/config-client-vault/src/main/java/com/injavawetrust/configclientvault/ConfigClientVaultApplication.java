package com.injavawetrust.configclientvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientVaultApplication {

    // localhost:8080/messages
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientVaultApplication.class, args);
    }

}
