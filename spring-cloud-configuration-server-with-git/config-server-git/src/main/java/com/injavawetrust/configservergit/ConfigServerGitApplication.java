package com.injavawetrust.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerGitApplication {

    // http://localhost:8071/config-client-git/dev
    // http://localhost:8071/config-client-git/uat
    // http://localhost:8071/config-client-git/default

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGitApplication.class, args);
    }

}
