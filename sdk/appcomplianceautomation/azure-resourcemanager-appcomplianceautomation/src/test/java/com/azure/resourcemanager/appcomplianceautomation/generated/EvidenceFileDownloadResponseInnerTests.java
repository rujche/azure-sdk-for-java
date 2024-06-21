// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.EvidenceFileDownloadResponseInner;

public final class EvidenceFileDownloadResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EvidenceFileDownloadResponseInner model = BinaryData.fromString("{\"evidenceFile\":{\"url\":\"h\"}}")
            .toObject(EvidenceFileDownloadResponseInner.class);
    }
}
