// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.fluent.models.RunOutputProperties;
import org.junit.jupiter.api.Assertions;

public final class RunOutputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RunOutputProperties model
            = BinaryData.fromString("{\"artifactId\":\"i\",\"artifactUri\":\"thz\",\"provisioningState\":\"Updating\"}")
                .toObject(RunOutputProperties.class);
        Assertions.assertEquals("i", model.artifactId());
        Assertions.assertEquals("thz", model.artifactUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RunOutputProperties model = new RunOutputProperties().withArtifactId("i").withArtifactUri("thz");
        model = BinaryData.fromObject(model).toObject(RunOutputProperties.class);
        Assertions.assertEquals("i", model.artifactId());
        Assertions.assertEquals("thz", model.artifactUri());
    }
}
