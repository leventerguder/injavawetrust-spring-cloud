package com.injavawetrust.springcloudstarterbulkheadresilience4jv1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/licences")
@RequiredArgsConstructor
public class LicenseController {

    private final LicenseService licenseService;

    @GetMapping("/{license}/organizations/{organization}")
    public License getLicense(@PathVariable String license, @PathVariable String organization) {
        return licenseService.getLicense(license, organization);
    }
}
