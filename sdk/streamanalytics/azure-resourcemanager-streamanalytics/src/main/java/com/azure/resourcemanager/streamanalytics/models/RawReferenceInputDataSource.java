// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.RawInputDatasourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a raw input data source that contains reference data. This data source type is only applicable/usable when
 * using the query testing API. You cannot create a job with this data source type or add an input of this data source
 * type to an existing job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Raw")
@Fluent
public final class RawReferenceInputDataSource extends ReferenceInputDataSource {
    /*
     * The properties that are associated with a raw input containing reference data. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties")
    private RawInputDatasourceProperties innerProperties;

    /**
     * Creates an instance of RawReferenceInputDataSource class.
     */
    public RawReferenceInputDataSource() {
    }

    /**
     * Get the innerProperties property: The properties that are associated with a raw input containing reference data.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    private RawInputDatasourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the payload property: The JSON serialized content of the input data. Either payload or payloadUri must be
     * set, but not both.
     * 
     * @return the payload value.
     */
    public String payload() {
        return this.innerProperties() == null ? null : this.innerProperties().payload();
    }

    /**
     * Set the payload property: The JSON serialized content of the input data. Either payload or payloadUri must be
     * set, but not both.
     * 
     * @param payload the payload value to set.
     * @return the RawReferenceInputDataSource object itself.
     */
    public RawReferenceInputDataSource withPayload(String payload) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RawInputDatasourceProperties();
        }
        this.innerProperties().withPayload(payload);
        return this;
    }

    /**
     * Get the payloadUri property: The SAS URL to a blob containing the JSON serialized content of the input data.
     * Either payload or payloadUri must be set, but not both.
     * 
     * @return the payloadUri value.
     */
    public String payloadUri() {
        return this.innerProperties() == null ? null : this.innerProperties().payloadUri();
    }

    /**
     * Set the payloadUri property: The SAS URL to a blob containing the JSON serialized content of the input data.
     * Either payload or payloadUri must be set, but not both.
     * 
     * @param payloadUri the payloadUri value to set.
     * @return the RawReferenceInputDataSource object itself.
     */
    public RawReferenceInputDataSource withPayloadUri(String payloadUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RawInputDatasourceProperties();
        }
        this.innerProperties().withPayloadUri(payloadUri);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
