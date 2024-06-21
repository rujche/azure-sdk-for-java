// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.JsonDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.util.HashMap;
import java.util.Map;

public final class JsonDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonDatasetTypeProperties model = BinaryData.fromString(
            "{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datavq\",\"fileName\":\"datansgnwxlwmez\",\"\":{\"fve\":\"dataxpthceopvkvt\",\"cdyarnggcjfwblqh\":\"dataobpbokhmm\",\"s\":\"datakasmcolmugpyva\"}},\"encodingName\":\"datal\",\"compression\":{\"type\":\"datazxeygzvtye\",\"level\":\"datahubnobgu\",\"\":{\"pdmioyj\":\"dataqsq\",\"cpszpmcvqdvrdmv\":\"datanmlvi\",\"hgvqojbxaotcgbz\":\"datayrx\",\"oioyidoxznvgvd\":\"datambtple\"}}}")
            .toObject(JsonDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonDatasetTypeProperties model = new JsonDatasetTypeProperties()
            .withLocation(new DatasetLocation().withFolderPath("datavq")
                .withFileName("datansgnwxlwmez")
                .withAdditionalProperties(mapOf("type", "DatasetLocation")))
            .withEncodingName("datal")
            .withCompression(new DatasetCompression().withType("datazxeygzvtye")
                .withLevel("datahubnobgu")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(JsonDatasetTypeProperties.class);
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
