// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SybaseTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SybaseTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SybaseTableDataset model = BinaryData.fromString(
            "{\"type\":\"SybaseTable\",\"typeProperties\":{\"tableName\":\"datatbl\"},\"description\":\"vrj\",\"structure\":\"datanotdofqvpbqsdqk\",\"schema\":\"databqsbbmitaf\",\"linkedServiceName\":{\"referenceName\":\"azgcxsvqlcquf\",\"parameters\":{\"gc\":\"datamxow\"}},\"parameters\":{\"quksx\":{\"type\":\"Bool\",\"defaultValue\":\"dataehlkarvti\"},\"ggvmfnnbbx\":{\"type\":\"Object\",\"defaultValue\":\"datasgofunswhpce\"},\"deetxtpwcvgifws\":{\"type\":\"Array\",\"defaultValue\":\"datafkk\"},\"onbz\":{\"type\":\"String\",\"defaultValue\":\"datazijaciwmmpdtq\"}},\"annotations\":[\"datafzyviiwsua\",\"datazhw\",\"datayui\",\"datakzqqhbtfloilmkf\"],\"folder\":{\"name\":\"iipj\"},\"\":{\"tug\":\"datavyvuoikdlpsx\",\"swxvjelei\":\"datawimqnryclocfm\",\"aevyk\":\"dataqhdxtwwulkryb\"}}")
            .toObject(SybaseTableDataset.class);
        Assertions.assertEquals("vrj", model.description());
        Assertions.assertEquals("azgcxsvqlcquf", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("quksx").type());
        Assertions.assertEquals("iipj", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SybaseTableDataset model = new SybaseTableDataset().withDescription("vrj")
            .withStructure("datanotdofqvpbqsdqk")
            .withSchema("databqsbbmitaf")
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("azgcxsvqlcquf").withParameters(mapOf("gc", "datamxow")))
            .withParameters(mapOf("quksx",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataehlkarvti"),
                "ggvmfnnbbx",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datasgofunswhpce"),
                "deetxtpwcvgifws",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datafkk"), "onbz",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datazijaciwmmpdtq")))
            .withAnnotations(Arrays.asList("datafzyviiwsua", "datazhw", "datayui", "datakzqqhbtfloilmkf"))
            .withFolder(new DatasetFolder().withName("iipj"))
            .withTableName("datatbl");
        model = BinaryData.fromObject(model).toObject(SybaseTableDataset.class);
        Assertions.assertEquals("vrj", model.description());
        Assertions.assertEquals("azgcxsvqlcquf", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("quksx").type());
        Assertions.assertEquals("iipj", model.folder().name());
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
