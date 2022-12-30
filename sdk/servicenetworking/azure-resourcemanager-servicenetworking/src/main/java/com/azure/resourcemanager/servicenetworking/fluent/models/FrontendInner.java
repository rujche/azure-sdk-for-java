// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.servicenetworking.models.FrontendIpAddressVersion;
import com.azure.resourcemanager.servicenetworking.models.FrontendMode;
import com.azure.resourcemanager.servicenetworking.models.FrontendPropertiesIpAddress;
import com.azure.resourcemanager.servicenetworking.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Frontend Subresource of Traffic Controller. */
@Fluent
public final class FrontendInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private FrontendProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of FrontendInner class. */
    public FrontendInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     *
     * @return the innerProperties value.
     */
    private FrontendProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public FrontendInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontendInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the mode property: Frontend Mode (Optional).
     *
     * @return the mode value.
     */
    public FrontendMode mode() {
        return this.innerProperties() == null ? null : this.innerProperties().mode();
    }

    /**
     * Set the mode property: Frontend Mode (Optional).
     *
     * @param mode the mode value to set.
     * @return the FrontendInner object itself.
     */
    public FrontendInner withMode(FrontendMode mode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendProperties();
        }
        this.innerProperties().withMode(mode);
        return this;
    }

    /**
     * Get the ipAddressVersion property: Frontend IP Address Version (Optional).
     *
     * @return the ipAddressVersion value.
     */
    public FrontendIpAddressVersion ipAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddressVersion();
    }

    /**
     * Set the ipAddressVersion property: Frontend IP Address Version (Optional).
     *
     * @param ipAddressVersion the ipAddressVersion value to set.
     * @return the FrontendInner object itself.
     */
    public FrontendInner withIpAddressVersion(FrontendIpAddressVersion ipAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendProperties();
        }
        this.innerProperties().withIpAddressVersion(ipAddressVersion);
        return this;
    }

    /**
     * Get the publicIpAddress property: Frontend Public IP Address (Optional).
     *
     * @return the publicIpAddress value.
     */
    public FrontendPropertiesIpAddress publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: Frontend Public IP Address (Optional).
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the FrontendInner object itself.
     */
    public FrontendInner withPublicIpAddress(FrontendPropertiesIpAddress publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendProperties();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: test doc.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
