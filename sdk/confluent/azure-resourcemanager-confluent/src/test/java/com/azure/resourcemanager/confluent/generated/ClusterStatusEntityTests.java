// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.models.ClusterStatusEntity;
import org.junit.jupiter.api.Assertions;

public final class ClusterStatusEntityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterStatusEntity model = BinaryData.fromString("{\"phase\":\"keqdcvdrhvoods\",\"cku\":1475281926}")
            .toObject(ClusterStatusEntity.class);
        Assertions.assertEquals("keqdcvdrhvoods", model.phase());
        Assertions.assertEquals(1475281926, model.cku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterStatusEntity model = new ClusterStatusEntity().withPhase("keqdcvdrhvoods").withCku(1475281926);
        model = BinaryData.fromObject(model).toObject(ClusterStatusEntity.class);
        Assertions.assertEquals("keqdcvdrhvoods", model.phase());
        Assertions.assertEquals(1475281926, model.cku());
    }
}
