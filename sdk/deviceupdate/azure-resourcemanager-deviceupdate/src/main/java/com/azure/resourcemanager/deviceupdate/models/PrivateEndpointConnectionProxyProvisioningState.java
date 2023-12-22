// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The current provisioning state.
 */
public final class PrivateEndpointConnectionProxyProvisioningState
    extends ExpandableStringEnum<PrivateEndpointConnectionProxyProvisioningState> {
    /**
     * Static value Succeeded for PrivateEndpointConnectionProxyProvisioningState.
     */
    public static final PrivateEndpointConnectionProxyProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Creating for PrivateEndpointConnectionProxyProvisioningState.
     */
    public static final PrivateEndpointConnectionProxyProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Deleting for PrivateEndpointConnectionProxyProvisioningState.
     */
    public static final PrivateEndpointConnectionProxyProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Failed for PrivateEndpointConnectionProxyProvisioningState.
     */
    public static final PrivateEndpointConnectionProxyProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of PrivateEndpointConnectionProxyProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateEndpointConnectionProxyProvisioningState() {
    }

    /**
     * Creates or finds a PrivateEndpointConnectionProxyProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointConnectionProxyProvisioningState.
     */
    @JsonCreator
    public static PrivateEndpointConnectionProxyProvisioningState fromString(String name) {
        return fromString(name, PrivateEndpointConnectionProxyProvisioningState.class);
    }

    /**
     * Gets known PrivateEndpointConnectionProxyProvisioningState values.
     * 
     * @return known PrivateEndpointConnectionProxyProvisioningState values.
     */
    public static Collection<PrivateEndpointConnectionProxyProvisioningState> values() {
        return values(PrivateEndpointConnectionProxyProvisioningState.class);
    }
}
