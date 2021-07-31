package com.injavawetrust.configclientvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Value("${example.key1}")
    private String key1;

    @GetMapping
    public String getMessage() {
        return key1;
    }
}
