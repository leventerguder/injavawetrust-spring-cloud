package com.injavawetrust.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

    /*
    http://localhost:8761/eureka-server/

    To see all the instances of a service in the REST API, select the following GET endpoint:

    http://localhost:8761/eureka-server/eureka/apps
     */
}
