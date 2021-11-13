package com.injavawetrust.organizationservice.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Organization {

    String id;

    String name;

    String contactName;

    String contactEmail;

    String contactPhone;
}
