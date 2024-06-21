// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapTablePartitionSettings;
import com.azure.resourcemanager.datafactory.models.SapTableSource;

public final class SapTableSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapTableSource model = BinaryData.fromString(
            "{\"type\":\"SapTableSource\",\"rowCount\":\"dataz\",\"rowSkips\":\"datanniarjezj\",\"rfcTableFields\":\"dataxiqfoqwesqykqfs\",\"rfcTableOptions\":\"datalsaipshhet\",\"batchSize\":\"datawmzgvnojgmobkali\",\"customRfcReadTableFunctionModule\":\"dataikkehpdssvlubd\",\"sapDataColumnDelimiter\":\"dataowxsxbxd\",\"partitionOption\":\"dataixurcekc\",\"partitionSettings\":{\"partitionColumnName\":\"dataqqa\",\"partitionUpperBound\":\"datatghmtb\",\"partitionLowerBound\":\"datakcnkghkr\",\"maxPartitionsNumber\":\"datarshlheayod\"},\"queryTimeout\":\"datawnqbpxy\",\"additionalColumns\":\"dataftxzovbhqels\",\"sourceRetryCount\":\"datafxejpocsgigsab\",\"sourceRetryWait\":\"datandyjwmglgstrzfhe\",\"maxConcurrentConnections\":\"datazovkbcbef\",\"disableMetricsCollection\":\"datanymfhmljimkg\",\"\":{\"eet\":\"datavmtjcxigiszxdbgl\",\"izw\":\"dataivmbu\",\"juls\":\"datawfhfptbdxtvl\",\"zytxe\":\"datafi\"}}")
            .toObject(SapTableSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapTableSource model = new SapTableSource().withSourceRetryCount("datafxejpocsgigsab")
            .withSourceRetryWait("datandyjwmglgstrzfhe")
            .withMaxConcurrentConnections("datazovkbcbef")
            .withDisableMetricsCollection("datanymfhmljimkg")
            .withQueryTimeout("datawnqbpxy")
            .withAdditionalColumns("dataftxzovbhqels")
            .withRowCount("dataz")
            .withRowSkips("datanniarjezj")
            .withRfcTableFields("dataxiqfoqwesqykqfs")
            .withRfcTableOptions("datalsaipshhet")
            .withBatchSize("datawmzgvnojgmobkali")
            .withCustomRfcReadTableFunctionModule("dataikkehpdssvlubd")
            .withSapDataColumnDelimiter("dataowxsxbxd")
            .withPartitionOption("dataixurcekc")
            .withPartitionSettings(new SapTablePartitionSettings().withPartitionColumnName("dataqqa")
                .withPartitionUpperBound("datatghmtb")
                .withPartitionLowerBound("datakcnkghkr")
                .withMaxPartitionsNumber("datarshlheayod"));
        model = BinaryData.fromObject(model).toObject(SapTableSource.class);
    }
}
