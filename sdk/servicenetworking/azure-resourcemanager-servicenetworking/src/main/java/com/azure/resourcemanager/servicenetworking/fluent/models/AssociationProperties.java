// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicenetworking.models.AssociationSubnet;
import com.azure.resourcemanager.servicenetworking.models.AssociationType;
import com.azure.resourcemanager.servicenetworking.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Association Properties. */
@Fluent
public final class AssociationProperties {
    /*
     * Association Type
     */
    @JsonProperty(value = "associationType", required = true)
    private AssociationType associationType;

    /*
     * Association Subnet
     */
    @JsonProperty(value = "subnet")
    private AssociationSubnet subnet;

    /*
     * Provisioning State
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of AssociationProperties class. */
    public AssociationProperties() {
    }

    /**
     * Get the associationType property: Association Type.
     *
     * @return the associationType value.
     */
    public AssociationType associationType() {
        return this.associationType;
    }

    /**
     * Set the associationType property: Association Type.
     *
     * @param associationType the associationType value to set.
     * @return the AssociationProperties object itself.
     */
    public AssociationProperties withAssociationType(AssociationType associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * Get the subnet property: Association Subnet.
     *
     * @return the subnet value.
     */
    public AssociationSubnet subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Association Subnet.
     *
     * @param subnet the subnet value to set.
     * @return the AssociationProperties object itself.
     */
    public AssociationProperties withSubnet(AssociationSubnet subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning State.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (associationType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property associationType in model AssociationProperties"));
        }
        if (subnet() != null) {
            subnet().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssociationProperties.class);
}
