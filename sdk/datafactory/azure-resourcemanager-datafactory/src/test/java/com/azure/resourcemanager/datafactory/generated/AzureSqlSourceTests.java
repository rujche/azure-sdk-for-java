// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureSqlSource;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;

public final class AzureSqlSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSqlSource model = BinaryData.fromString(
            "{\"type\":\"AzureSqlSource\",\"sqlReaderQuery\":\"datavxea\",\"sqlReaderStoredProcedureName\":\"dataf\",\"storedProcedureParameters\":\"datahw\",\"isolationLevel\":\"dataunptsry\",\"produceAdditionalTypes\":\"dataa\",\"partitionOption\":\"databwbxvsytbx\",\"partitionSettings\":{\"partitionColumnName\":\"databaddlmj\",\"partitionUpperBound\":\"datali\",\"partitionLowerBound\":\"datarc\"},\"queryTimeout\":\"datathluzey\",\"additionalColumns\":\"datalezkyfykmnrea\",\"sourceRetryCount\":\"datawepqegtytby\",\"sourceRetryWait\":\"dataeufutfq\",\"maxConcurrentConnections\":\"datawvnjgjrykshiz\",\"disableMetricsCollection\":\"datasw\",\"\":{\"emeft\":\"dataewvskzwqzwsguipq\"}}")
            .toObject(AzureSqlSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSqlSource model = new AzureSqlSource().withSourceRetryCount("datawepqegtytby")
            .withSourceRetryWait("dataeufutfq")
            .withMaxConcurrentConnections("datawvnjgjrykshiz")
            .withDisableMetricsCollection("datasw")
            .withQueryTimeout("datathluzey")
            .withAdditionalColumns("datalezkyfykmnrea")
            .withSqlReaderQuery("datavxea")
            .withSqlReaderStoredProcedureName("dataf")
            .withStoredProcedureParameters("datahw")
            .withIsolationLevel("dataunptsry")
            .withProduceAdditionalTypes("dataa")
            .withPartitionOption("databwbxvsytbx")
            .withPartitionSettings(new SqlPartitionSettings().withPartitionColumnName("databaddlmj")
                .withPartitionUpperBound("datali")
                .withPartitionLowerBound("datarc"));
        model = BinaryData.fromObject(model).toObject(AzureSqlSource.class);
    }
}
