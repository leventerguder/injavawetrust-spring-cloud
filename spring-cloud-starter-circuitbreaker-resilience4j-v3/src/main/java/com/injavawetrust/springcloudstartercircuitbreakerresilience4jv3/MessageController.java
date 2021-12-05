package com.injavawetrust.springcloudstartercircuitbreakerresilience4jv3;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    //  io.github.resilience4j.circuitbreaker.CircuitBreaker
    private final CircuitBreaker circuitBreaker;

    @GetMapping("/greeting")
    public String greeting() {
        return circuitBreaker.decorateSupplier(() -> messageService.getMessage("type")).get();
    }
}
