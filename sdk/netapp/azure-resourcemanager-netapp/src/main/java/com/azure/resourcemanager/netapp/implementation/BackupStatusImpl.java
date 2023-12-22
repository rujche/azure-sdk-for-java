// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.BackupStatusInner;
import com.azure.resourcemanager.netapp.models.BackupStatus;
import com.azure.resourcemanager.netapp.models.MirrorState;
import com.azure.resourcemanager.netapp.models.RelationshipStatus;

public final class BackupStatusImpl implements BackupStatus {
    private BackupStatusInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    BackupStatusImpl(BackupStatusInner innerObject,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean healthy() {
        return this.innerModel().healthy();
    }

    public RelationshipStatus relationshipStatus() {
        return this.innerModel().relationshipStatus();
    }

    public MirrorState mirrorState() {
        return this.innerModel().mirrorState();
    }

    public String unhealthyReason() {
        return this.innerModel().unhealthyReason();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public Long lastTransferSize() {
        return this.innerModel().lastTransferSize();
    }

    public String lastTransferType() {
        return this.innerModel().lastTransferType();
    }

    public Long totalTransferBytes() {
        return this.innerModel().totalTransferBytes();
    }

    public Long transferProgressBytes() {
        return this.innerModel().transferProgressBytes();
    }

    public BackupStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
