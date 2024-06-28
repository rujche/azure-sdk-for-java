// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.Endpoints;

public final class EndpointsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Endpoints model = BinaryData.fromString(
            "{\"nsxtManager\":\"tmut\",\"vcsa\":\"qktapspwgcuert\",\"hcxCloudManager\":\"kdosvqw\",\"nsxtManagerIp\":\"mdgbbjfdd\",\"vcenterIp\":\"bmbexppbhtqqro\",\"hcxCloudManagerIp\":\"p\"}")
            .toObject(Endpoints.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Endpoints model = new Endpoints();
        model = BinaryData.fromObject(model).toObject(Endpoints.class);
    }
}
