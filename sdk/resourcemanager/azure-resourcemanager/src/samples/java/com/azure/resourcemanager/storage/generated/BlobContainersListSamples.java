// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.models.ListContainersInclude;

/**
 * Samples for BlobContainers List.
 */
public final class BlobContainersListSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/BlobContainersList.json
     */
    /**
     * Sample code: ListContainers.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listContainers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .list("res9290", "sto1590", null, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/DeletedBlobContainersList.
     * json
     */
    /**
     * Sample code: ListDeletedContainers.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDeletedContainers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .list("res9290", "sto1590", null, null, ListContainersInclude.DELETED, com.azure.core.util.Context.NONE);
    }
}
