// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ConfigurationPolicyGroups Delete. */
public final class ConfigurationPolicyGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ConfigurationPolicyGroupDelete.json
     */
    /**
     * Sample code: ConfigurationPolicyGroupDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void configurationPolicyGroupDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getConfigurationPolicyGroups()
            .delete("rg1", "vpnServerConfiguration1", "policyGroup1", Context.NONE);
    }
}
