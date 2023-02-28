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
import com.azure.resourcemanager.avs.models.ScriptExecution;
import com.azure.resourcemanager.avs.models.ScriptOutputStreamType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ScriptExecutionsGetExecutionLogsWithResponseMockTests {
    @Test
    public void testGetExecutionLogsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"scriptCmdletId\":\"sysidfvclglxnf\",\"parameters\":[],\"hiddenParameters\":[],\"failureReason\":\"usqogsfikayia\",\"timeout\":\"sharujtj\",\"retention\":\"xfz\",\"submittedAt\":\"2021-09-16T23:50:41Z\",\"startedAt\":\"2021-11-24T09:34:57Z\",\"finishedAt\":\"2021-06-13T02:09:09Z\",\"provisioningState\":\"Canceled\",\"output\":[\"j\",\"enuygbq\",\"qqekewvnqvcdlgu\"],\"namedOutputs\":{\"axpunjqikczvv\":\"datamfdjwn\",\"serxht\":\"datatacgxmfc\",\"xypruuuy\":\"datasoxhlwntsjgqr\"},\"information\":[\"hrszi\",\"oyuelyetn\"],\"warnings\":[\"fqyggagflnlgmtr\"],\"errors\":[\"zjmucftbyrplroh\",\"pigqfusuckzmkw\",\"lsnoxaxmqeqalh\"]},\"id\":\"jnhgwydyyn\",\"name\":\"svkhgbv\",\"type\":\"ta\"}";

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

        ScriptExecution response =
            manager
                .scriptExecutions()
                .getExecutionLogsWithResponse(
                    "m",
                    "urbuhhlkyqltq",
                    "rogtuwkf",
                    Arrays.asList(ScriptOutputStreamType.INFORMATION),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("sysidfvclglxnf", response.scriptCmdletId());
        Assertions.assertEquals("usqogsfikayia", response.failureReason());
        Assertions.assertEquals("sharujtj", response.timeout());
        Assertions.assertEquals("xfz", response.retention());
        Assertions.assertEquals("j", response.output().get(0));
    }
}
