package com.injavawetrust.licenseservice;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(CallNotPermittedException.class)
    protected ResponseEntity<Object> handleHttpMessageNotReadable(CallNotPermittedException ex) {

        ex.printStackTrace();

        CallNotPermittedExceptionResponse response = new CallNotPermittedExceptionResponse(ex.getMessage(), ex.getCausingCircuitBreakerName());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
