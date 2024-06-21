// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Integration runtime status.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = IntegrationRuntimeStatus.class,
    visible = true)
@JsonTypeName("IntegrationRuntimeStatus")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Managed", value = ManagedIntegrationRuntimeStatus.class),
    @JsonSubTypes.Type(name = "SelfHosted", value = SelfHostedIntegrationRuntimeStatus.class) })
@Fluent
public class IntegrationRuntimeStatus {
    /*
     * Type of integration runtime.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private IntegrationRuntimeType type = IntegrationRuntimeType.fromString("IntegrationRuntimeStatus");

    /*
     * The data factory name which the integration runtime belong to.
     */
    @JsonProperty(value = "dataFactoryName", access = JsonProperty.Access.WRITE_ONLY)
    private String dataFactoryName;

    /*
     * The state of integration runtime.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeState state;

    /*
     * Integration runtime status.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of IntegrationRuntimeStatus class.
     */
    public IntegrationRuntimeStatus() {
    }

    /**
     * Get the type property: Type of integration runtime.
     * 
     * @return the type value.
     */
    public IntegrationRuntimeType type() {
        return this.type;
    }

    /**
     * Get the dataFactoryName property: The data factory name which the integration runtime belong to.
     * 
     * @return the dataFactoryName value.
     */
    public String dataFactoryName() {
        return this.dataFactoryName;
    }

    /**
     * Get the state property: The state of integration runtime.
     * 
     * @return the state value.
     */
    public IntegrationRuntimeState state() {
        return this.state;
    }

    /**
     * Get the additionalProperties property: Integration runtime status.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Integration runtime status.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeStatus object itself.
     */
    public IntegrationRuntimeStatus withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new LinkedHashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
