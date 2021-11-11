package com.example.licenseservice;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrganizationDiscoveryClient {

    private final DiscoveryClient discoveryClient;

    public OrganizationDiscoveryClient(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    public Organization getOrganization(String organizationId) {

        RestTemplate restTemplate = new RestTemplate();
        List<ServiceInstance> instances = discoveryClient.getInstances("organization-service");

        if (instances.size() == 0) {
            return null;
        }

        String serviceUri = String.format("%s/organizations/%s", instances.get(0).getUri().toString(), organizationId);

        ResponseEntity<Organization> restExchange =
                restTemplate.exchange(
                        serviceUri,
                        HttpMethod.GET,
                        null, Organization.class, organizationId);

        return restExchange.getBody();
    }
    /*
    The Discovery Client and real life
    You should only use the Discovery Client when your service needs to query the Load Balancer
    to understand what services and service instances are registered with it.

    - You aren’t taking advantage of the Spring Cloud client-side Load Balancer.
    By calling the Discovery Client directly, you get a list of services, but it becomes your responsibility to choose
    which returned service instance you’re going to invoke.

    - ou’re doing too much work. In the code, you have to build the URL that you’ll use to call your service.
    It’s a small thing, but every piece of code that you can avoid writing is one less piece of code that you have to debug.
     */
}
