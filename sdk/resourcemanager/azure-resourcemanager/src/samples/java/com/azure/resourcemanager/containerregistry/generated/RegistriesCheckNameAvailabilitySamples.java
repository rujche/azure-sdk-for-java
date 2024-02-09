// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.RegistryNameCheckRequest;

/**
 * Samples for Registries CheckNameAvailability.
 */
public final class RegistriesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/
     * RegistryCheckNameAvailable.json
     */
    /**
     * Sample code: RegistryCheckNameAvailable.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryCheckNameAvailable(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getRegistries().checkNameAvailabilityWithResponse(
            new RegistryNameCheckRequest().withName("myRegistry"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/
     * RegistryCheckNameNotAvailable.json
     */
    /**
     * Sample code: RegistryCheckNameNotAvailable.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryCheckNameNotAvailable(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getRegistries().checkNameAvailabilityWithResponse(
            new RegistryNameCheckRequest().withName("myRegistry"), com.azure.core.util.Context.NONE);
    }
}
