// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateDistributor;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateIdentity;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateUpdateParameters;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateUpdateParametersProperties;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateVmProfile;
import com.azure.resourcemanager.imagebuilder.models.ResourceIdentityType;
import com.azure.resourcemanager.imagebuilder.models.UserAssignedIdentity;
import com.azure.resourcemanager.imagebuilder.models.VirtualNetworkConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplateUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateUpdateParameters model = BinaryData.fromString(
            "{\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"iawxklry\":{\"principalId\":\"ftyhxhurokf\",\"clientId\":\"xolniwpwcukjfk\"},\"hejkotynqgou\":{\"principalId\":\"wckbasyypnd\",\"clientId\":\"sgcbac\"},\"gakeqsr\":{\"principalId\":\"ndlik\",\"clientId\":\"qkgfgibma\"}}},\"tags\":{\"tbciqfouflmm\":\"zqqedq\",\"lougpbkw\":\"kzsmodm\",\"wgcu\":\"mutduqktaps\",\"hbmdgbbjfdd\":\"rtumkdosvq\"},\"properties\":{\"distribute\":[{\"type\":\"ImageTemplateDistributor\",\"runOutputName\":\"bexppb\",\"artifactTags\":{\"s\":\"qrolfpf\"}}],\"vmProfile\":{\"vmSize\":\"bquxigjy\",\"osDiskSizeGB\":852656000,\"userAssignedIdentities\":[\"o\",\"fhrtxilnerkujysv\",\"eju\",\"fqawrlyxw\"],\"vnetConfig\":{\"subnetId\":\"prbnwbxgjvtbv\",\"containerInstanceSubnetId\":\"sszdnru\",\"proxyVmSize\":\"guhmuouqfpr\"}}}}")
            .toObject(ImageTemplateUpdateParameters.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("zqqedq", model.tags().get("tbciqfouflmm"));
        Assertions.assertEquals("bexppb", model.properties().distribute().get(0).runOutputName());
        Assertions.assertEquals("qrolfpf", model.properties().distribute().get(0).artifactTags().get("s"));
        Assertions.assertEquals("bquxigjy", model.properties().vmProfile().vmSize());
        Assertions.assertEquals(852656000, model.properties().vmProfile().osDiskSizeGB());
        Assertions.assertEquals("o", model.properties().vmProfile().userAssignedIdentities().get(0));
        Assertions.assertEquals("prbnwbxgjvtbv", model.properties().vmProfile().vnetConfig().subnetId());
        Assertions.assertEquals("sszdnru", model.properties().vmProfile().vnetConfig().containerInstanceSubnetId());
        Assertions.assertEquals("guhmuouqfpr", model.properties().vmProfile().vnetConfig().proxyVmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateUpdateParameters model = new ImageTemplateUpdateParameters()
            .withIdentity(new ImageTemplateIdentity().withType(ResourceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("iawxklry", new UserAssignedIdentity(), "hejkotynqgou",
                    new UserAssignedIdentity(), "gakeqsr", new UserAssignedIdentity())))
            .withTags(mapOf("tbciqfouflmm", "zqqedq", "lougpbkw", "kzsmodm", "wgcu", "mutduqktaps", "hbmdgbbjfdd",
                "rtumkdosvq"))
            .withProperties(new ImageTemplateUpdateParametersProperties()
                .withDistribute(Arrays.asList(
                    new ImageTemplateDistributor().withRunOutputName("bexppb").withArtifactTags(mapOf("s", "qrolfpf"))))
                .withVmProfile(new ImageTemplateVmProfile().withVmSize("bquxigjy")
                    .withOsDiskSizeGB(852656000)
                    .withUserAssignedIdentities(Arrays.asList("o", "fhrtxilnerkujysv", "eju", "fqawrlyxw"))
                    .withVnetConfig(new VirtualNetworkConfig().withSubnetId("prbnwbxgjvtbv")
                        .withContainerInstanceSubnetId("sszdnru")
                        .withProxyVmSize("guhmuouqfpr"))));
        model = BinaryData.fromObject(model).toObject(ImageTemplateUpdateParameters.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("zqqedq", model.tags().get("tbciqfouflmm"));
        Assertions.assertEquals("bexppb", model.properties().distribute().get(0).runOutputName());
        Assertions.assertEquals("qrolfpf", model.properties().distribute().get(0).artifactTags().get("s"));
        Assertions.assertEquals("bquxigjy", model.properties().vmProfile().vmSize());
        Assertions.assertEquals(852656000, model.properties().vmProfile().osDiskSizeGB());
        Assertions.assertEquals("o", model.properties().vmProfile().userAssignedIdentities().get(0));
        Assertions.assertEquals("prbnwbxgjvtbv", model.properties().vmProfile().vnetConfig().subnetId());
        Assertions.assertEquals("sszdnru", model.properties().vmProfile().vnetConfig().containerInstanceSubnetId());
        Assertions.assertEquals("guhmuouqfpr", model.properties().vmProfile().vnetConfig().proxyVmSize());
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
