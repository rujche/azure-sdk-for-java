// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/**
 * Samples for PacketCoreControlPlaneVersions GetBySubscription.
 */
public final class PacketCoreControlPlaneVersionsGetBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-04-01/examples/PacketCoreControlPlaneVersionGetBySubscription.json
     */
    /**
     * Sample code: Get packet core control plane version by subscription.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void getPacketCoreControlPlaneVersionBySubscription(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCoreControlPlaneVersions()
            .getBySubscriptionWithResponse("2404.0-1", com.azure.core.util.Context.NONE);
    }
}
