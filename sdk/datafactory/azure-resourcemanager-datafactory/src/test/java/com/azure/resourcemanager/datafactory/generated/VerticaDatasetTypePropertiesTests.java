// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.VerticaDatasetTypeProperties;

public final class VerticaDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VerticaDatasetTypeProperties model = BinaryData.fromString(
            "{\"tableName\":\"datafofkbcjzzwweob\",\"table\":\"datatdqzhixccnkfso\",\"schema\":\"datayoxmyqzyqepg\"}")
            .toObject(VerticaDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VerticaDatasetTypeProperties model = new VerticaDatasetTypeProperties().withTableName("datafofkbcjzzwweob")
            .withTable("datatdqzhixccnkfso")
            .withSchema("datayoxmyqzyqepg");
        model = BinaryData.fromObject(model).toObject(VerticaDatasetTypeProperties.class);
    }
}
