// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for HubRouteTables Get. */
public final class HubRouteTablesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/HubRouteTableGet.json
     */
    /**
     * Sample code: RouteTableGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeTableGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getHubRouteTables()
            .getWithResponse("rg1", "virtualHub1", "hubRouteTable1", Context.NONE);
    }
}
