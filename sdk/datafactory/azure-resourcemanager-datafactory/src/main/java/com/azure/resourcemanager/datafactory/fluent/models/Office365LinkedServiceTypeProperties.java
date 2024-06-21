// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Office365 linked service properties.
 */
@Fluent
public final class Office365LinkedServiceTypeProperties {
    /*
     * Azure tenant ID to which the Office 365 account belongs. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "office365TenantId", required = true)
    private Object office365TenantId;

    /*
     * Specify the tenant information under which your Azure AD web application resides. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "servicePrincipalTenantId", required = true)
    private Object servicePrincipalTenantId;

    /*
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId", required = true)
    private Object servicePrincipalId;

    /*
     * Specify the application's key.
     */
    @JsonProperty(value = "servicePrincipalKey", required = true)
    private SecretBase servicePrincipalKey;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of Office365LinkedServiceTypeProperties class.
     */
    public Office365LinkedServiceTypeProperties() {
    }

    /**
     * Get the office365TenantId property: Azure tenant ID to which the Office 365 account belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the office365TenantId value.
     */
    public Object office365TenantId() {
        return this.office365TenantId;
    }

    /**
     * Set the office365TenantId property: Azure tenant ID to which the Office 365 account belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param office365TenantId the office365TenantId value to set.
     * @return the Office365LinkedServiceTypeProperties object itself.
     */
    public Office365LinkedServiceTypeProperties withOffice365TenantId(Object office365TenantId) {
        this.office365TenantId = office365TenantId;
        return this;
    }

    /**
     * Get the servicePrincipalTenantId property: Specify the tenant information under which your Azure AD web
     * application resides. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalTenantId value.
     */
    public Object servicePrincipalTenantId() {
        return this.servicePrincipalTenantId;
    }

    /**
     * Set the servicePrincipalTenantId property: Specify the tenant information under which your Azure AD web
     * application resides. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalTenantId the servicePrincipalTenantId value to set.
     * @return the Office365LinkedServiceTypeProperties object itself.
     */
    public Office365LinkedServiceTypeProperties withServicePrincipalTenantId(Object servicePrincipalTenantId) {
        this.servicePrincipalTenantId = servicePrincipalTenantId;
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the Office365LinkedServiceTypeProperties object itself.
     */
    public Office365LinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the application's key.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: Specify the application's key.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the Office365LinkedServiceTypeProperties object itself.
     */
    public Office365LinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the Office365LinkedServiceTypeProperties object itself.
     */
    public Office365LinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (office365TenantId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property office365TenantId in model Office365LinkedServiceTypeProperties"));
        }
        if (servicePrincipalTenantId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property servicePrincipalTenantId in model Office365LinkedServiceTypeProperties"));
        }
        if (servicePrincipalId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property servicePrincipalId in model Office365LinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property servicePrincipalKey in model Office365LinkedServiceTypeProperties"));
        } else {
            servicePrincipalKey().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Office365LinkedServiceTypeProperties.class);
}
