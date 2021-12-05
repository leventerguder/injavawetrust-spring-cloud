package com.injavawetrust.springcloudstartercircuitbreakerresilience4jv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudStarterCircuitbreakerResilience4jV3Application {

    // hit the link at least 6 times.
    // http://localhost:8080/messages/greeting

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStarterCircuitbreakerResilience4jV3Application.class, args);
    }
}
