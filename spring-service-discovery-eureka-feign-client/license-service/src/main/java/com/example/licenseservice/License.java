package com.example.licenseservice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class License {

    private String licenseId;

    private String description;

    private String organizationId;

    private String productName;

    private String licenseType;

    private String comment;

    private String organizationName;

    private String contactName;

    private String contactPhone;

    private String contactEmail;
}
