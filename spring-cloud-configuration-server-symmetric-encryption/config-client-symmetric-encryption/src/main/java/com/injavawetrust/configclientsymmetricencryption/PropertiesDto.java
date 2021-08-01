package com.injavawetrust.configclientsymmetricencryption;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "example")
@Getter
@Setter
@Component
public class PropertiesDto {

    private String key1;

    private String key2;

    private String key3;

}
