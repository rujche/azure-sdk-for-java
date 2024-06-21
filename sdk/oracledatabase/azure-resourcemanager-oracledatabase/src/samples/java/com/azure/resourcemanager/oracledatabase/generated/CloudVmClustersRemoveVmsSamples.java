// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.resourcemanager.oracledatabase.models.AddRemoveDbNode;
import java.util.Arrays;

/**
 * Samples for CloudVmClusters RemoveVms.
 */
public final class CloudVmClustersRemoveVmsSamples {
    /*
     * x-ms-original-file:
     * specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_removeVms.
     * json
     */
    /**
     * Sample code: Remove VMs from VM Cluster.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void removeVMsFromVMCluster(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.cloudVmClusters()
            .removeVms("rg000", "cluster1", new AddRemoveDbNode().withDbServers(Arrays.asList("ocid1..aaaa")),
                com.azure.core.util.Context.NONE);
    }
}
