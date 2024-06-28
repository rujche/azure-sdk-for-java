// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for WorkloadNetworks GetSegment.
 */
public final class WorkloadNetworksGetSegmentSamples {
    /*
     * x-ms-original-file:
     * specification/vmware/resource-manager/Microsoft.AVS/stable/2023-09-01/examples/WorkloadNetworks_GetSegment.json
     */
    /**
     * Sample code: WorkloadNetworks_GetSegment.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksGetSegment(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks()
            .getSegmentWithResponse("group1", "cloud1", "segment1", com.azure.core.util.Context.NONE);
    }
}
