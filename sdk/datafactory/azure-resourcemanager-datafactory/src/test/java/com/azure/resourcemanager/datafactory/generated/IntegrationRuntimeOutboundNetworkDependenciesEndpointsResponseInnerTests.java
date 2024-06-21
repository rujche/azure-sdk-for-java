// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpoint;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner model = BinaryData.fromString(
            "{\"value\":[{\"category\":\"frlh\",\"endpoints\":[{\"domainName\":\"kyv\",\"endpointDetails\":[{}]},{\"domainName\":\"n\",\"endpointDetails\":[{},{},{}]},{\"domainName\":\"zka\",\"endpointDetails\":[{}]},{\"domainName\":\"b\",\"endpointDetails\":[{},{}]}]}]}")
            .toObject(IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner.class);
        Assertions.assertEquals("frlh", model.value().get(0).category());
        Assertions.assertEquals("kyv", model.value().get(0).endpoints().get(0).domainName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner model
            = new IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner()
                .withValue(
                    Arrays
                        .asList(
                            new IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint().withCategory("frlh")
                                .withEndpoints(Arrays.asList(
                                    new IntegrationRuntimeOutboundNetworkDependenciesEndpoint().withDomainName("kyv")
                                        .withEndpointDetails(Arrays.asList(
                                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails())),
                                    new IntegrationRuntimeOutboundNetworkDependenciesEndpoint().withDomainName("n")
                                        .withEndpointDetails(Arrays.asList(
                                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails(),
                                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails(),
                                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails())),
                                    new IntegrationRuntimeOutboundNetworkDependenciesEndpoint().withDomainName("zka")
                                        .withEndpointDetails(Arrays.asList(
                                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails())),
                                    new IntegrationRuntimeOutboundNetworkDependenciesEndpoint().withDomainName("b")
                                        .withEndpointDetails(Arrays.asList(
                                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails(),
                                            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails()))))));
        model = BinaryData.fromObject(model)
            .toObject(IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner.class);
        Assertions.assertEquals("frlh", model.value().get(0).category());
        Assertions.assertEquals("kyv", model.value().get(0).endpoints().get(0).domainName());
    }
}
