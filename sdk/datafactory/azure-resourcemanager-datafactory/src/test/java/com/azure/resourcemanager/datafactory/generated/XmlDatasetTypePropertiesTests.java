// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.XmlDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.util.HashMap;
import java.util.Map;

public final class XmlDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        XmlDatasetTypeProperties model = BinaryData.fromString(
            "{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datagmusaictdscnkzzo\",\"fileName\":\"datarddclzeqozrehlb\",\"\":{\"nynpameudpabcre\":\"dataxbnjrqvzyuexoz\",\"xvcvasormrexz\":\"datawzosgy\"}},\"encodingName\":\"dataubewgzygba\",\"nullValue\":\"datavecovsdqhzr\",\"compression\":{\"type\":\"databakrli\",\"level\":\"datafvppkeqsifj\",\"\":{\"bcdtajdo\":\"datangygnhrko\"}}}")
            .toObject(XmlDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        XmlDatasetTypeProperties model = new XmlDatasetTypeProperties()
            .withLocation(new DatasetLocation().withFolderPath("datagmusaictdscnkzzo")
                .withFileName("datarddclzeqozrehlb")
                .withAdditionalProperties(mapOf("type", "DatasetLocation")))
            .withEncodingName("dataubewgzygba")
            .withNullValue("datavecovsdqhzr")
            .withCompression(new DatasetCompression().withType("databakrli")
                .withLevel("datafvppkeqsifj")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(XmlDatasetTypeProperties.class);
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
