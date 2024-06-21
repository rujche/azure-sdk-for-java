// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ImpalaSource;

public final class ImpalaSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImpalaSource model = BinaryData.fromString(
            "{\"type\":\"ImpalaSource\",\"query\":\"dataayo\",\"queryTimeout\":\"dataetzcxlisvqfb\",\"additionalColumns\":\"dataizxp\",\"sourceRetryCount\":\"datapsaploex\",\"sourceRetryWait\":\"datamvlocd\",\"maxConcurrentConnections\":\"datahkob\",\"disableMetricsCollection\":\"datahhipn\",\"\":{\"n\":\"datadyriw\"}}")
            .toObject(ImpalaSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImpalaSource model = new ImpalaSource().withSourceRetryCount("datapsaploex")
            .withSourceRetryWait("datamvlocd")
            .withMaxConcurrentConnections("datahkob")
            .withDisableMetricsCollection("datahhipn")
            .withQueryTimeout("dataetzcxlisvqfb")
            .withAdditionalColumns("dataizxp")
            .withQuery("dataayo");
        model = BinaryData.fromObject(model).toObject(ImpalaSource.class);
    }
}
