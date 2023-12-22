// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ResourceGuardsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Updating\",\"allowAutoApprovals\":true,\"resourceGuardOperations\":[{\"vaultCriticalOperation\":\"qvcdlguaucmfdjw\",\"requestResourceType\":\"axpunjqikczvv\"},{\"vaultCriticalOperation\":\"acgxmfcsse\",\"requestResourceType\":\"htvs\"}],\"vaultCriticalOperationExclusionList\":[\"lwntsjgqrs\",\"y\",\"ruuuybnch\"],\"description\":\"zizoyuely\"},\"eTag\":\"ndnbfqy\",\"location\":\"agfl\",\"tags\":{\"jmucftby\":\"mtrwah\"},\"id\":\"plrohkpigq\",\"name\":\"usuckzmkwklsno\",\"type\":\"axmqeqal\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DataProtectionManager manager = DataProtectionManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        ResourceGuardResource response = manager.resourceGuards()
            .getByResourceGroupWithResponse("yjqtt", "wkpqhjpenuygbq", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("agfl", response.location());
        Assertions.assertEquals("mtrwah", response.tags().get("jmucftby"));
        Assertions.assertEquals("ndnbfqy", response.etag());
        Assertions.assertEquals("lwntsjgqrs", response.properties().vaultCriticalOperationExclusionList().get(0));
    }
}
