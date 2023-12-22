// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters in Policy.
 */
@Fluent
public final class PolicyParameters {
    /*
     * Gets or sets the DataStore Parameters
     */
    @JsonProperty(value = "dataStoreParametersList")
    private List<DataStoreParameters> dataStoreParametersList;

    /*
     * Gets or sets the Backup Data Source Parameters
     */
    @JsonProperty(value = "backupDatasourceParametersList")
    private List<BackupDatasourceParameters> backupDatasourceParametersList;

    /**
     * Creates an instance of PolicyParameters class.
     */
    public PolicyParameters() {
    }

    /**
     * Get the dataStoreParametersList property: Gets or sets the DataStore Parameters.
     * 
     * @return the dataStoreParametersList value.
     */
    public List<DataStoreParameters> dataStoreParametersList() {
        return this.dataStoreParametersList;
    }

    /**
     * Set the dataStoreParametersList property: Gets or sets the DataStore Parameters.
     * 
     * @param dataStoreParametersList the dataStoreParametersList value to set.
     * @return the PolicyParameters object itself.
     */
    public PolicyParameters withDataStoreParametersList(List<DataStoreParameters> dataStoreParametersList) {
        this.dataStoreParametersList = dataStoreParametersList;
        return this;
    }

    /**
     * Get the backupDatasourceParametersList property: Gets or sets the Backup Data Source Parameters.
     * 
     * @return the backupDatasourceParametersList value.
     */
    public List<BackupDatasourceParameters> backupDatasourceParametersList() {
        return this.backupDatasourceParametersList;
    }

    /**
     * Set the backupDatasourceParametersList property: Gets or sets the Backup Data Source Parameters.
     * 
     * @param backupDatasourceParametersList the backupDatasourceParametersList value to set.
     * @return the PolicyParameters object itself.
     */
    public PolicyParameters
        withBackupDatasourceParametersList(List<BackupDatasourceParameters> backupDatasourceParametersList) {
        this.backupDatasourceParametersList = backupDatasourceParametersList;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataStoreParametersList() != null) {
            dataStoreParametersList().forEach(e -> e.validate());
        }
        if (backupDatasourceParametersList() != null) {
            backupDatasourceParametersList().forEach(e -> e.validate());
        }
    }
}
