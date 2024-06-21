// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.Ipv4RouteNextHop;
import org.junit.jupiter.api.Assertions;

public final class Ipv4RouteNextHopTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Ipv4RouteNextHop model = BinaryData.fromString("{\"address\":\"suwsyrsnds\",\"priority\":38368134}")
            .toObject(Ipv4RouteNextHop.class);
        Assertions.assertEquals("suwsyrsnds", model.address());
        Assertions.assertEquals(38368134, model.priority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Ipv4RouteNextHop model = new Ipv4RouteNextHop().withAddress("suwsyrsnds").withPriority(38368134);
        model = BinaryData.fromObject(model).toObject(Ipv4RouteNextHop.class);
        Assertions.assertEquals("suwsyrsnds", model.address());
        Assertions.assertEquals(38368134, model.priority());
    }
}
