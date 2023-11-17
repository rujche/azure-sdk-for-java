// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WorkflowTriggerHistories Resubmit.
 */
public final class WorkflowTriggerHistoriesResubmitSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/WorkflowTriggerHistories_Resubmit.
     * json
     */
    /**
     * Sample code: Resubmit a workflow run based on the trigger history.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        resubmitAWorkflowRunBasedOnTheTriggerHistory(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getWorkflowTriggerHistories().resubmit("testResourceGroup",
            "test-name", "testWorkflowName", "testTriggerName", "testHistoryName", com.azure.core.util.Context.NONE);
    }
}
