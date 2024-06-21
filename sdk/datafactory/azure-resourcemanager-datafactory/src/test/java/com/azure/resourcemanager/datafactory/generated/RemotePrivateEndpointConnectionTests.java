// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ArmIdWrapper;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionState;
import com.azure.resourcemanager.datafactory.models.RemotePrivateEndpointConnection;
import org.junit.jupiter.api.Assertions;

public final class RemotePrivateEndpointConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RemotePrivateEndpointConnection model = BinaryData.fromString(
            "{\"provisioningState\":\"wka\",\"privateEndpoint\":{\"id\":\"jyfdvlv\"},\"privateLinkServiceConnectionState\":{\"status\":\"rnfxtgddp\",\"description\":\"hehnmnaoya\",\"actionsRequired\":\"coeqswankltytm\"}}")
            .toObject(RemotePrivateEndpointConnection.class);
        Assertions.assertEquals("rnfxtgddp", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hehnmnaoya", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("coeqswankltytm", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RemotePrivateEndpointConnection model
            = new RemotePrivateEndpointConnection().withPrivateEndpoint(new ArmIdWrapper())
                .withPrivateLinkServiceConnectionState(new PrivateLinkConnectionState().withStatus("rnfxtgddp")
                    .withDescription("hehnmnaoya")
                    .withActionsRequired("coeqswankltytm"));
        model = BinaryData.fromObject(model).toObject(RemotePrivateEndpointConnection.class);
        Assertions.assertEquals("rnfxtgddp", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hehnmnaoya", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("coeqswankltytm", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
