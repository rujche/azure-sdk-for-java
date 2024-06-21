// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for DnsPrivateViews Get.
 */
public final class DnsPrivateViewsGetSamples {
    /*
     * x-ms-original-file:
     * specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dnsPrivateViews_get.
     * json
     */
    /**
     * Sample code: Get a DnsPrivateView by name.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        getADnsPrivateViewByName(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.dnsPrivateViews().getWithResponse("eastus", "ocid1....aaaaaa", com.azure.core.util.Context.NONE);
    }
}
