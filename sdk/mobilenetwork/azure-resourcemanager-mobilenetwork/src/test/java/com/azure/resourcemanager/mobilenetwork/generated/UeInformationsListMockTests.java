// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.RatType;
import com.azure.resourcemanager.mobilenetwork.models.UeInfo;
import com.azure.resourcemanager.mobilenetwork.models.UeState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UeInformationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"ratType\":\"5G\",\"ueState\":\"Deregistered\",\"ueIpAddresses\":[{\"dnn\":\"skkfmk\",\"ueIpAddress\":{\"ipV4Addr\":\"jxyxgb\"}},{\"dnn\":\"qvjcteoe\",\"ueIpAddress\":{\"ipV4Addr\":\"slskkz\"}},{\"dnn\":\"vjnzdpvocojhpcna\",\"ueIpAddress\":{\"ipV4Addr\":\"fsnggytexvzilm\"}},{\"dnn\":\"vzkwwwncknr\",\"ueIpAddress\":{\"ipV4Addr\":\"jlskzptjxulweu\"}}],\"lastReadAt\":\"2021-05-21T04:33:34Z\"},\"id\":\"hxqlehmcgcjeinue\",\"name\":\"oka\",\"type\":\"vfejvqnttmbqda\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MobileNetworkManager manager = MobileNetworkManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<UeInfo> response
            = manager.ueInformations().list("hz", "dubtlmj", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(RatType.FIVEG, response.iterator().next().properties().ratType());
        Assertions.assertEquals(UeState.DEREGISTERED, response.iterator().next().properties().ueState());
        Assertions.assertEquals("skkfmk", response.iterator().next().properties().ueIpAddresses().get(0).dnn());
        Assertions.assertEquals("jxyxgb",
            response.iterator().next().properties().ueIpAddresses().get(0).ueIpAddress().ipV4Addr());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-21T04:33:34Z"),
            response.iterator().next().properties().lastReadAt());
    }
}
