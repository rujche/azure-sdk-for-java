// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BlobSource;

public final class BlobSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobSource model = BinaryData.fromString(
            "{\"type\":\"BlobSource\",\"treatEmptyAsNull\":\"datadkhkizyx\",\"skipHeaderLineCount\":\"dataxnhubjwipfry\",\"recursive\":\"datapezzyrpdxyg\",\"sourceRetryCount\":\"dataqxsemezkpd\",\"sourceRetryWait\":\"dataowftfrqebrjopot\",\"maxConcurrentConnections\":\"dataekfxmg\",\"disableMetricsCollection\":\"datawwidnrds\",\"\":{\"pfdwh\":\"datahuiadyhodisypg\"}}")
            .toObject(BlobSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobSource model = new BlobSource().withSourceRetryCount("dataqxsemezkpd")
            .withSourceRetryWait("dataowftfrqebrjopot")
            .withMaxConcurrentConnections("dataekfxmg")
            .withDisableMetricsCollection("datawwidnrds")
            .withTreatEmptyAsNull("datadkhkizyx")
            .withSkipHeaderLineCount("dataxnhubjwipfry")
            .withRecursive("datapezzyrpdxyg");
        model = BinaryData.fromObject(model).toObject(BlobSource.class);
    }
}
