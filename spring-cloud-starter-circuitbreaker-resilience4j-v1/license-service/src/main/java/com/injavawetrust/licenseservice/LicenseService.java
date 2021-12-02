package com.injavawetrust.licenseservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

@Service
public class LicenseService {

    @CircuitBreaker(name = "license-service-circuit-breaker")
    public License getLicense(String license, String organization) {
        throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "This is a remote exception");
    }
}
