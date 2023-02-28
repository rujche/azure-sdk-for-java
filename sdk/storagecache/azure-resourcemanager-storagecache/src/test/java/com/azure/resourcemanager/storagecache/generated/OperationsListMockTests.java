// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.storagecache.StorageCacheManager;
import com.azure.resourcemanager.storagecache.models.ApiOperation;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"display\":{\"operation\":\"vjymjhxxjyngud\",\"provider\":\"krtswbxqz\",\"resource\":\"zjf\",\"description\":\"vjfdx\"},\"origin\":\"vetvt\",\"isDataAction\":true,\"name\":\"tdo\",\"properties\":{\"serviceSpecification\":{\"metricSpecifications\":[],\"logSpecifications\":[]}}}]}";

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

        StorageCacheManager manager =
            StorageCacheManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ApiOperation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vjymjhxxjyngud", response.iterator().next().display().operation());
        Assertions.assertEquals("krtswbxqz", response.iterator().next().display().provider());
        Assertions.assertEquals("zjf", response.iterator().next().display().resource());
        Assertions.assertEquals("vjfdx", response.iterator().next().display().description());
        Assertions.assertEquals("vetvt", response.iterator().next().origin());
        Assertions.assertEquals(true, response.iterator().next().isDataAction());
        Assertions.assertEquals("tdo", response.iterator().next().name());
    }
}
