package com.injavawetrust.springcloudstartercircuitbreakerresilience4jv2;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    private final CircuitBreakerFactory circuitBreakerFactory;

    @GetMapping("/greeting")
    public String greeting() {

        // https://www.baeldung.com/spring-cloud-circuit-breaker

        /*
        Now, we can easily create a circuit breaker using the CircuitBreakerFactory#create method.
        It takes the circuit breaker identifier as an argument:
         */

        CircuitBreaker circuitBreaker = circuitBreakerFactory.create("coolCircuitBreaker");
        return circuitBreaker.run(() -> messageService.getMessage("type"));
    }
}
