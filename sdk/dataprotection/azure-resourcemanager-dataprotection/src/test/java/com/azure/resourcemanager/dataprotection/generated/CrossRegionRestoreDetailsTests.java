// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreDetails;
import org.junit.jupiter.api.Assertions;

public final class CrossRegionRestoreDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CrossRegionRestoreDetails model
            = BinaryData.fromString("{\"sourceRegion\":\"hprwmdyv\",\"sourceBackupInstanceId\":\"qtayri\"}")
                .toObject(CrossRegionRestoreDetails.class);
        Assertions.assertEquals("hprwmdyv", model.sourceRegion());
        Assertions.assertEquals("qtayri", model.sourceBackupInstanceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CrossRegionRestoreDetails model
            = new CrossRegionRestoreDetails().withSourceRegion("hprwmdyv").withSourceBackupInstanceId("qtayri");
        model = BinaryData.fromObject(model).toObject(CrossRegionRestoreDetails.class);
        Assertions.assertEquals("hprwmdyv", model.sourceRegion());
        Assertions.assertEquals("qtayri", model.sourceBackupInstanceId());
    }
}
