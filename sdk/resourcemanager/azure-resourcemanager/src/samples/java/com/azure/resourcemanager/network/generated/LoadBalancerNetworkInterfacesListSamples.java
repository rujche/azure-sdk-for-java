// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for LoadBalancerNetworkInterfaces List. */
public final class LoadBalancerNetworkInterfacesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerNetworkInterfaceListVmss.json
     */
    /**
     * Sample code: LoadBalancerNetworkInterfaceListVmss.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerNetworkInterfaceListVmss(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancerNetworkInterfaces()
            .list("testrg", "lb", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerNetworkInterfaceListSimple.json
     */
    /**
     * Sample code: LoadBalancerNetworkInterfaceListSimple.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerNetworkInterfaceListSimple(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancerNetworkInterfaces()
            .list("testrg", "lb", Context.NONE);
    }
}
