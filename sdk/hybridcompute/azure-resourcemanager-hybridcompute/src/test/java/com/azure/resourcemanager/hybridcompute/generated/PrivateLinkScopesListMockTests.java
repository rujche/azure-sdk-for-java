// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.HybridComputePrivateLinkScope;
import com.azure.resourcemanager.hybridcompute.models.PublicNetworkAccessType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateLinkScopesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"publicNetworkAccess\":\"Disabled\",\"provisioningState\":\"ccknfnwmbtmvp\",\"privateLinkScopeId\":\"jdhttzaefedxi\",\"privateEndpointConnections\":[{\"id\":\"phkmcrjdqnsdfz\",\"name\":\"gtgkylkdghr\",\"type\":\"uutlwxezwzhok\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"hh\",\"description\":\"qlgehg\"},\"provisioningState\":\"ipifhpfeoajvg\",\"groupIds\":[\"xjcsheafidltu\",\"sr\",\"smkss\",\"h\"]}},{\"id\":\"ftxfkf\",\"name\":\"gpr\",\"type\":\"tillucbiqtg\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"mcwsldrizetpwb\",\"description\":\"a\"},\"provisioningState\":\"libph\",\"groupIds\":[\"mizak\",\"kan\",\"jpdn\"]}},{\"id\":\"ha\",\"name\":\"ylhjlm\",\"type\":\"y\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"mrsopte\",\"description\":\"cjmeislstvasy\"},\"provisioningState\":\"xdza\",\"groupIds\":[\"eoohguufuzboyj\",\"thwtzol\",\"a\",\"mwmdxmebwjscjpa\"]}}]},\"location\":\"xveabf\",\"tags\":{\"ijddtvqc\":\"mwmqtibx\",\"jaeukmrsieekpn\":\"tad\",\"pibudqwyxebeybpm\":\"zaapmudqmeqwi\"},\"id\":\"znrtffyaqit\",\"name\":\"hheioqaqhvseuf\",\"type\":\"qyrxp\"}]}";

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

        HybridComputeManager manager =
            HybridComputeManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<HybridComputePrivateLinkScope> response =
            manager.privateLinkScopes().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xveabf", response.iterator().next().location());
        Assertions.assertEquals("mwmqtibx", response.iterator().next().tags().get("ijddtvqc"));
        Assertions
            .assertEquals(
                PublicNetworkAccessType.DISABLED, response.iterator().next().properties().publicNetworkAccess());
    }
}
