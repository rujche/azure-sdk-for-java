// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning state of the Domain.
 */
public final class CustomDomainResourceProvisioningState
    extends ExpandableStringEnum<CustomDomainResourceProvisioningState> {
    /**
     * Static value Creating for CustomDomainResourceProvisioningState.
     */
    public static final CustomDomainResourceProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for CustomDomainResourceProvisioningState.
     */
    public static final CustomDomainResourceProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Succeeded for CustomDomainResourceProvisioningState.
     */
    public static final CustomDomainResourceProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for CustomDomainResourceProvisioningState.
     */
    public static final CustomDomainResourceProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Deleting for CustomDomainResourceProvisioningState.
     */
    public static final CustomDomainResourceProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of CustomDomainResourceProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomDomainResourceProvisioningState() {
    }

    /**
     * Creates or finds a CustomDomainResourceProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CustomDomainResourceProvisioningState.
     */
    @JsonCreator
    public static CustomDomainResourceProvisioningState fromString(String name) {
        return fromString(name, CustomDomainResourceProvisioningState.class);
    }

    /**
     * Gets known CustomDomainResourceProvisioningState values.
     * 
     * @return known CustomDomainResourceProvisioningState values.
     */
    public static Collection<CustomDomainResourceProvisioningState> values() {
        return values(CustomDomainResourceProvisioningState.class);
    }
}
