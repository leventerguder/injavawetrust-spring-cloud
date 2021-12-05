package com.injavawetrust.springcloudstartercircuitbreakerresilience4jv2;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class CircuitBreakerConfiguration {

    /*
     we're going to define a global configuration for all circuit breakers.
     For this reason, we need to define a Customizer<CircuitBreakerFactory> bean.
     So let's use the Resilience4JCircuitBreakerFactory implementation.
     */

    @Bean
    public Customizer<Resilience4JCircuitBreakerFactory> customizer() {

        CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED)
                .slidingWindowSize(15)
                .minimumNumberOfCalls(8)
                .waitDurationInOpenState(Duration.ofSeconds(10))
                .build();

        Customizer<Resilience4JCircuitBreakerFactory> customizer = factory ->
                factory.configure(builder -> builder.circuitBreakerConfig(circuitBreakerConfig), "coolCircuitBreaker");

        System.out.println("Customizer<Resilience4JCircuitBreakerFactory> is created.");

        return customizer;
    }
}

