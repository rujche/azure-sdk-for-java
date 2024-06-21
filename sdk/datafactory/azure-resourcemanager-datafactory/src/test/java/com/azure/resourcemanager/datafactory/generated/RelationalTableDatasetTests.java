// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.RelationalTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RelationalTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RelationalTableDataset model = BinaryData.fromString(
            "{\"type\":\"RelationalTable\",\"typeProperties\":{\"tableName\":\"datacytjgoea\"},\"description\":\"krwfmihwpadhedb\",\"structure\":\"databdczvothmkhjao\",\"schema\":\"databwfcn\",\"linkedServiceName\":{\"referenceName\":\"hbpoelhscmyhrhj\",\"parameters\":{\"pqwojoev\":\"datafqbokndwp\"}},\"parameters\":{\"krbuoggtdltlcuha\":{\"type\":\"Int\",\"defaultValue\":\"datatdxmlynzlyvap\"},\"ylzeohlpsftq\":{\"type\":\"Bool\",\"defaultValue\":\"datajv\"},\"vbvvcpwtqsu\":{\"type\":\"Int\",\"defaultValue\":\"datam\"}},\"annotations\":[\"datahmz\",\"datadffetevr\"],\"folder\":{\"name\":\"k\"},\"\":{\"ctkhfh\":\"datacycsyo\",\"rmhnmizhvpr\":\"datasatvcs\"}}")
            .toObject(RelationalTableDataset.class);
        Assertions.assertEquals("krwfmihwpadhedb", model.description());
        Assertions.assertEquals("hbpoelhscmyhrhj", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("krbuoggtdltlcuha").type());
        Assertions.assertEquals("k", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RelationalTableDataset model = new RelationalTableDataset().withDescription("krwfmihwpadhedb")
            .withStructure("databdczvothmkhjao")
            .withSchema("databwfcn")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("hbpoelhscmyhrhj")
                .withParameters(mapOf("pqwojoev", "datafqbokndwp")))
            .withParameters(mapOf("krbuoggtdltlcuha",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datatdxmlynzlyvap"),
                "ylzeohlpsftq", new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datajv"),
                "vbvvcpwtqsu", new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datam")))
            .withAnnotations(Arrays.asList("datahmz", "datadffetevr"))
            .withFolder(new DatasetFolder().withName("k"))
            .withTableName("datacytjgoea");
        model = BinaryData.fromObject(model).toObject(RelationalTableDataset.class);
        Assertions.assertEquals("krwfmihwpadhedb", model.description());
        Assertions.assertEquals("hbpoelhscmyhrhj", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("krbuoggtdltlcuha").type());
        Assertions.assertEquals("k", model.folder().name());
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
