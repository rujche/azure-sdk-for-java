// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for PlacementPolicies Get.
 */
public final class PlacementPoliciesGetSamples {
    /*
     * x-ms-original-file:
     * specification/vmware/resource-manager/Microsoft.AVS/stable/2023-09-01/examples/PlacementPolicies_Get.json
     */
    /**
     * Sample code: PlacementPolicies_Get.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void placementPoliciesGet(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.placementPolicies()
            .getWithResponse("group1", "cloud1", "cluster1", "policy1", com.azure.core.util.Context.NONE);
    }
}
