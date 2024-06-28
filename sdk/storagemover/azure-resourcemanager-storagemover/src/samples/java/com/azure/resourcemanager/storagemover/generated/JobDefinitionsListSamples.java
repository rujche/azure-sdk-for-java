// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/**
 * Samples for JobDefinitions List.
 */
public final class JobDefinitionsListSamples {
    /*
     * x-ms-original-file:
     * specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2024-07-01/examples/JobDefinitions_List
     * .json
     */
    /**
     * Sample code: JobDefinitions_List.
     * 
     * @param manager Entry point to StorageMoverManager.
     */
    public static void jobDefinitionsList(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager.jobDefinitions()
            .list("examples-rg", "examples-storageMoverName", "examples-projectName", com.azure.core.util.Context.NONE);
    }
}
