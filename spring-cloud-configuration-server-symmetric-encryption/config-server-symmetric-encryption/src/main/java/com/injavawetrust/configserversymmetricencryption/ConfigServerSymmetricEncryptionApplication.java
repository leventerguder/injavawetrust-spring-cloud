package com.injavawetrust.configserversymmetricencryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerSymmetricEncryptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerSymmetricEncryptionApplication.class, args);
    }

    // http://localhost:8071/config-client-symmetric-encryption/dev

}
