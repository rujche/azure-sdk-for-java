// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for DeletedAccounts List.
 */
public final class DeletedAccountsListSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/DeletedAccountList.json
     */
    /**
     * Sample code: DeletedAccountList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletedAccountList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts().manager().serviceClient().getDeletedAccounts().list(com.azure.core.util.Context.NONE);
    }
}
