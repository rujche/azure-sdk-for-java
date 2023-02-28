// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CommitmentPlansGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"etag\":\"jnaeois\",\"kind\":\"hmgorffukiscv\",\"sku\":{\"name\":\"zhwplefaxvxilc\",\"tier\":\"Basic\",\"size\":\"hnze\",\"family\":\"xtjjfzqlqhycav\",\"capacity\":1258622098},\"tags\":{\"nlrariaawiuagy\":\"dbeesmie\",\"ojocqwogf\":\"wqfbylyrfgiagt\",\"uxylfsbtkadpy\":\"zjvusfzldmo\"},\"location\":\"wn\",\"properties\":{\"provisioningState\":\"Accepted\",\"commitmentPlanGuid\":\"u\",\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"cto\",\"current\":{\"tier\":\"isofieypefojyqd\",\"count\":219137261,\"startDate\":\"cp\",\"endDate\":\"wkhihihlhzdsqt\"},\"autoRenew\":false,\"next\":{\"tier\":\"nowc\",\"count\":1143830782,\"startDate\":\"vecactx\",\"endDate\":\"oteyowc\"},\"last\":{\"tier\":\"ovekqvgqouwi\",\"count\":979743334,\"startDate\":\"wyivqikf\",\"endDate\":\"vhrfsphuagrt\"}},\"id\":\"ikteusqczkvyk\",\"name\":\"xubyjaffmmfblcqc\",\"type\":\"ubgq\"}";

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

        CognitiveServicesManager manager =
            CognitiveServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        CommitmentPlan response =
            manager
                .commitmentPlans()
                .getWithResponse("dhcxgkmoy", "cdyuibhmfdnbzyd", "f", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("hmgorffukiscv", response.kind());
        Assertions.assertEquals("zhwplefaxvxilc", response.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, response.sku().tier());
        Assertions.assertEquals("hnze", response.sku().size());
        Assertions.assertEquals("xtjjfzqlqhycav", response.sku().family());
        Assertions.assertEquals(1258622098, response.sku().capacity());
        Assertions.assertEquals("dbeesmie", response.tags().get("nlrariaawiuagy"));
        Assertions.assertEquals("wn", response.location());
        Assertions.assertEquals("u", response.properties().commitmentPlanGuid());
        Assertions.assertEquals(HostingModel.DISCONNECTED_CONTAINER, response.properties().hostingModel());
        Assertions.assertEquals("cto", response.properties().planType());
        Assertions.assertEquals("isofieypefojyqd", response.properties().current().tier());
        Assertions.assertEquals(219137261, response.properties().current().count());
        Assertions.assertEquals(false, response.properties().autoRenew());
        Assertions.assertEquals("nowc", response.properties().next().tier());
        Assertions.assertEquals(1143830782, response.properties().next().count());
    }
}
