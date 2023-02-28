// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointProperties;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointProperties model =
            BinaryData
                .fromString(
                    "{\"privateLinkResourceId\":\"ytkblmpew\",\"privateLinkResourceRegion\":\"fbkrvrnsvs\",\"groupId\":\"q\",\"requestMessage\":\"hxcr\",\"provisioningState\":\"Creating\"}")
                .toObject(ManagedPrivateEndpointProperties.class);
        Assertions.assertEquals("ytkblmpew", model.privateLinkResourceId());
        Assertions.assertEquals("fbkrvrnsvs", model.privateLinkResourceRegion());
        Assertions.assertEquals("q", model.groupId());
        Assertions.assertEquals("hxcr", model.requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointProperties model =
            new ManagedPrivateEndpointProperties()
                .withPrivateLinkResourceId("ytkblmpew")
                .withPrivateLinkResourceRegion("fbkrvrnsvs")
                .withGroupId("q")
                .withRequestMessage("hxcr");
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointProperties.class);
        Assertions.assertEquals("ytkblmpew", model.privateLinkResourceId());
        Assertions.assertEquals("fbkrvrnsvs", model.privateLinkResourceRegion());
        Assertions.assertEquals("q", model.groupId());
        Assertions.assertEquals("hxcr", model.requestMessage());
    }
}
