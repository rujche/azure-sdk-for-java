// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/** Samples for WorkloadNetworks DeleteDhcp. */
public final class WorkloadNetworksDeleteDhcpSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/WorkloadNetworks_DeleteDhcpConfigurations.json
     */
    /**
     * Sample code: WorkloadNetworks_DeleteDhcp.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksDeleteDhcp(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().deleteDhcp("group1", "cloud1", "dhcp1", com.azure.core.util.Context.NONE);
    }
}
