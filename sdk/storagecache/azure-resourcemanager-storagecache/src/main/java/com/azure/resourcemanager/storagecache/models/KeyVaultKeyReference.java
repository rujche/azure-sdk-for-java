// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a reference to Key Vault Key. */
@Fluent
public final class KeyVaultKeyReference {
    /*
     * The URL referencing a key encryption key in Key Vault.
     */
    @JsonProperty(value = "keyUrl", required = true)
    private String keyUrl;

    /*
     * Describes a resource Id to source Key Vault.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private KeyVaultKeyReferenceSourceVault sourceVault;

    /** Creates an instance of KeyVaultKeyReference class. */
    public KeyVaultKeyReference() {
    }

    /**
     * Get the keyUrl property: The URL referencing a key encryption key in Key Vault.
     *
     * @return the keyUrl value.
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set the keyUrl property: The URL referencing a key encryption key in Key Vault.
     *
     * @param keyUrl the keyUrl value to set.
     * @return the KeyVaultKeyReference object itself.
     */
    public KeyVaultKeyReference withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
        return this;
    }

    /**
     * Get the sourceVault property: Describes a resource Id to source Key Vault.
     *
     * @return the sourceVault value.
     */
    public KeyVaultKeyReferenceSourceVault sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: Describes a resource Id to source Key Vault.
     *
     * @param sourceVault the sourceVault value to set.
     * @return the KeyVaultKeyReference object itself.
     */
    public KeyVaultKeyReference withSourceVault(KeyVaultKeyReferenceSourceVault sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyUrl() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyUrl in model KeyVaultKeyReference"));
        }
        if (sourceVault() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceVault in model KeyVaultKeyReference"));
        } else {
            sourceVault().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultKeyReference.class);
}
