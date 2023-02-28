// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for Snapshots Delete. */
public final class SnapshotsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-01-01/examples/SnapshotsDelete.json
     */
    /**
     * Sample code: Delete Snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteSnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getSnapshots()
            .deleteWithResponse("rg1", "snapshot1", com.azure.core.util.Context.NONE);
    }
}
