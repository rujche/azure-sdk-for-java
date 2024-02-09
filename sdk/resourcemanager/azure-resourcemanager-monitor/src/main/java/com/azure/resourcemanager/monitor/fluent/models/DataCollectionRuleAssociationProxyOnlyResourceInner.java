// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.monitor.models.DataCollectionRuleAssociationMetadata;
import com.azure.resourcemanager.monitor.models.KnownDataCollectionRuleAssociationProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of generic ARM proxy resource.
 */
@Fluent
public final class DataCollectionRuleAssociationProxyOnlyResourceInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private DataCollectionRuleAssociationProxyOnlyResourceProperties innerProperties;

    /*
     * Resource entity tag (ETag).
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of DataCollectionRuleAssociationProxyOnlyResourceInner class.
     */
    public DataCollectionRuleAssociationProxyOnlyResourceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private DataCollectionRuleAssociationProxyOnlyResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Resource entity tag (ETag).
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: Description of the association.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the association.
     * 
     * @param description the description value to set.
     * @return the DataCollectionRuleAssociationProxyOnlyResourceInner object itself.
     */
    public DataCollectionRuleAssociationProxyOnlyResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataCollectionRuleAssociationProxyOnlyResourceProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the dataCollectionRuleId property: The resource ID of the data collection rule that is to be associated.
     * 
     * @return the dataCollectionRuleId value.
     */
    public String dataCollectionRuleId() {
        return this.innerProperties() == null ? null : this.innerProperties().dataCollectionRuleId();
    }

    /**
     * Set the dataCollectionRuleId property: The resource ID of the data collection rule that is to be associated.
     * 
     * @param dataCollectionRuleId the dataCollectionRuleId value to set.
     * @return the DataCollectionRuleAssociationProxyOnlyResourceInner object itself.
     */
    public DataCollectionRuleAssociationProxyOnlyResourceInner withDataCollectionRuleId(String dataCollectionRuleId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataCollectionRuleAssociationProxyOnlyResourceProperties();
        }
        this.innerProperties().withDataCollectionRuleId(dataCollectionRuleId);
        return this;
    }

    /**
     * Get the dataCollectionEndpointId property: The resource ID of the data collection endpoint that is to be
     * associated.
     * 
     * @return the dataCollectionEndpointId value.
     */
    public String dataCollectionEndpointId() {
        return this.innerProperties() == null ? null : this.innerProperties().dataCollectionEndpointId();
    }

    /**
     * Set the dataCollectionEndpointId property: The resource ID of the data collection endpoint that is to be
     * associated.
     * 
     * @param dataCollectionEndpointId the dataCollectionEndpointId value to set.
     * @return the DataCollectionRuleAssociationProxyOnlyResourceInner object itself.
     */
    public DataCollectionRuleAssociationProxyOnlyResourceInner
        withDataCollectionEndpointId(String dataCollectionEndpointId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataCollectionRuleAssociationProxyOnlyResourceProperties();
        }
        this.innerProperties().withDataCollectionEndpointId(dataCollectionEndpointId);
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public KnownDataCollectionRuleAssociationProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the metadata property: Metadata about the resource.
     * 
     * @return the metadata value.
     */
    public DataCollectionRuleAssociationMetadata metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
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
