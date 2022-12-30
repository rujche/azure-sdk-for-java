// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGatewayWafDynamicManifestsDefault Get. */
public final class ApplicationGatewayWafDynamicManifestsDefaultGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/GetApplicationGatewayWafDynamicManifestsDefault.json
     */
    /**
     * Sample code: Gets WAF default manifest.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsWAFDefaultManifest(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getApplicationGatewayWafDynamicManifestsDefaults()
            .getWithResponse("westus", Context.NONE);
    }
}
