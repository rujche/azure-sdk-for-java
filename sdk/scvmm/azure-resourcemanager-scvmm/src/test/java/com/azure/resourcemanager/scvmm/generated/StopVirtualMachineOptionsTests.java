// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.SkipShutdown;
import com.azure.resourcemanager.scvmm.models.StopVirtualMachineOptions;
import org.junit.jupiter.api.Assertions;

public final class StopVirtualMachineOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StopVirtualMachineOptions model
            = BinaryData.fromString("{\"skipShutdown\":\"false\"}").toObject(StopVirtualMachineOptions.class);
        Assertions.assertEquals(SkipShutdown.FALSE, model.skipShutdown());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StopVirtualMachineOptions model = new StopVirtualMachineOptions().withSkipShutdown(SkipShutdown.FALSE);
        model = BinaryData.fromObject(model).toObject(StopVirtualMachineOptions.class);
        Assertions.assertEquals(SkipShutdown.FALSE, model.skipShutdown());
    }
}
