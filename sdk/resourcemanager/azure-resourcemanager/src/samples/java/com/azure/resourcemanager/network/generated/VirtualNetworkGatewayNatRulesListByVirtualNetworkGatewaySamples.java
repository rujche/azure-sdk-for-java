// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGatewayNatRules ListByVirtualNetworkGateway. */
public final class VirtualNetworkGatewayNatRulesListByVirtualNetworkGatewaySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualNetworkGatewayNatRuleList.json
     */
    /**
     * Sample code: VirtualNetworkGatewayNatRuleList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualNetworkGatewayNatRuleList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayNatRules()
            .listByVirtualNetworkGateway("rg1", "gateway1", Context.NONE);
    }
}
