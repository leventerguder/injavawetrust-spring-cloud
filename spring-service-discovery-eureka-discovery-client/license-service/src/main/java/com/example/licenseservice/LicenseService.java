package com.example.licenseservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LicenseService {

    private final OrganizationDiscoveryClient organizationDiscoveryClient;

    public License getLicense(String licenseId, String organizationId) {

        License license = new License();
        license.setDescription("license-description");
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setProductName("license-product");
        license.setDescription("license-desc");
        license.setLicenseType("license-type");
        license.setComment("license-comment");

        Organization organization = retrieveOrganizationInfo("organization-id");
        license.setOrganizationName(organization.getName());
        license.setContactName(organization.getContactName());
        license.setContactEmail(organization.getContactEmail());
        license.setContactPhone(organization.getContactPhone());

        return license;
    }

    private Organization retrieveOrganizationInfo(String organizationId) {
        return organizationDiscoveryClient.getOrganization(organizationId);
    }
}
