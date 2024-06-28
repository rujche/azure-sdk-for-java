// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.PortMirroringDirectionEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPortMirroring;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksGetPortMirroringWithResponseMockTests {
    @Test
    public void testGetPortMirroringWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"displayName\":\"q\",\"direction\":\"EGRESS\",\"source\":\"renlvhhtklnvnafv\",\"destination\":\"yfedevjbo\",\"status\":\"FAILURE\",\"provisioningState\":\"Deleting\",\"revision\":41375191452971631},\"id\":\"khminqcymc\",\"name\":\"ngnbdxxew\",\"type\":\"ninvudbchaqdt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        WorkloadNetworkPortMirroring response = manager.workloadNetworks()
            .getPortMirroringWithResponse("evrh", "ljyoogwx", "nsduugwbsre", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("q", response.displayName());
        Assertions.assertEquals(PortMirroringDirectionEnum.EGRESS, response.direction());
        Assertions.assertEquals("renlvhhtklnvnafv", response.source());
        Assertions.assertEquals("yfedevjbo", response.destination());
        Assertions.assertEquals(41375191452971631L, response.revision());
    }
}
