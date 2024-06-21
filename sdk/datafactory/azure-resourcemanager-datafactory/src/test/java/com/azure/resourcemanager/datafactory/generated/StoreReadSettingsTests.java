// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;

public final class StoreReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StoreReadSettings model = BinaryData.fromString(
            "{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"dataj\",\"disableMetricsCollection\":\"datalzq\",\"\":{\"letb\":\"datar\",\"gcvqewx\":\"datalbhkij\",\"kzvjyvobevfbmxz\":\"dataqiwxeppuhkizo\",\"ilhdbbxm\":\"databpghsrlkpajiobyb\"}}")
            .toObject(StoreReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StoreReadSettings model = new StoreReadSettings().withMaxConcurrentConnections("dataj")
            .withDisableMetricsCollection("datalzq")
            .withAdditionalProperties(mapOf("type", "StoreReadSettings"));
        model = BinaryData.fromObject(model).toObject(StoreReadSettings.class);
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
