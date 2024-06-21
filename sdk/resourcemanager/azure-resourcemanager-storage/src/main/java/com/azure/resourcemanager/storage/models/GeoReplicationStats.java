// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Statistics related to replication for storage account's Blob, Table, Queue and File services. It is only available
 * when geo-redundant replication is enabled for the storage account.
 */
@Immutable
public final class GeoReplicationStats {
    /*
     * The status of the secondary location. Possible values are: - Live: Indicates that the secondary location is
     * active and operational. - Bootstrap: Indicates initial synchronization from the primary location to the secondary
     * location is in progress.This typically occurs when replication is first enabled. - Unavailable: Indicates that
     * the secondary location is temporarily unavailable.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private GeoReplicationStatus status;

    /*
     * All primary writes preceding this UTC date/time value are guaranteed to be available for read operations. Primary
     * writes following this point in time may or may not be available for reads. Element may be default value if value
     * of LastSyncTime is not available, this can happen if secondary is offline or we are in bootstrap.
     */
    @JsonProperty(value = "lastSyncTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastSyncTime;

    /*
     * A boolean flag which indicates whether or not account failover is supported for the account.
     */
    @JsonProperty(value = "canFailover", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canFailover;

    /*
     * A boolean flag which indicates whether or not planned account failover is supported for the account.
     */
    @JsonProperty(value = "canPlannedFailover", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canPlannedFailover;

    /*
     * The redundancy type of the account after an account failover is performed.
     */
    @JsonProperty(value = "postFailoverRedundancy", access = JsonProperty.Access.WRITE_ONLY)
    private PostFailoverRedundancy postFailoverRedundancy;

    /*
     * The redundancy type of the account after a planned account failover is performed.
     */
    @JsonProperty(value = "postPlannedFailoverRedundancy", access = JsonProperty.Access.WRITE_ONLY)
    private PostPlannedFailoverRedundancy postPlannedFailoverRedundancy;

    /**
     * Creates an instance of GeoReplicationStats class.
     */
    public GeoReplicationStats() {
    }

    /**
     * Get the status property: The status of the secondary location. Possible values are: - Live: Indicates that the
     * secondary location is active and operational. - Bootstrap: Indicates initial synchronization from the primary
     * location to the secondary location is in progress.This typically occurs when replication is first enabled. -
     * Unavailable: Indicates that the secondary location is temporarily unavailable.
     * 
     * @return the status value.
     */
    public GeoReplicationStatus status() {
        return this.status;
    }

    /**
     * Get the lastSyncTime property: All primary writes preceding this UTC date/time value are guaranteed to be
     * available for read operations. Primary writes following this point in time may or may not be available for reads.
     * Element may be default value if value of LastSyncTime is not available, this can happen if secondary is offline
     * or we are in bootstrap.
     * 
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * Get the canFailover property: A boolean flag which indicates whether or not account failover is supported for the
     * account.
     * 
     * @return the canFailover value.
     */
    public Boolean canFailover() {
        return this.canFailover;
    }

    /**
     * Get the canPlannedFailover property: A boolean flag which indicates whether or not planned account failover is
     * supported for the account.
     * 
     * @return the canPlannedFailover value.
     */
    public Boolean canPlannedFailover() {
        return this.canPlannedFailover;
    }

    /**
     * Get the postFailoverRedundancy property: The redundancy type of the account after an account failover is
     * performed.
     * 
     * @return the postFailoverRedundancy value.
     */
    public PostFailoverRedundancy postFailoverRedundancy() {
        return this.postFailoverRedundancy;
    }

    /**
     * Get the postPlannedFailoverRedundancy property: The redundancy type of the account after a planned account
     * failover is performed.
     * 
     * @return the postPlannedFailoverRedundancy value.
     */
    public PostPlannedFailoverRedundancy postPlannedFailoverRedundancy() {
        return this.postPlannedFailoverRedundancy;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
