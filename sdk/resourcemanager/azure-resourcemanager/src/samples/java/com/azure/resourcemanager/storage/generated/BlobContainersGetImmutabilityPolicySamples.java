// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for BlobContainers GetImmutabilityPolicy.
 */
public final class BlobContainersGetImmutabilityPolicySamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/
     * BlobContainersGetImmutabilityPolicy.json
     */
    /**
     * Sample code: GetImmutabilityPolicy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getImmutabilityPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .getImmutabilityPolicyWithResponse("res5221", "sto9177", "container3489", null,
                com.azure.core.util.Context.NONE);
    }
}
