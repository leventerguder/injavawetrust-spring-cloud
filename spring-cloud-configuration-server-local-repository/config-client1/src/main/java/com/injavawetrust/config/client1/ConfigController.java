package com.injavawetrust.config.client1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configs")
public class ConfigController {

    private final PropertiesDto propertiesDto;

    public ConfigController(PropertiesDto propertiesDto) {
        this.propertiesDto = propertiesDto;
    }

    @GetMapping()
    public PropertiesDto getPropertiesDto() {
        return propertiesDto;
    }
}
