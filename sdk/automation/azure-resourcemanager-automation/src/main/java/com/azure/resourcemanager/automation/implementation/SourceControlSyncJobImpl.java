// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobInner;
import com.azure.resourcemanager.automation.models.ProvisioningState;
import com.azure.resourcemanager.automation.models.SourceControlSyncJob;
import com.azure.resourcemanager.automation.models.SourceControlSyncJobCreateParameters;
import com.azure.resourcemanager.automation.models.SyncType;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class SourceControlSyncJobImpl implements SourceControlSyncJob, SourceControlSyncJob.Definition {
    private SourceControlSyncJobInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    SourceControlSyncJobImpl(
        SourceControlSyncJobInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String sourceControlSyncJobId() {
        return this.innerModel().sourceControlSyncJobId();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public SyncType syncType() {
        return this.innerModel().syncType();
    }

    public SourceControlSyncJobInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String sourceControlName;

    private UUID sourceControlSyncJobId;

    private SourceControlSyncJobCreateParameters createParameters;

    public SourceControlSyncJobImpl withExistingSourceControl(
        String resourceGroupName, String automationAccountName, String sourceControlName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        this.sourceControlName = sourceControlName;
        return this;
    }

    public SourceControlSyncJob create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControlSyncJobs()
                .createWithResponse(
                    resourceGroupName,
                    automationAccountName,
                    sourceControlName,
                    sourceControlSyncJobId,
                    createParameters,
                    Context.NONE)
                .getValue();
        return this;
    }

    public SourceControlSyncJob create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControlSyncJobs()
                .createWithResponse(
                    resourceGroupName,
                    automationAccountName,
                    sourceControlName,
                    sourceControlSyncJobId,
                    createParameters,
                    context)
                .getValue();
        return this;
    }

    SourceControlSyncJobImpl(UUID name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new SourceControlSyncJobInner();
        this.serviceManager = serviceManager;
        this.sourceControlSyncJobId = name;
        this.createParameters = new SourceControlSyncJobCreateParameters();
    }

    public SourceControlSyncJobImpl withCommitId(String commitId) {
        this.createParameters.withCommitId(commitId);
        return this;
    }
}
