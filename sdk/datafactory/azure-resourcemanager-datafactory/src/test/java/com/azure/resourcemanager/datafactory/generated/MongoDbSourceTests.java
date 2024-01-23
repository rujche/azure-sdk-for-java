// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MongoDbSource;

public final class MongoDbSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbSource model = BinaryData.fromString(
            "{\"type\":\"MongoDbSource\",\"query\":\"datavyflkeqgxlj\",\"additionalColumns\":\"datatosiwcveq\",\"sourceRetryCount\":\"datahbw\",\"sourceRetryWait\":\"dataoc\",\"maxConcurrentConnections\":\"datazlfhhwdajfth\",\"disableMetricsCollection\":\"datawuomjd\",\"\":{\"qsniobehxxb\":\"datafq\",\"wkryzrdqpkqfuv\":\"dataeiobubtpyemp\"}}")
            .toObject(MongoDbSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbSource model = new MongoDbSource().withSourceRetryCount("datahbw").withSourceRetryWait("dataoc")
            .withMaxConcurrentConnections("datazlfhhwdajfth").withDisableMetricsCollection("datawuomjd")
            .withQuery("datavyflkeqgxlj").withAdditionalColumns("datatosiwcveq");
        model = BinaryData.fromObject(model).toObject(MongoDbSource.class);
    }
}
