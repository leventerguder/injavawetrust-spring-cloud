package com.injavawetrust.springcloudstarterbulkheadresilience4jv1;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.resilience4j.bulkhead.BulkheadFullException;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;


@Service
public class LicenseService {


    /*
    The bulkhead pattern segregates remote resource calls in their own thread pools so that a single misbehaving service
    can be contained and not crash the container.

    Resilience4j provides two different implementations of the bulkhead pattern. You can use these implementations to
    limit the number of concurrent executions:

    Semaphore bulkhead - Uses a semaphore isolation approach, limiting the number of concurrent requests to the service.
    Once the limit is reached, it starts rejecting requests.

    Thread pool bulkhead - Uses a bounded queue and a fixed thread pool. This approach only rejects a request when
    the pool and the queue are full.

    Resilience4j, by default, uses the semaphore bulkhead type.
     */

    /*
    Sets the instance name and fallback method for the bulkhead pattern
     */
    @Bulkhead(name = "license-service-bulkhead", fallbackMethod = "buildFallbackLicenseList")
    public License getLicense(String license, String organization) {
        System.out.println("LicenseService#called");
        slowProcess();
        return license();
    }

    private void slowProcess() {
        try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public License buildFallbackLicenseList(String licenseId, String organizationId, BulkheadFullException bulkheadFullException) {


        License license = new License();
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setProductName(
                "Sorry no licensing information currently available. Reason : " + bulkheadFullException.getMessage());

        return license;
    }

    private License license() {
        License license = new License();
        return license;
    }
}
