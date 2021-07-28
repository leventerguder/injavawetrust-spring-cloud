package com.injavawetrust.config.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/configs")
public class ConfigController {

    @Autowired
    private PropertiesDto propertiesDto;

    @GetMapping()
    public PropertiesDto getPropertiesDto() {
        return propertiesDto;
    }

}
