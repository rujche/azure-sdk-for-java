// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.Checkpoint;
import org.junit.jupiter.api.Assertions;

public final class CheckpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Checkpoint model = BinaryData.fromString(
            "{\"parentCheckpointID\":\"qex\",\"checkpointID\":\"ocxscpaierhhbcs\",\"name\":\"ummajtjaod\",\"description\":\"bnbdxkqpxokajion\"}")
            .toObject(Checkpoint.class);
        Assertions.assertEquals("qex", model.parentCheckpointId());
        Assertions.assertEquals("ocxscpaierhhbcs", model.checkpointId());
        Assertions.assertEquals("ummajtjaod", model.name());
        Assertions.assertEquals("bnbdxkqpxokajion", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Checkpoint model = new Checkpoint().withParentCheckpointId("qex")
            .withCheckpointId("ocxscpaierhhbcs")
            .withName("ummajtjaod")
            .withDescription("bnbdxkqpxokajion");
        model = BinaryData.fromObject(model).toObject(Checkpoint.class);
        Assertions.assertEquals("qex", model.parentCheckpointId());
        Assertions.assertEquals("ocxscpaierhhbcs", model.checkpointId());
        Assertions.assertEquals("ummajtjaod", model.name());
        Assertions.assertEquals("bnbdxkqpxokajion", model.description());
    }
}
