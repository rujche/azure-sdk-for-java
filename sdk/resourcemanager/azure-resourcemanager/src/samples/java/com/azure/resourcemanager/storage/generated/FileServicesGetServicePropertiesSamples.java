// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for FileServices GetServiceProperties.
 */
public final class FileServicesGetServicePropertiesSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/FileServicesGet.json
     */
    /**
     * Sample code: GetFileServices.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getFileServices(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getFileServices()
            .getServicePropertiesWithResponse("res4410", "sto8607", com.azure.core.util.Context.NONE);
    }
}
