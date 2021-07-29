package com.injavawetrust.configclientgit;

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

    private String key4;

    private String key5;

    private String key6;
}
