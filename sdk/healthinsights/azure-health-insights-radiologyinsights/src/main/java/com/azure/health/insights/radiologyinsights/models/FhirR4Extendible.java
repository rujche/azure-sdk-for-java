// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Procedure information.
 */
@Fluent
public final class FhirR4Extendible {

    /*
     * Additional Content defined by implementations
     */
    @Generated
    @JsonProperty(value = "extension")
    private List<FhirR4Extension> extension;

    /*
     * Procedure code
     */
    @Generated
    @JsonProperty(value = "code")
    private FhirR4CodeableConcept code;

    /*
     * Procedure description
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of FhirR4Extendible class.
     */
    @Generated
    public FhirR4Extendible() {
    }

    /**
     * Get the extension property: Additional Content defined by implementations.
     *
     * @return the extension value.
     */
    @Generated
    public List<FhirR4Extension> getExtension() {
        return this.extension;
    }

    /**
     * Set the extension property: Additional Content defined by implementations.
     *
     * @param extension the extension value to set.
     * @return the FhirR4Extendible object itself.
     */
    @Generated
    public FhirR4Extendible setExtension(List<FhirR4Extension> extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Get the code property: Procedure code.
     *
     * @return the code value.
     */
    @Generated
    public FhirR4CodeableConcept getCode() {
        return this.code;
    }

    /**
     * Set the code property: Procedure code.
     *
     * @param code the code value to set.
     * @return the FhirR4Extendible object itself.
     */
    @Generated
    public FhirR4Extendible setCode(FhirR4CodeableConcept code) {
        this.code = code;
        return this;
    }

    /**
     * Get the description property: Procedure description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Procedure description.
     *
     * @param description the description value to set.
     * @return the FhirR4Extendible object itself.
     */
    @Generated
    public FhirR4Extendible setDescription(String description) {
        this.description = description;
        return this;
    }
}
