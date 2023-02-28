// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsZone;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksGetDnsZoneWithResponseMockTests {
    @Test
    public void testGetDnsZoneWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"displayName\":\"hheioqaqhvseuf\",\"domain\":[\"rxpdlcgqlsi\",\"mjqfrddgamquhio\",\"rsjuivfcdisyir\"],\"dnsServerIps\":[\"hcz\",\"xrxzbujrtr\",\"qvwre\",\"khgn\"],\"sourceIp\":\"zonzlrpiqywnc\",\"dnsServices\":7277409446614883590,\"provisioningState\":\"Failed\",\"revision\":3689932193430480450},\"id\":\"zehtdhgb\",\"name\":\"k\",\"type\":\"reljeamur\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        AvsManager manager =
            AvsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        WorkloadNetworkDnsZone response =
            manager
                .workloadNetworks()
                .getDnsZoneWithResponse("dqmeqwigpibudq", "yxeb", "ybpmzznrtffyaq", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("hheioqaqhvseuf", response.displayName());
        Assertions.assertEquals("rxpdlcgqlsi", response.domain().get(0));
        Assertions.assertEquals("hcz", response.dnsServerIps().get(0));
        Assertions.assertEquals("zonzlrpiqywnc", response.sourceIp());
        Assertions.assertEquals(7277409446614883590L, response.dnsServices());
        Assertions.assertEquals(3689932193430480450L, response.revision());
    }
}
