// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tag. */
@Fluent
public final class TagAttributesTag {
    /*
     * SignatureRecord value
     */
    @JsonProperty(value = "signatureRecord")
    private String signatureRecord;

    /** Creates an instance of TagAttributesTag class. */
    public TagAttributesTag() {}

    /**
     * Get the signatureRecord property: SignatureRecord value.
     *
     * @return the signatureRecord value.
     */
    public String getSignatureRecord() {
        return this.signatureRecord;
    }

    /**
     * Set the signatureRecord property: SignatureRecord value.
     *
     * @param signatureRecord the signatureRecord value to set.
     * @return the TagAttributesTag object itself.
     */
    public TagAttributesTag setSignatureRecord(String signatureRecord) {
        this.signatureRecord = signatureRecord;
        return this;
    }
}
