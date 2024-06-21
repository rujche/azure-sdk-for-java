// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.models.AzureEntityResource;
import com.azure.resourcemanager.storage.models.EnabledProtocols;
import com.azure.resourcemanager.storage.models.LeaseDuration;
import com.azure.resourcemanager.storage.models.LeaseState;
import com.azure.resourcemanager.storage.models.LeaseStatus;
import com.azure.resourcemanager.storage.models.RootSquashType;
import com.azure.resourcemanager.storage.models.ShareAccessTier;
import com.azure.resourcemanager.storage.models.SignedIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * The file share properties be listed out.
 */
@Fluent
public final class FileShareItemInner extends AzureEntityResource {
    /*
     * The file share properties be listed out.
     */
    @JsonProperty(value = "properties")
    private FileShareProperties innerProperties;

    /**
     * Creates an instance of FileShareItemInner class.
     */
    public FileShareItemInner() {
    }

    /**
     * Get the innerProperties property: The file share properties be listed out.
     * 
     * @return the innerProperties value.
     */
    private FileShareProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the lastModifiedTime property: Returns the date and time the share was last modified.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the metadata property: A name-value pair to associate with the share as metadata.
     * 
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: A name-value pair to associate with the share as metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withMetadata(Map<String, String> metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileShareProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the shareQuota property: The maximum size of the share, in gigabytes. Must be greater than 0, and less than
     * or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     * 
     * @return the shareQuota value.
     */
    public Integer shareQuota() {
        return this.innerProperties() == null ? null : this.innerProperties().shareQuota();
    }

    /**
     * Set the shareQuota property: The maximum size of the share, in gigabytes. Must be greater than 0, and less than
     * or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     * 
     * @param shareQuota the shareQuota value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withShareQuota(Integer shareQuota) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileShareProperties();
        }
        this.innerProperties().withShareQuota(shareQuota);
        return this;
    }

    /**
     * Get the enabledProtocols property: The authentication protocol that is used for the file share. Can only be
     * specified when creating a share.
     * 
     * @return the enabledProtocols value.
     */
    public EnabledProtocols enabledProtocols() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledProtocols();
    }

    /**
     * Set the enabledProtocols property: The authentication protocol that is used for the file share. Can only be
     * specified when creating a share.
     * 
     * @param enabledProtocols the enabledProtocols value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withEnabledProtocols(EnabledProtocols enabledProtocols) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileShareProperties();
        }
        this.innerProperties().withEnabledProtocols(enabledProtocols);
        return this;
    }

    /**
     * Get the rootSquash property: The property is for NFS share only. The default is NoRootSquash.
     * 
     * @return the rootSquash value.
     */
    public RootSquashType rootSquash() {
        return this.innerProperties() == null ? null : this.innerProperties().rootSquash();
    }

    /**
     * Set the rootSquash property: The property is for NFS share only. The default is NoRootSquash.
     * 
     * @param rootSquash the rootSquash value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withRootSquash(RootSquashType rootSquash) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileShareProperties();
        }
        this.innerProperties().withRootSquash(rootSquash);
        return this;
    }

    /**
     * Get the version property: The version of the share.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the deleted property: Indicates whether the share was deleted.
     * 
     * @return the deleted value.
     */
    public Boolean deleted() {
        return this.innerProperties() == null ? null : this.innerProperties().deleted();
    }

    /**
     * Get the deletedTime property: The deleted time if the share was deleted.
     * 
     * @return the deletedTime value.
     */
    public OffsetDateTime deletedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().deletedTime();
    }

    /**
     * Get the remainingRetentionDays property: Remaining retention days for share that was soft deleted.
     * 
     * @return the remainingRetentionDays value.
     */
    public Integer remainingRetentionDays() {
        return this.innerProperties() == null ? null : this.innerProperties().remainingRetentionDays();
    }

    /**
     * Get the accessTier property: Access tier for specific share. GpV2 account can choose between TransactionOptimized
     * (default), Hot, and Cool. FileStorage account can choose Premium.
     * 
     * @return the accessTier value.
     */
    public ShareAccessTier accessTier() {
        return this.innerProperties() == null ? null : this.innerProperties().accessTier();
    }

    /**
     * Set the accessTier property: Access tier for specific share. GpV2 account can choose between TransactionOptimized
     * (default), Hot, and Cool. FileStorage account can choose Premium.
     * 
     * @param accessTier the accessTier value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withAccessTier(ShareAccessTier accessTier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileShareProperties();
        }
        this.innerProperties().withAccessTier(accessTier);
        return this;
    }

    /**
     * Get the accessTierChangeTime property: Indicates the last modification time for share access tier.
     * 
     * @return the accessTierChangeTime value.
     */
    public OffsetDateTime accessTierChangeTime() {
        return this.innerProperties() == null ? null : this.innerProperties().accessTierChangeTime();
    }

    /**
     * Get the accessTierStatus property: Indicates if there is a pending transition for access tier.
     * 
     * @return the accessTierStatus value.
     */
    public String accessTierStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().accessTierStatus();
    }

    /**
     * Get the shareUsageBytes property: The approximate size of the data stored on the share. Note that this value may
     * not include all recently created or recently resized files.
     * 
     * @return the shareUsageBytes value.
     */
    public Long shareUsageBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().shareUsageBytes();
    }

    /**
     * Get the leaseStatus property: The lease status of the share.
     * 
     * @return the leaseStatus value.
     */
    public LeaseStatus leaseStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().leaseStatus();
    }

    /**
     * Get the leaseState property: Lease state of the share.
     * 
     * @return the leaseState value.
     */
    public LeaseState leaseState() {
        return this.innerProperties() == null ? null : this.innerProperties().leaseState();
    }

    /**
     * Get the leaseDuration property: Specifies whether the lease on a share is of infinite or fixed duration, only
     * when the share is leased.
     * 
     * @return the leaseDuration value.
     */
    public LeaseDuration leaseDuration() {
        return this.innerProperties() == null ? null : this.innerProperties().leaseDuration();
    }

    /**
     * Get the signedIdentifiers property: List of stored access policies specified on the share.
     * 
     * @return the signedIdentifiers value.
     */
    public List<SignedIdentifier> signedIdentifiers() {
        return this.innerProperties() == null ? null : this.innerProperties().signedIdentifiers();
    }

    /**
     * Set the signedIdentifiers property: List of stored access policies specified on the share.
     * 
     * @param signedIdentifiers the signedIdentifiers value to set.
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withSignedIdentifiers(List<SignedIdentifier> signedIdentifiers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileShareProperties();
        }
        this.innerProperties().withSignedIdentifiers(signedIdentifiers);
        return this;
    }

    /**
     * Get the snapshotTime property: Creation time of share snapshot returned in the response of list shares with
     * expand param "snapshots".
     * 
     * @return the snapshotTime value.
     */
    public OffsetDateTime snapshotTime() {
        return this.innerProperties() == null ? null : this.innerProperties().snapshotTime();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
