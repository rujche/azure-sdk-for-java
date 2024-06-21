// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/**
 * Samples for PacketCoreDataPlanes Delete.
 */
public final class PacketCoreDataPlanesDeleteSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-04-01/examples/PacketCoreDataPlaneDelete.json
     */
    /**
     * Sample code: Delete packet core data plane.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void deletePacketCoreDataPlane(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCoreDataPlanes()
            .delete("rg1", "testPacketCoreCP", "testPacketCoreDP", com.azure.core.util.Context.NONE);
    }
}
