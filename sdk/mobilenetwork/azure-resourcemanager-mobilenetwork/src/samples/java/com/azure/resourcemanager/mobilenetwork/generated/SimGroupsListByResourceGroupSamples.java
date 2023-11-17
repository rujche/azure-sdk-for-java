// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for SimGroups ListByResourceGroup. */
public final class SimGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2023-09-01/examples/SimGroupListByResourceGroup.json
     */
    /**
     * Sample code: List SIM groups in a resource group.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listSIMGroupsInAResourceGroup(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.simGroups().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
