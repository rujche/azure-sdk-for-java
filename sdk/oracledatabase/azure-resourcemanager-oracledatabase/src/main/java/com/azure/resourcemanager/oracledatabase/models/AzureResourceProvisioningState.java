// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Azure Resource Provisioning State enum.
 */
public final class AzureResourceProvisioningState extends ExpandableStringEnum<AzureResourceProvisioningState> {
    /**
     * Static value Succeeded for AzureResourceProvisioningState.
     */
    public static final AzureResourceProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for AzureResourceProvisioningState.
     */
    public static final AzureResourceProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for AzureResourceProvisioningState.
     */
    public static final AzureResourceProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Provisioning for AzureResourceProvisioningState.
     */
    public static final AzureResourceProvisioningState PROVISIONING = fromString("Provisioning");

    /**
     * Creates a new instance of AzureResourceProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureResourceProvisioningState() {
    }

    /**
     * Creates or finds a AzureResourceProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureResourceProvisioningState.
     */
    public static AzureResourceProvisioningState fromString(String name) {
        return fromString(name, AzureResourceProvisioningState.class);
    }

    /**
     * Gets known AzureResourceProvisioningState values.
     * 
     * @return known AzureResourceProvisioningState values.
     */
    public static Collection<AzureResourceProvisioningState> values() {
        return values(AzureResourceProvisioningState.class);
    }
}
