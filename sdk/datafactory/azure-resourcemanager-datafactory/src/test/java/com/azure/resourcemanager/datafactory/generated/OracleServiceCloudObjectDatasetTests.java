// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.OracleServiceCloudObjectDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OracleServiceCloudObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleServiceCloudObjectDataset model = BinaryData.fromString(
            "{\"type\":\"OracleServiceCloudObject\",\"typeProperties\":{\"tableName\":\"datazgfhzdzahktxvcbi\"},\"description\":\"ecthotbkjwh\",\"structure\":\"datapxjvtwk\",\"schema\":\"datadpay\",\"linkedServiceName\":{\"referenceName\":\"opqiwuzrg\",\"parameters\":{\"qqjobsyn\":\"datajfkgb\",\"onjqhdheosx\":\"dataen\",\"wypphtjtntcwgpd\":\"datawfudmpf\",\"spkvrmp\":\"databglaecctokfspvjr\"}},\"parameters\":{\"gmc\":{\"type\":\"Float\",\"defaultValue\":\"datatwjwiyyeo\"},\"ioxbgom\":{\"type\":\"Object\",\"defaultValue\":\"datamvphwfnugslvfz\"}},\"annotations\":[\"dataprpmo\",\"dataxnwcgzuoxixtx\"],\"folder\":{\"name\":\"jsehbknnrnk\"},\"\":{\"zehcz\":\"dataawpcbso\",\"sxvppkjealkdb\":\"datanivco\",\"vbmyzuqfdqdktrj\":\"datawho\",\"szhh\":\"datao\"}}")
            .toObject(OracleServiceCloudObjectDataset.class);
        Assertions.assertEquals("ecthotbkjwh", model.description());
        Assertions.assertEquals("opqiwuzrg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("gmc").type());
        Assertions.assertEquals("jsehbknnrnk", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleServiceCloudObjectDataset model = new OracleServiceCloudObjectDataset().withDescription("ecthotbkjwh")
            .withStructure("datapxjvtwk")
            .withSchema("datadpay")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("opqiwuzrg")
                .withParameters(mapOf("qqjobsyn", "datajfkgb", "onjqhdheosx", "dataen", "wypphtjtntcwgpd",
                    "datawfudmpf", "spkvrmp", "databglaecctokfspvjr")))
            .withParameters(mapOf("gmc",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datatwjwiyyeo"), "ioxbgom",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datamvphwfnugslvfz")))
            .withAnnotations(Arrays.asList("dataprpmo", "dataxnwcgzuoxixtx"))
            .withFolder(new DatasetFolder().withName("jsehbknnrnk"))
            .withTableName("datazgfhzdzahktxvcbi");
        model = BinaryData.fromObject(model).toObject(OracleServiceCloudObjectDataset.class);
        Assertions.assertEquals("ecthotbkjwh", model.description());
        Assertions.assertEquals("opqiwuzrg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("gmc").type());
        Assertions.assertEquals("jsehbknnrnk", model.folder().name());
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
