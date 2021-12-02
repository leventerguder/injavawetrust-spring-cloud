package com.injavawetrust.licenseservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CallNotPermittedExceptionResponse {

    private String message;

    private String causingCircuitBreakerName;

}
