// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.SCClusterRecord;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OrganizationsListClustersMockTests {
    @Test
    public void testListClusters() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"kind\":\"dflgzuri\",\"id\":\"aecxndtic\",\"properties\":{\"metadata\":{\"self\":\"zmlqtmldgxo\",\"resourceName\":\"irclnpk\",\"createdTimestamp\":\"ayzri\",\"updatedTimestamp\":\"hya\",\"deletedTimestamp\":\"vjlboxqvk\"},\"spec\":{\"name\":\"xhom\",\"availability\":\"nhdwdigumbnra\",\"cloud\":\"zzp\",\"zone\":\"a\",\"region\":\"sdzhezww\",\"kafkaBootstrapEndpoint\":\"iqyuvvfo\",\"httpEndpoint\":\"p\",\"apiEndpoint\":\"qyikvy\",\"config\":{\"kind\":\"yavluwmncstt\"},\"environment\":{\"id\":\"y\",\"environment\":\"poekrsgsgb\",\"related\":\"uzqgnjdgkynsc\",\"resourceName\":\"qhzvhxnkomt\"},\"network\":{\"id\":\"otppnv\",\"environment\":\"zxhi\",\"related\":\"rbbcevq\",\"resourceName\":\"tltdhlfkqojpy\"},\"byok\":{\"id\":\"trdcnifmzzs\",\"related\":\"m\",\"resourceName\":\"nysuxmprafwgckh\"}},\"status\":{\"phase\":\"vdff\",\"cku\":848051352}},\"name\":\"qrouda\"}]}";

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

        ConfluentManager manager = ConfluentManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SCClusterRecord> response = manager.organizations().listClusters("toepryu", "nwy", "pzdm",
            1383258036, "zvfvaawz", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dflgzuri", response.iterator().next().kind());
        Assertions.assertEquals("aecxndtic", response.iterator().next().id());
        Assertions.assertEquals("qrouda", response.iterator().next().name());
        Assertions.assertEquals("zmlqtmldgxo", response.iterator().next().metadata().self());
        Assertions.assertEquals("irclnpk", response.iterator().next().metadata().resourceName());
        Assertions.assertEquals("ayzri", response.iterator().next().metadata().createdTimestamp());
        Assertions.assertEquals("hya", response.iterator().next().metadata().updatedTimestamp());
        Assertions.assertEquals("vjlboxqvk", response.iterator().next().metadata().deletedTimestamp());
        Assertions.assertEquals("xhom", response.iterator().next().spec().name());
        Assertions.assertEquals("nhdwdigumbnra", response.iterator().next().spec().availability());
        Assertions.assertEquals("zzp", response.iterator().next().spec().cloud());
        Assertions.assertEquals("a", response.iterator().next().spec().zone());
        Assertions.assertEquals("sdzhezww", response.iterator().next().spec().region());
        Assertions.assertEquals("iqyuvvfo", response.iterator().next().spec().kafkaBootstrapEndpoint());
        Assertions.assertEquals("p", response.iterator().next().spec().httpEndpoint());
        Assertions.assertEquals("qyikvy", response.iterator().next().spec().apiEndpoint());
        Assertions.assertEquals("yavluwmncstt", response.iterator().next().spec().config().kind());
        Assertions.assertEquals("y", response.iterator().next().spec().environment().id());
        Assertions.assertEquals("poekrsgsgb", response.iterator().next().spec().environment().environment());
        Assertions.assertEquals("uzqgnjdgkynsc", response.iterator().next().spec().environment().related());
        Assertions.assertEquals("qhzvhxnkomt", response.iterator().next().spec().environment().resourceName());
        Assertions.assertEquals("otppnv", response.iterator().next().spec().network().id());
        Assertions.assertEquals("zxhi", response.iterator().next().spec().network().environment());
        Assertions.assertEquals("rbbcevq", response.iterator().next().spec().network().related());
        Assertions.assertEquals("tltdhlfkqojpy", response.iterator().next().spec().network().resourceName());
        Assertions.assertEquals("trdcnifmzzs", response.iterator().next().spec().byok().id());
        Assertions.assertEquals("m", response.iterator().next().spec().byok().related());
        Assertions.assertEquals("nysuxmprafwgckh", response.iterator().next().spec().byok().resourceName());
        Assertions.assertEquals("vdff", response.iterator().next().status().phase());
        Assertions.assertEquals(848051352, response.iterator().next().status().cku());
    }
}
