// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.RestoreRequestInner;
import com.azure.resourcemanager.appservice.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.models.DatabaseType;
import java.util.Arrays;

/**
 * Samples for WebApps Restore.
 */
public final class WebAppsRestoreSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/RestoreWebAppBackup.json
     */
    /**
     * Sample code: Restore web app from backup.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void restoreWebAppFromBackup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getWebApps().restore("testrg123", "sitef6141", "123244",
            new RestoreRequestInner()
                .withStorageAccountUrl(
                    "DefaultEndpointsProtocol=https;AccountName=storagesample;AccountKey=<account-key>")
                .withOverwrite(true).withSiteName("sitef6141")
                .withDatabases(Arrays.asList(
                    new DatabaseBackupSetting().withDatabaseType(DatabaseType.SQL_AZURE).withName("backenddb")
                        .withConnectionStringName("backend")
                        .withConnectionString(
                            "DSN=data-source-name[;SERVER=value] [;PWD=value] [;UID=value] [;<Attribute>=<value>]"),
                    new DatabaseBackupSetting().withDatabaseType(DatabaseType.SQL_AZURE).withName("statsdb")
                        .withConnectionStringName("stats").withConnectionString(
                            "DSN=data-source-name[;SERVER=value] [;PWD=value] [;UID=value] [;<Attribute>=<value>]"))),
            com.azure.core.util.Context.NONE);
    }
}
