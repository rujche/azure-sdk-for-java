// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ChaosTargetSimpleFilter;
import com.azure.resourcemanager.chaos.models.ChaosTargetSimpleFilterParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ChaosTargetSimpleFilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChaosTargetSimpleFilter model =
            BinaryData
                .fromString("{\"type\":\"Simple\",\"parameters\":{\"zones\":[\"whkszzcmrvexztvb\"]}}")
                .toObject(ChaosTargetSimpleFilter.class);
        Assertions.assertEquals("whkszzcmrvexztvb", model.parameters().zones().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChaosTargetSimpleFilter model =
            new ChaosTargetSimpleFilter()
                .withParameters(new ChaosTargetSimpleFilterParameters().withZones(Arrays.asList("whkszzcmrvexztvb")));
        model = BinaryData.fromObject(model).toObject(ChaosTargetSimpleFilter.class);
        Assertions.assertEquals("whkszzcmrvexztvb", model.parameters().zones().get(0));
    }
}
