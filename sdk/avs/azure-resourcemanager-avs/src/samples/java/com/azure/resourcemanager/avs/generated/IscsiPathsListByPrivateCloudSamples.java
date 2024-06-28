// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for IscsiPaths ListByPrivateCloud.
 */
public final class IscsiPathsListByPrivateCloudSamples {
    /*
     * x-ms-original-file:
     * specification/vmware/resource-manager/Microsoft.AVS/stable/2023-09-01/examples/IscsiPaths_List.json
     */
    /**
     * Sample code: IscsiPaths_ListByPrivateCloud.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void iscsiPathsListByPrivateCloud(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.iscsiPaths().listByPrivateCloud("group1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
