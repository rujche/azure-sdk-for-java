// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Dynamic memory enabled.
 */
public final class DynamicMemoryEnabled extends ExpandableStringEnum<DynamicMemoryEnabled> {
    /**
     * Static value true for DynamicMemoryEnabled.
     */
    public static final DynamicMemoryEnabled TRUE = fromString("true");

    /**
     * Static value false for DynamicMemoryEnabled.
     */
    public static final DynamicMemoryEnabled FALSE = fromString("false");

    /**
     * Creates a new instance of DynamicMemoryEnabled value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DynamicMemoryEnabled() {
    }

    /**
     * Creates or finds a DynamicMemoryEnabled from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DynamicMemoryEnabled.
     */
    public static DynamicMemoryEnabled fromString(String name) {
        return fromString(name, DynamicMemoryEnabled.class);
    }

    /**
     * Gets known DynamicMemoryEnabled values.
     * 
     * @return known DynamicMemoryEnabled values.
     */
    public static Collection<DynamicMemoryEnabled> values() {
        return values(DynamicMemoryEnabled.class);
    }
}
