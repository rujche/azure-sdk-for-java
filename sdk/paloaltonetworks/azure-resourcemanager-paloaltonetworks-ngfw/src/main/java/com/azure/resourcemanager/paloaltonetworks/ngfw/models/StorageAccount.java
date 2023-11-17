// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage Account configurations.
 */
@Fluent
public final class StorageAccount {
    /*
     * Resource ID of storage account
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Subscription Id
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * Storage account name
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /**
     * Creates an instance of StorageAccount class.
     */
    public StorageAccount() {
    }

    /**
     * Get the id property: Resource ID of storage account.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID of storage account.
     * 
     * @param id the id value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription Id.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription Id.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the accountName property: Storage account name.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Storage account name.
     * 
     * @param accountName the accountName value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
