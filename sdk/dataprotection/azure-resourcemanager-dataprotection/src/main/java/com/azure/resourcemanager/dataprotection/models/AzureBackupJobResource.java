// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupJobResourceInner;

/**
 * An immutable client-side representation of AzureBackupJobResource.
 */
public interface AzureBackupJobResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: AzureBackupJobResource properties.
     * 
     * @return the properties value.
     */
    AzureBackupJob properties();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupJobResourceInner object.
     * 
     * @return the inner object.
     */
    AzureBackupJobResourceInner innerModel();
}
