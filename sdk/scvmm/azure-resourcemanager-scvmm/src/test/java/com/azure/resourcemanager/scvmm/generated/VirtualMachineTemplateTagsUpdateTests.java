// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.VirtualMachineTemplateTagsUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VirtualMachineTemplateTagsUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineTemplateTagsUpdate model
            = BinaryData.fromString("{\"tags\":{\"cxkdmligovi\":\"opidkqqfkuv\",\"goorbteo\":\"rxkpmloazuruoc\"}}")
                .toObject(VirtualMachineTemplateTagsUpdate.class);
        Assertions.assertEquals("opidkqqfkuv", model.tags().get("cxkdmligovi"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineTemplateTagsUpdate model = new VirtualMachineTemplateTagsUpdate()
            .withTags(mapOf("cxkdmligovi", "opidkqqfkuv", "goorbteo", "rxkpmloazuruoc"));
        model = BinaryData.fromObject(model).toObject(VirtualMachineTemplateTagsUpdate.class);
        Assertions.assertEquals("opidkqqfkuv", model.tags().get("cxkdmligovi"));
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
