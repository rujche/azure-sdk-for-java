// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This property controls the logical grouping of VMs in upgrade domains (UDs). This property can't be modified if a
 * node type with multiple Availability Zones is already present in the cluster.
 */
public final class SfZonalUpgradeMode extends ExpandableStringEnum<SfZonalUpgradeMode> {
    /**
     * Static value Parallel for SfZonalUpgradeMode.
     */
    public static final SfZonalUpgradeMode PARALLEL = fromString("Parallel");

    /**
     * Static value Hierarchical for SfZonalUpgradeMode.
     */
    public static final SfZonalUpgradeMode HIERARCHICAL = fromString("Hierarchical");

    /**
     * Creates a new instance of SfZonalUpgradeMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SfZonalUpgradeMode() {
    }

    /**
     * Creates or finds a SfZonalUpgradeMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SfZonalUpgradeMode.
     */
    @JsonCreator
    public static SfZonalUpgradeMode fromString(String name) {
        return fromString(name, SfZonalUpgradeMode.class);
    }

    /**
     * Gets known SfZonalUpgradeMode values.
     * 
     * @return known SfZonalUpgradeMode values.
     */
    public static Collection<SfZonalUpgradeMode> values() {
        return values(SfZonalUpgradeMode.class);
    }
}
