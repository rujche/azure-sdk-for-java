// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.PortRange;
import org.junit.jupiter.api.Assertions;

public final class PortRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortRange model = BinaryData.fromString("{\"min\":551724215,\"max\":806707414}").toObject(PortRange.class);
        Assertions.assertEquals(551724215, model.min());
        Assertions.assertEquals(806707414, model.max());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortRange model = new PortRange().withMin(551724215).withMax(806707414);
        model = BinaryData.fromObject(model).toObject(PortRange.class);
        Assertions.assertEquals(551724215, model.min());
        Assertions.assertEquals(806707414, model.max());
    }
}
