// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

/**
 * Samples for Evidence CreateOrUpdate.
 */
public final class EvidenceCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/
     * examples/Evidence_CreateOrUpdate.json
     */
    /**
     * Sample code: Evidence_CreateOrUpdate.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void evidenceCreateOrUpdate(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.evidences()
            .createOrUpdateWithResponse("testReportName", "evidence1", null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
