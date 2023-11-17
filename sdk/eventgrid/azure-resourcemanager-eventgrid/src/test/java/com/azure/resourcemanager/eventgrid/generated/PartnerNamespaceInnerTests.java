// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceInner;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicRoutingMode;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartnerNamespaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerNamespaceInner model = BinaryData.fromString(
            "{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"wgdsl\"},\"groupIds\":[\"hhrmooizqsey\",\"xiutcx\"],\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"rpetogebjoxsl\",\"actionsRequired\":\"nhl\"},\"provisioningState\":\"Updating\"},\"id\":\"q\",\"name\":\"kkzjcjbtrga\",\"type\":\"hvv\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"jj\"},\"groupIds\":[\"qbeitpkxztmoob\",\"lftidgfcwqmpim\",\"qxzhem\"],\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"uj\",\"actionsRequired\":\"t\"},\"provisioningState\":\"Creating\"},\"id\":\"zzwc\",\"name\":\"lkb\",\"type\":\"wpfaj\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"tlwtjjguktalhsn\"},\"groupIds\":[\"dmxzr\",\"oaimlnw\",\"aaomylweazu\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"hwwn\",\"actionsRequired\":\"hlf\"},\"provisioningState\":\"Creating\"},\"id\":\"pchwa\",\"name\":\"fb\",\"type\":\"usnfepgfewet\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"gncxykxhdj\"},\"groupIds\":[\"mmbcxfhbcp\",\"rxvxcjzh\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"pxtgqscjav\",\"actionsRequired\":\"juhdqazkmtgguwpi\"},\"provisioningState\":\"Updating\"},\"id\":\"jcivmmg\",\"name\":\"f\",\"type\":\"fiwrxgkn\"}],\"provisioningState\":\"Deleting\",\"partnerRegistrationFullyQualifiedId\":\"inzqodfvpgs\",\"minimumTlsVersionAllowed\":\"1.1\",\"endpoint\":\"sgbpfgzdjtx\",\"publicNetworkAccess\":\"SecuredByPerimeter\",\"inboundIpRules\":[{\"ipMask\":\"v\",\"action\":\"Allow\"},{\"ipMask\":\"lgafcqusrdve\",\"action\":\"Allow\"}],\"disableLocalAuth\":true,\"partnerTopicRoutingMode\":\"SourceEventAttribute\"},\"location\":\"nwlduycvuzhyrmew\",\"tags\":{\"dxgketwzhhzjhfj\":\"vekdxukuqgsjjxu\",\"qsxvmhf\":\"hvvmuvgpmun\",\"yue\":\"uzjyihsasbhudypo\",\"rlttymsjnygqdnfw\":\"slynsqyrpfoo\"},\"id\":\"zdzgtilaxhnfhqly\",\"name\":\"ijouwivkxoyzunb\",\"type\":\"xxrtikvc\"}")
            .toObject(PartnerNamespaceInner.class);
        Assertions.assertEquals("nwlduycvuzhyrmew", model.location());
        Assertions.assertEquals("vekdxukuqgsjjxu", model.tags().get("dxgketwzhhzjhfj"));
        Assertions.assertEquals("inzqodfvpgs", model.partnerRegistrationFullyQualifiedId());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(PublicNetworkAccess.SECURED_BY_PERIMETER, model.publicNetworkAccess());
        Assertions.assertEquals("v", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(true, model.disableLocalAuth());
        Assertions.assertEquals(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE, model.partnerTopicRoutingMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerNamespaceInner model = new PartnerNamespaceInner().withLocation("nwlduycvuzhyrmew")
            .withTags(mapOf("dxgketwzhhzjhfj", "vekdxukuqgsjjxu", "qsxvmhf", "hvvmuvgpmun", "yue", "uzjyihsasbhudypo",
                "rlttymsjnygqdnfw", "slynsqyrpfoo"))
            .withPartnerRegistrationFullyQualifiedId("inzqodfvpgs").withMinimumTlsVersionAllowed(TlsVersion.ONE_ONE)
            .withPublicNetworkAccess(PublicNetworkAccess.SECURED_BY_PERIMETER)
            .withInboundIpRules(Arrays.asList(new InboundIpRule().withIpMask("v").withAction(IpActionType.ALLOW),
                new InboundIpRule().withIpMask("lgafcqusrdve").withAction(IpActionType.ALLOW)))
            .withDisableLocalAuth(true).withPartnerTopicRoutingMode(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE);
        model = BinaryData.fromObject(model).toObject(PartnerNamespaceInner.class);
        Assertions.assertEquals("nwlduycvuzhyrmew", model.location());
        Assertions.assertEquals("vekdxukuqgsjjxu", model.tags().get("dxgketwzhhzjhfj"));
        Assertions.assertEquals("inzqodfvpgs", model.partnerRegistrationFullyQualifiedId());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(PublicNetworkAccess.SECURED_BY_PERIMETER, model.publicNetworkAccess());
        Assertions.assertEquals("v", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(true, model.disableLocalAuth());
        Assertions.assertEquals(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE, model.partnerTopicRoutingMode());
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
