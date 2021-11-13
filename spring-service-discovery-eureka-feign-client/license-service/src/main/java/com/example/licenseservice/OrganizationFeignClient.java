package com.example.licenseservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("organization-service") // Identifies your service to Feign
@RequestMapping("/organizations")
public interface OrganizationFeignClient {

    @GetMapping("/{organizationId}")
    Organization getOrganization(@PathVariable String organizationId);

    // @FeignClient annotation, passing it the application ID of the service we want the interface to represent.

    /*
    You can use these three different mechanisms in Spring Cloud and Netflix Eureka to invoke a service:
    Spring Cloud Discovery Client,
    Spring Cloud Load Balancer–backed RestTemplate,
    and Netflix’s Feign client.
     */
}
