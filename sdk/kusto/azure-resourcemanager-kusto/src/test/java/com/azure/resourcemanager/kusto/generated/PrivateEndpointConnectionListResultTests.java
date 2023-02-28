// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.kusto.models.PrivateEndpointConnectionListResult;
import java.util.Arrays;

public final class PrivateEndpointConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"ruvw\",\"provisioningState\":\"sqfsubcgjbirxb\"},\"id\":\"bsrfbj\",\"name\":\"dtws\",\"type\":\"otftpvjzbexilz\"},{\"properties\":{\"groupId\":\"q\",\"provisioningState\":\"wpmqt\"},\"id\":\"uoujmkcjhwqy\",\"name\":\"jrybnwjewgdrjer\",\"type\":\"naenqpehindo\"},{\"properties\":{\"groupId\":\"fthnzdn\",\"provisioningState\":\"l\"},\"id\":\"ayqigynduhav\",\"name\":\"qlkth\",\"type\":\"maqolbgycduie\"}]}")
                .toObject(PrivateEndpointConnectionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResult model =
            new PrivateEndpointConnectionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner()));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
    }
}
