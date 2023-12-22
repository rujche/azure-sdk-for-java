// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IdentityDetails model.
 */
@Fluent
public final class IdentityDetails {
    /*
     * Specifies if the BI is protected by System Identity.
     */
    @JsonProperty(value = "useSystemAssignedIdentity")
    private Boolean useSystemAssignedIdentity;

    /*
     * ARM URL for User Assigned Identity.
     */
    @JsonProperty(value = "userAssignedIdentityArmUrl")
    private String userAssignedIdentityArmUrl;

    /**
     * Creates an instance of IdentityDetails class.
     */
    public IdentityDetails() {
    }

    /**
     * Get the useSystemAssignedIdentity property: Specifies if the BI is protected by System Identity.
     * 
     * @return the useSystemAssignedIdentity value.
     */
    public Boolean useSystemAssignedIdentity() {
        return this.useSystemAssignedIdentity;
    }

    /**
     * Set the useSystemAssignedIdentity property: Specifies if the BI is protected by System Identity.
     * 
     * @param useSystemAssignedIdentity the useSystemAssignedIdentity value to set.
     * @return the IdentityDetails object itself.
     */
    public IdentityDetails withUseSystemAssignedIdentity(Boolean useSystemAssignedIdentity) {
        this.useSystemAssignedIdentity = useSystemAssignedIdentity;
        return this;
    }

    /**
     * Get the userAssignedIdentityArmUrl property: ARM URL for User Assigned Identity.
     * 
     * @return the userAssignedIdentityArmUrl value.
     */
    public String userAssignedIdentityArmUrl() {
        return this.userAssignedIdentityArmUrl;
    }

    /**
     * Set the userAssignedIdentityArmUrl property: ARM URL for User Assigned Identity.
     * 
     * @param userAssignedIdentityArmUrl the userAssignedIdentityArmUrl value to set.
     * @return the IdentityDetails object itself.
     */
    public IdentityDetails withUserAssignedIdentityArmUrl(String userAssignedIdentityArmUrl) {
        this.userAssignedIdentityArmUrl = userAssignedIdentityArmUrl;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
