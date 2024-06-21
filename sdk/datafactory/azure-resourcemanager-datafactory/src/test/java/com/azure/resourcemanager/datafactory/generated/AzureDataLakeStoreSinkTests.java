// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataLakeStoreSink;

public final class AzureDataLakeStoreSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataLakeStoreSink model = BinaryData.fromString(
            "{\"type\":\"AzureDataLakeStoreSink\",\"copyBehavior\":\"databwarljplk\",\"enableAdlsSingleFileParallel\":\"datamxcdreqaqvspsy\",\"writeBatchSize\":\"dataarwtkrbscw\",\"writeBatchTimeout\":\"datawvwmcrhyo\",\"sinkRetryCount\":\"datatplmy\",\"sinkRetryWait\":\"datahvyj\",\"maxConcurrentConnections\":\"dataerh\",\"disableMetricsCollection\":\"datastiawywppq\",\"\":{\"bwsftytpjmufd\":\"dataxbdyczplmljcis\",\"ympsxmoad\":\"datanhqlzantahuykxs\",\"jvlzqsyvr\":\"dataiqnsmpfe\",\"bobx\":\"dataoleqikcorkem\"}}")
            .toObject(AzureDataLakeStoreSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataLakeStoreSink model = new AzureDataLakeStoreSink().withWriteBatchSize("dataarwtkrbscw")
            .withWriteBatchTimeout("datawvwmcrhyo")
            .withSinkRetryCount("datatplmy")
            .withSinkRetryWait("datahvyj")
            .withMaxConcurrentConnections("dataerh")
            .withDisableMetricsCollection("datastiawywppq")
            .withCopyBehavior("databwarljplk")
            .withEnableAdlsSingleFileParallel("datamxcdreqaqvspsy");
        model = BinaryData.fromObject(model).toObject(AzureDataLakeStoreSink.class);
    }
}
