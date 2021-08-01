package com.injavawetrust.configclientsymmetricencryption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
