// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.dashboard.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.dashboard.models.PrivateLinkResource;
import com.azure.resourcemanager.dashboard.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class PrivateLinkResourceImpl implements PrivateLinkResource {
    private PrivateLinkResourceInner innerObject;

    private final com.azure.resourcemanager.dashboard.DashboardManager serviceManager;

    PrivateLinkResourceImpl(PrivateLinkResourceInner innerObject,
        com.azure.resourcemanager.dashboard.DashboardManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String groupId() {
        return this.innerModel().groupId();
    }

    public List<String> requiredMembers() {
        List<String> inner = this.innerModel().requiredMembers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> requiredZoneNames() {
        List<String> inner = this.innerModel().requiredZoneNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dashboard.DashboardManager manager() {
        return this.serviceManager;
    }
}
