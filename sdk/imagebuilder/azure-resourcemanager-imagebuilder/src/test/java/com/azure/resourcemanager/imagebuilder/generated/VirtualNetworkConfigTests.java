// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.VirtualNetworkConfig;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkConfig model = BinaryData
            .fromString(
                "{\"subnetId\":\"ndhkrw\",\"containerInstanceSubnetId\":\"appd\",\"proxyVmSize\":\"dkvwrwjfe\"}")
            .toObject(VirtualNetworkConfig.class);
        Assertions.assertEquals("ndhkrw", model.subnetId());
        Assertions.assertEquals("appd", model.containerInstanceSubnetId());
        Assertions.assertEquals("dkvwrwjfe", model.proxyVmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkConfig model = new VirtualNetworkConfig().withSubnetId("ndhkrw")
            .withContainerInstanceSubnetId("appd")
            .withProxyVmSize("dkvwrwjfe");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkConfig.class);
        Assertions.assertEquals("ndhkrw", model.subnetId());
        Assertions.assertEquals("appd", model.containerInstanceSubnetId());
        Assertions.assertEquals("dkvwrwjfe", model.proxyVmSize());
    }
}
