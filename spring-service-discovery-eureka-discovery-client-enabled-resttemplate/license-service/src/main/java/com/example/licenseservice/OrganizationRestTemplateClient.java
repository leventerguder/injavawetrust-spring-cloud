package com.example.licenseservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class OrganizationRestTemplateClient {

    private final RestTemplate restTemplate;

    public Organization getOrganization(String organizationId) {

        /*
         * When using a Load Balancer backed RestTemplate, builds the target URL with the Eureka service ID.
         * RestTemplateConfiguration
         */

        /*
        The server name in the URL matches the application ID of the organization service key
        that you used to register the organization service with Eureka:
        http://{applicationid}/organizations/{organizationId}
         */

        ResponseEntity<Organization> restExchange =
                restTemplate.exchange(
                        "http://organization-service/organizations/{organizationId}",
                        HttpMethod.GET, null,
                        Organization.class, organizationId);

        return restExchange.getBody();

        /*
         * The Load Balancer–enabled RestTemplate class parses the URL passed into it and uses whatever is passed in
         * as the server name as the key to query the Load Balancer for an instance of a service.
         * The actual service location and port are entirely abstracted from the developer.
         *
         * Also, by using the RestTemplate class, the Spring Cloud Load Balancer will round-robin load balance all requests among all the service instances.
         */
    }
}
