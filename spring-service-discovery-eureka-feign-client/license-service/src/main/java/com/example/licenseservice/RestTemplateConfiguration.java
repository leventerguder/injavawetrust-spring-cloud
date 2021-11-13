package com.example.licenseservice;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    // To use a Load Balancer–aware RestTemplate class, we need to define a RestTemplate bean with a Spring Cloud @LoadBalanced annotation.
    // Gets a list of all the instances for the organization services
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
