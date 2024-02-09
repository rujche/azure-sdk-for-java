// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.models.ManagedClusterAadProfile;

/**
 * Samples for ManagedClusters ResetAadProfile.
 */
public final class ManagedClustersResetAadProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-11-01/examples/
     * ManagedClustersResetAADProfile.json
     */
    /**
     * Sample code: Reset AAD Profile.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resetAADProfile(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters().manager().serviceClient().getManagedClusters().resetAadProfile("rg1", "clustername1",
            new ManagedClusterAadProfile().withClientAppId("clientappid").withServerAppId("serverappid")
                .withServerAppSecret("fakeTokenPlaceholder").withTenantId("tenantid"),
            com.azure.core.util.Context.NONE);
    }
}
