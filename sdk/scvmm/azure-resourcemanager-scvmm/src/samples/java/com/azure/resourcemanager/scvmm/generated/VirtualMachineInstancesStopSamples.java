// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.resourcemanager.scvmm.models.SkipShutdown;
import com.azure.resourcemanager.scvmm.models.StopVirtualMachineOptions;

/**
 * Samples for VirtualMachineInstances Stop.
 */
public final class VirtualMachineInstancesStopSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualMachineInstances_Stop_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineInstances_Stop_MaximumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualMachineInstancesStopMaximumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachineInstances()
            .stop("gtgclehcbsyave", new StopVirtualMachineOptions().withSkipShutdown(SkipShutdown.TRUE),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualMachineInstances_Stop_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineInstances_Stop_MinimumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualMachineInstancesStopMinimumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachineInstances()
            .stop("gtgclehcbsyave", new StopVirtualMachineOptions(), com.azure.core.util.Context.NONE);
    }
}
