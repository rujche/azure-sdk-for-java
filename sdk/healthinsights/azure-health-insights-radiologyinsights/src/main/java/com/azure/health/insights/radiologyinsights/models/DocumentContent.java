// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The content of the patient document.
 */
@Immutable
public final class DocumentContent {

    /*
     * The type of the content's source.
     * In case the source type is 'inline', the content is given as a string (for instance, text).
     * In case the source type is 'reference', the content is given as a URI.
     */
    @Generated
    @JsonProperty(value = "sourceType")
    private DocumentContentSourceType sourceType;

    /*
     * The content of the document, given either inline (as a string) or as a reference (URI).
     */
    @Generated
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of DocumentContent class.
     *
     * @param sourceType the sourceType value to set.
     * @param value the value value to set.
     */
    @Generated
    @JsonCreator
    public DocumentContent(@JsonProperty(value = "sourceType") DocumentContentSourceType sourceType,
        @JsonProperty(value = "value") String value) {
        this.sourceType = sourceType;
        this.value = value;
    }

    /**
     * Get the sourceType property: The type of the content's source.
     * In case the source type is 'inline', the content is given as a string (for instance, text).
     * In case the source type is 'reference', the content is given as a URI.
     *
     * @return the sourceType value.
     */
    @Generated
    public DocumentContentSourceType getSourceType() {
        return this.sourceType;
    }

    /**
     * Get the value property: The content of the document, given either inline (as a string) or as a reference (URI).
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }
}
