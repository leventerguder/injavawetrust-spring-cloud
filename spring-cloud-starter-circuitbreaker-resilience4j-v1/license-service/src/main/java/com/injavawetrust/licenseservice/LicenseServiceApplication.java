package com.injavawetrust.licenseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LicenseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicenseServiceApplication.class, args);
    }

    // https://resilience4j.readme.io/docs/circuitbreaker

    // https://resilience4j.readme.io/docs/getting-started-3

    // Hit this link at least 6 times.
    // http://localhost:8080/licences/1/organizations/100

    // http://localhost:8080/actuator

    /*

    slidingWindowType default COUNT_BASED
    Configures the type of the sliding window which is used to record the outcome of calls when the CircuitBreaker is closed.
    Sliding window can either be count-based or time-based.

    If the sliding window is COUNT_BASED, the last slidingWindowSize calls are recorded and aggregated.
    If the sliding window is TIME_BASED, the calls of the last slidingWindowSize seconds recorded and aggregated.

    */

    /*

    slidingWindowSize 100
    Configures the size of the sliding window which is used to record the outcome of calls when the CircuitBreaker is closed.

     */


    /*
    minimumNumberOfCalls default 100
    Configures the minimum number of calls which are required (per sliding window period) before the CircuitBreaker can calculate the error rate or slow call rate.
    For example, if minimumNumberOfCalls is 10, then at least 10 calls must be recorded, before the failure rate can be calculated.
    If only 9 calls have been recorded the CircuitBreaker will not transition to open even if all 9 calls have failed.
     */

    /*
    waitDurationInOpenState default 60000ms
    The time that the CircuitBreaker should wait before transitioning from open to half-open.
     */
}
