package com.injavawetrust.springcloudstartercircuitbreakerresilience4jv3;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

@Service
public class MessageService {

    public String getMessage(String type) {
        throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "This is a remote exception");
    }
}
