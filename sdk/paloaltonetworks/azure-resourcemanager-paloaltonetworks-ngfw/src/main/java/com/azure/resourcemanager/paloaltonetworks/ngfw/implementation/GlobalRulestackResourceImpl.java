// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.GlobalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AzureResourceManagerManagedIdentityProperties;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.GlobalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServices;
import java.util.Collections;
import java.util.List;

public final class GlobalRulestackResourceImpl implements GlobalRulestackResource {
    private GlobalRulestackResourceInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    GlobalRulestackResourceImpl(GlobalRulestackResourceInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public AzureResourceManagerManagedIdentityProperties identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String panEtag() {
        return this.innerModel().panEtag();
    }

    public String panLocation() {
        return this.innerModel().panLocation();
    }

    public ScopeType scope() {
        return this.innerModel().scope();
    }

    public List<String> associatedSubscriptions() {
        List<String> inner = this.innerModel().associatedSubscriptions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String description() {
        return this.innerModel().description();
    }

    public DefaultMode defaultMode() {
        return this.innerModel().defaultMode();
    }

    public String minAppIdVersion() {
        return this.innerModel().minAppIdVersion();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SecurityServices securityServices() {
        return this.innerModel().securityServices();
    }

    public GlobalRulestackResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
