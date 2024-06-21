// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for StorageAccounts List.
 */
public final class StorageAccountsListSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/StorageAccountList.json
     */
    /**
     * Sample code: StorageAccountList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts().manager().serviceClient().getStorageAccounts().list(com.azure.core.util.Context.NONE);
    }
}
