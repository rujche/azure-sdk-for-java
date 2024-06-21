// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CosmosDbMongoDbApiLinkedServiceTypeProperties;

public final class CosmosDbMongoDbApiLinkedServiceTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbMongoDbApiLinkedServiceTypeProperties model = BinaryData.fromString(
            "{\"isServerVersionAbove32\":\"datay\",\"connectionString\":\"dataijribeskkopbksri\",\"database\":\"datambtmorikcze\"}")
            .toObject(CosmosDbMongoDbApiLinkedServiceTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbMongoDbApiLinkedServiceTypeProperties model
            = new CosmosDbMongoDbApiLinkedServiceTypeProperties().withIsServerVersionAbove32("datay")
                .withConnectionString("dataijribeskkopbksri")
                .withDatabase("datambtmorikcze");
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiLinkedServiceTypeProperties.class);
    }
}
