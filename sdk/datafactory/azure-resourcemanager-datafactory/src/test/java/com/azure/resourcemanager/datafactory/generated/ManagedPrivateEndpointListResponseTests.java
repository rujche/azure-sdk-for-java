// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedPrivateEndpointResourceInner;
import com.azure.resourcemanager.datafactory.models.ConnectionStateProperties;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoint;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpointListResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"connectionState\":{\"actionsRequired\":\"wdkqzeqy\",\"description\":\"eziunjxdfzant\",\"status\":\"cegyamlbnseqacj\"},\"fqdns\":[\"ilguooqjagmditg\",\"eiookjbsah\",\"tdtpdelqacslmo\"],\"groupId\":\"ebnfxofvc\",\"isReserved\":false,\"privateLinkResourceId\":\"irazftxejwabmd\",\"provisioningState\":\"tmvcop\",\"\":{\"urbuhhlkyqltq\":\"datam\"}},\"name\":\"ogtu\",\"type\":\"ffdjktsysidfvclg\",\"etag\":\"n\",\"id\":\"ijtk\"},{\"properties\":{\"connectionState\":{\"actionsRequired\":\"qogsfikayian\",\"description\":\"arujt\",\"status\":\"qxfzyjqttvwk\"},\"fqdns\":[\"j\",\"enuygbq\",\"qqekewvnqvcdlgu\"],\"groupId\":\"cmfdjwnlax\",\"isReserved\":false,\"privateLinkResourceId\":\"qikczvvita\",\"provisioningState\":\"xmfcsserxhtv\",\"\":{\"sxypruuu\":\"datahlwntsjgq\"}},\"name\":\"nchrszizoyu\",\"type\":\"yetnd\",\"etag\":\"fqyggagflnlgmtr\",\"id\":\"hzjmucftbyrp\"},{\"properties\":{\"connectionState\":{\"actionsRequired\":\"hkpigqfusuckzmkw\",\"description\":\"snoxaxmqeqa\",\"status\":\"hjnhgwydyynfsvk\"},\"fqdns\":[\"vqtanarfdlpuk\"],\"groupId\":\"yrneizjcpeo\",\"isReserved\":true,\"privateLinkResourceId\":\"mgbro\",\"provisioningState\":\"ddbhf\",\"\":{\"zoyw\":\"datapaz\",\"htuevrhrljy\":\"dataxhpdulontacnpqwt\",\"reur\":\"dataogwxhnsduugwb\",\"fuarenlvhht\":\"dataq\"}},\"name\":\"nvnaf\",\"type\":\"kyfede\",\"etag\":\"bo\",\"id\":\"cqxypokkhminq\"}],\"nextLink\":\"mczngn\"}")
            .toObject(ManagedPrivateEndpointListResponse.class);
        Assertions.assertEquals("ijtk", model.value().get(0).id());
        Assertions.assertEquals("ilguooqjagmditg", model.value().get(0).properties().fqdns().get(0));
        Assertions.assertEquals("ebnfxofvc", model.value().get(0).properties().groupId());
        Assertions.assertEquals("irazftxejwabmd", model.value().get(0).properties().privateLinkResourceId());
        Assertions.assertEquals("mczngn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointListResponse model = new ManagedPrivateEndpointListResponse()
            .withValue(Arrays.asList(
                new ManagedPrivateEndpointResourceInner().withId("ijtk")
                    .withProperties(new ManagedPrivateEndpoint().withConnectionState(new ConnectionStateProperties())
                        .withFqdns(Arrays.asList("ilguooqjagmditg", "eiookjbsah", "tdtpdelqacslmo"))
                        .withGroupId("ebnfxofvc")
                        .withPrivateLinkResourceId("irazftxejwabmd")
                        .withAdditionalProperties(mapOf("isReserved", false, "provisioningState", "tmvcop"))),
                new ManagedPrivateEndpointResourceInner().withId("hzjmucftbyrp")
                    .withProperties(new ManagedPrivateEndpoint().withConnectionState(new ConnectionStateProperties())
                        .withFqdns(Arrays.asList("j", "enuygbq", "qqekewvnqvcdlgu"))
                        .withGroupId("cmfdjwnlax")
                        .withPrivateLinkResourceId("qikczvvita")
                        .withAdditionalProperties(mapOf("isReserved", false, "provisioningState", "xmfcsserxhtv"))),
                new ManagedPrivateEndpointResourceInner().withId("cqxypokkhminq")
                    .withProperties(new ManagedPrivateEndpoint().withConnectionState(new ConnectionStateProperties())
                        .withFqdns(Arrays.asList("vqtanarfdlpuk"))
                        .withGroupId("yrneizjcpeo")
                        .withPrivateLinkResourceId("mgbro")
                        .withAdditionalProperties(mapOf("isReserved", true, "provisioningState", "ddbhf")))))
            .withNextLink("mczngn");
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointListResponse.class);
        Assertions.assertEquals("ijtk", model.value().get(0).id());
        Assertions.assertEquals("ilguooqjagmditg", model.value().get(0).properties().fqdns().get(0));
        Assertions.assertEquals("ebnfxofvc", model.value().get(0).properties().groupId());
        Assertions.assertEquals("irazftxejwabmd", model.value().get(0).properties().privateLinkResourceId());
        Assertions.assertEquals("mczngn", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
