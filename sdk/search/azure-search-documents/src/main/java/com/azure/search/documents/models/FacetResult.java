// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * A single bucket of a facet query result. Reports the number of documents with a field value falling within a
 * particular range or having a particular value or interval.
 */
@Fluent
public final class FacetResult {
    /*
     * The approximate count of documents falling within the bucket described by this facet.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Long count;

    /*
     * A single bucket of a facet query result. Reports the number of documents with a field value falling within a
     * particular range or having a particular value or interval.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of FacetResult class. */
    public FacetResult() {}

    /**
     * Get the count property: The approximate count of documents falling within the bucket described by this facet.
     *
     * @return the count value.
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the additionalProperties property: A single bucket of a facet query result. Reports the number of documents
     * with a field value falling within a particular range or having a particular value or interval.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A single bucket of a facet query result. Reports the number of documents
     * with a field value falling within a particular range or having a particular value or interval.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the FacetResult object itself.
     */
    public FacetResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
