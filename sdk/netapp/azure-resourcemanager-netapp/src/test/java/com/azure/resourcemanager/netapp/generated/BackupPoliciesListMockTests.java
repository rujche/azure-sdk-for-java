// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.BackupPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupPoliciesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"etag\":\"ccxlzhcoxovnek\",\"properties\":{\"backupPolicyId\":\"nlusfnrd\",\"provisioningState\":\"xtxrdcqtjvidt\",\"dailyBackupsToKeep\":695049640,\"weeklyBackupsToKeep\":1779546866,\"monthlyBackupsToKeep\":818370137,\"volumesAssigned\":2099497391,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"wkasiziesf\",\"backupsCount\":1027973509,\"policyEnabled\":true},{\"volumeName\":\"qfecjxeygtuhx\",\"backupsCount\":1670662701,\"policyEnabled\":true},{\"volumeName\":\"wmrswnjlxuzrh\",\"backupsCount\":519622226,\"policyEnabled\":true},{\"volumeName\":\"baqehgpdoh\",\"backupsCount\":1232652299,\"policyEnabled\":false}]},\"location\":\"coi\",\"tags\":{\"bnwgfmxj\":\"xncnwfe\",\"y\":\"cgbjbgdlfgt\",\"ctqhamzjrwdk\":\"naquflq\"},\"id\":\"zeqyjleziun\",\"name\":\"xdfzantkw\",\"type\":\"eg\"}]}";

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

        NetAppFilesManager manager = NetAppFilesManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BackupPolicy> response
            = manager.backupPolicies().list("onwpnga", "innixjawrtmjfj", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("coi", response.iterator().next().location());
        Assertions.assertEquals("xncnwfe", response.iterator().next().tags().get("bnwgfmxj"));
        Assertions.assertEquals(695049640, response.iterator().next().dailyBackupsToKeep());
        Assertions.assertEquals(1779546866, response.iterator().next().weeklyBackupsToKeep());
        Assertions.assertEquals(818370137, response.iterator().next().monthlyBackupsToKeep());
        Assertions.assertEquals(false, response.iterator().next().enabled());
    }
}
