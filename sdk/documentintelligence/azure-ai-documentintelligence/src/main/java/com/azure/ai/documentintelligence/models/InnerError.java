// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing more specific information about the error.
 */
@Immutable
public final class InnerError {
    /*
     * One of a server-defined set of error codes.
     */
    @Generated
    @JsonProperty(value = "code")
    private String code;

    /*
     * A human-readable representation of the error.
     */
    @Generated
    @JsonProperty(value = "message")
    private String message;

    /*
     * Inner error.
     */
    @Generated
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Creates an instance of InnerError class.
     */
    @Generated
    private InnerError() {
    }

    /**
     * Get the code property: One of a server-defined set of error codes.
     * 
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     * 
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the innererror property: Inner error.
     * 
     * @return the innererror value.
     */
    @Generated
    public InnerError getInnererror() {
        return this.innererror;
    }
}
