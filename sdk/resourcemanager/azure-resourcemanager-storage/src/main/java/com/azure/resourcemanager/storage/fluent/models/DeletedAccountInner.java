// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deleted storage account.
 */
@Immutable
public final class DeletedAccountInner extends ProxyResource {
    /*
     * Properties of the deleted account.
     */
    @JsonProperty(value = "properties")
    private DeletedAccountProperties innerProperties;

    /**
     * Creates an instance of DeletedAccountInner class.
     */
    public DeletedAccountInner() {
    }

    /**
     * Get the innerProperties property: Properties of the deleted account.
     * 
     * @return the innerProperties value.
     */
    private DeletedAccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the storageAccountResourceId property: Full resource id of the original storage account.
     * 
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountResourceId();
    }

    /**
     * Get the location property: Location of the deleted account.
     * 
     * @return the location value.
     */
    public String location() {
        return this.innerProperties() == null ? null : this.innerProperties().location();
    }

    /**
     * Get the restoreReference property: Can be used to attempt recovering this deleted account via PutStorageAccount
     * API.
     * 
     * @return the restoreReference value.
     */
    public String restoreReference() {
        return this.innerProperties() == null ? null : this.innerProperties().restoreReference();
    }

    /**
     * Get the creationTime property: Creation time of the deleted account.
     * 
     * @return the creationTime value.
     */
    public String creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Get the deletionTime property: Deletion time of the deleted account.
     * 
     * @return the deletionTime value.
     */
    public String deletionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().deletionTime();
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
