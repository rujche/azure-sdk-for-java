// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.fluent.models.ClientEncryptionKeyCreateUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to create and update ClientEncryptionKey.
 */
@Fluent
public final class ClientEncryptionKeyCreateUpdateParameters {
    /*
     * Properties to create and update ClientEncryptionKey.
     */
    @JsonProperty(value = "properties", required = true)
    private ClientEncryptionKeyCreateUpdateProperties innerProperties = new ClientEncryptionKeyCreateUpdateProperties();

    /**
     * Creates an instance of ClientEncryptionKeyCreateUpdateParameters class.
     */
    public ClientEncryptionKeyCreateUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties to create and update ClientEncryptionKey.
     * 
     * @return the innerProperties value.
     */
    private ClientEncryptionKeyCreateUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resource property: The standard JSON format of a ClientEncryptionKey.
     * 
     * @return the resource value.
     */
    public ClientEncryptionKeyResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a ClientEncryptionKey.
     * 
     * @param resource the resource value to set.
     * @return the ClientEncryptionKeyCreateUpdateParameters object itself.
     */
    public ClientEncryptionKeyCreateUpdateParameters withResource(ClientEncryptionKeyResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientEncryptionKeyCreateUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model ClientEncryptionKeyCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClientEncryptionKeyCreateUpdateParameters.class);
}
