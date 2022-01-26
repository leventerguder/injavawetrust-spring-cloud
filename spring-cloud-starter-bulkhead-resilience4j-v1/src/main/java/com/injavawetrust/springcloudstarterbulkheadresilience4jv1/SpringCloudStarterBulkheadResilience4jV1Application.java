package com.injavawetrust.springcloudstarterbulkheadresilience4jv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudStarterBulkheadResilience4jV1Application {


    // Hit/refresh the request a couple of times.
    // http://localhost:8080/licences/100/organizations/200
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStarterBulkheadResilience4jV1Application.class, args);
    }
}
