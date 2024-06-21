// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDebugResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeDebugResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeDebugResource model = BinaryData.fromString(
            "{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"xbzlmc\",\"\":{\"onqzinkfkbgbzbow\":\"datapcvhdbevwqqxeys\",\"qkjjeokbz\":\"dataeqocljmygvk\"}},\"name\":\"ezrxcczurtleipqx\"}")
            .toObject(IntegrationRuntimeDebugResource.class);
        Assertions.assertEquals("ezrxcczurtleipqx", model.name());
        Assertions.assertEquals("xbzlmc", model.properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeDebugResource model = new IntegrationRuntimeDebugResource().withName("ezrxcczurtleipqx")
            .withProperties(new IntegrationRuntime().withDescription("xbzlmc")
                .withAdditionalProperties(mapOf("type", "IntegrationRuntime")));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeDebugResource.class);
        Assertions.assertEquals("ezrxcczurtleipqx", model.name());
        Assertions.assertEquals("xbzlmc", model.properties().description());
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
