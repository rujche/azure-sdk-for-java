// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kusto.models.DatabaseShareOrigin;
import com.azure.resourcemanager.kusto.models.DatabaseStatistics;
import com.azure.resourcemanager.kusto.models.PrincipalsModificationKind;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.azure.resourcemanager.kusto.models.TableLevelSharingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Class representing the Kusto database properties. */
@Fluent
public final class ReadOnlyFollowingDatabaseProperties {
    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     */
    @JsonProperty(value = "softDeletePeriod", access = JsonProperty.Access.WRITE_ONLY)
    private Duration softDeletePeriod;

    /*
     * The time the data should be kept in cache for fast queries in TimeSpan.
     */
    @JsonProperty(value = "hotCachePeriod")
    private Duration hotCachePeriod;

    /*
     * The statistics of the database.
     */
    @JsonProperty(value = "statistics", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseStatistics statistics;

    /*
     * The name of the leader cluster
     */
    @JsonProperty(value = "leaderClusterResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String leaderClusterResourceId;

    /*
     * The name of the attached database configuration cluster
     */
    @JsonProperty(value = "attachedDatabaseConfigurationName", access = JsonProperty.Access.WRITE_ONLY)
    private String attachedDatabaseConfigurationName;

    /*
     * The principals modification kind of the database
     */
    @JsonProperty(value = "principalsModificationKind", access = JsonProperty.Access.WRITE_ONLY)
    private PrincipalsModificationKind principalsModificationKind;

    /*
     * Table level sharing specifications
     */
    @JsonProperty(value = "tableLevelSharingProperties", access = JsonProperty.Access.WRITE_ONLY)
    private TableLevelSharingProperties tableLevelSharingProperties;

    /*
     * The original database name, before databaseNameOverride or databaseNamePrefix where applied.
     */
    @JsonProperty(value = "originalDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String originalDatabaseName;

    /*
     * The origin of the following setup.
     */
    @JsonProperty(value = "databaseShareOrigin", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseShareOrigin databaseShareOrigin;

    /** Creates an instance of ReadOnlyFollowingDatabaseProperties class. */
    public ReadOnlyFollowingDatabaseProperties() {
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the softDeletePeriod property: The time the data should be kept before it stops being accessible to queries
     * in TimeSpan.
     *
     * @return the softDeletePeriod value.
     */
    public Duration softDeletePeriod() {
        return this.softDeletePeriod;
    }

    /**
     * Get the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @return the hotCachePeriod value.
     */
    public Duration hotCachePeriod() {
        return this.hotCachePeriod;
    }

    /**
     * Set the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @param hotCachePeriod the hotCachePeriod value to set.
     * @return the ReadOnlyFollowingDatabaseProperties object itself.
     */
    public ReadOnlyFollowingDatabaseProperties withHotCachePeriod(Duration hotCachePeriod) {
        this.hotCachePeriod = hotCachePeriod;
        return this;
    }

    /**
     * Get the statistics property: The statistics of the database.
     *
     * @return the statistics value.
     */
    public DatabaseStatistics statistics() {
        return this.statistics;
    }

    /**
     * Get the leaderClusterResourceId property: The name of the leader cluster.
     *
     * @return the leaderClusterResourceId value.
     */
    public String leaderClusterResourceId() {
        return this.leaderClusterResourceId;
    }

    /**
     * Get the attachedDatabaseConfigurationName property: The name of the attached database configuration cluster.
     *
     * @return the attachedDatabaseConfigurationName value.
     */
    public String attachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }

    /**
     * Get the principalsModificationKind property: The principals modification kind of the database.
     *
     * @return the principalsModificationKind value.
     */
    public PrincipalsModificationKind principalsModificationKind() {
        return this.principalsModificationKind;
    }

    /**
     * Get the tableLevelSharingProperties property: Table level sharing specifications.
     *
     * @return the tableLevelSharingProperties value.
     */
    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.tableLevelSharingProperties;
    }

    /**
     * Get the originalDatabaseName property: The original database name, before databaseNameOverride or
     * databaseNamePrefix where applied.
     *
     * @return the originalDatabaseName value.
     */
    public String originalDatabaseName() {
        return this.originalDatabaseName;
    }

    /**
     * Get the databaseShareOrigin property: The origin of the following setup.
     *
     * @return the databaseShareOrigin value.
     */
    public DatabaseShareOrigin databaseShareOrigin() {
        return this.databaseShareOrigin;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statistics() != null) {
            statistics().validate();
        }
        if (tableLevelSharingProperties() != null) {
            tableLevelSharingProperties().validate();
        }
    }
}
