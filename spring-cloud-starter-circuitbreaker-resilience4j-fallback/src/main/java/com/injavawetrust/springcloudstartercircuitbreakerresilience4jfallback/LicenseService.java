package com.injavawetrust.springcloudstartercircuitbreakerresilience4jfallback;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LicenseService {

    /*
    To implement a fallback strategy with Resilience4j, we need to do two things.
    First, we need to add a fallbackMethod attribute to @CircuitBreaker.

    This attribute must contain the name of the method that will be called when Resilience4j interrupts
    a call because of a failure.

     The second thing we need to do is to define a fallback method.
     This method must reside in the same class as the original method that was protected
     by @CircuitBreaker

     To create the fallback method in Resilience4j, we need to create a method that contains
     the same signature as the originating function plus one extra parameter, which is the target exception parameter.
     With the same signature , we can pass all the parameters from the original method to the fallback method.
     */

    /*
    Regarding application.yml configuration , this method will be executed 5 times, after all 5 request the fallbackMethod will be invoked
    Than , the fallbackMethod will be invoked ONLY. (Circuit will be opened)
     */

    @CircuitBreaker(name = "license-service-circuit-breaker", fallbackMethod = "buildFallbackLicenseList")
    public License getLicense(String license, String organization) {
        System.out.println("LicenseService#called");
        throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "This is a remote exception");
    }

    public License buildFallbackLicenseList(String licenseId, String organizationId, Throwable t) {

        License license = new License();
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setProductName(
                "Sorry no licensing information currently available");

        return license;
    }
}
