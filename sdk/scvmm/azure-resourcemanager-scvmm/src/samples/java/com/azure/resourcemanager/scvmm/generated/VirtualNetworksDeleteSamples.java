// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.resourcemanager.scvmm.models.ForceDelete;

/**
 * Samples for VirtualNetworks Delete.
 */
public final class VirtualNetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualNetworks_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualNetworks_Delete_MaximumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualNetworksDeleteMaximumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualNetworks().delete("rgscvmm", ".", ForceDelete.TRUE, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualNetworks_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualNetworks_Delete_MinimumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualNetworksDeleteMinimumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualNetworks().delete("rgscvmm", "1", null, com.azure.core.util.Context.NONE);
    }
}
