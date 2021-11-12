package com.injavawetrust.organizationservice.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @GetMapping("/{organizationId}")
    public Organization getOrganization(@PathVariable String organizationId) {

        Organization organization = new Organization();
        organization.setName("injavawetrust");
        organization.setContactName("Levent E");
        organization.setContactPhone("+905555555555");
        organization.setId(organizationId);
        organization.setContactEmail("erguder.levent@gmail.com");

        return organization;
    }
}
