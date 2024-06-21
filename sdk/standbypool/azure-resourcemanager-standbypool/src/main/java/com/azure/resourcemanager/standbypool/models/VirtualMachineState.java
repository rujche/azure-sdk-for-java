// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * State of standby virtual machines.
 */
public final class VirtualMachineState extends ExpandableStringEnum<VirtualMachineState> {
    /**
     * Static value Running for VirtualMachineState.
     */
    public static final VirtualMachineState RUNNING = fromString("Running");

    /**
     * Static value Deallocated for VirtualMachineState.
     */
    public static final VirtualMachineState DEALLOCATED = fromString("Deallocated");

    /**
     * Creates a new instance of VirtualMachineState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualMachineState() {
    }

    /**
     * Creates or finds a VirtualMachineState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VirtualMachineState.
     */
    public static VirtualMachineState fromString(String name) {
        return fromString(name, VirtualMachineState.class);
    }

    /**
     * Gets known VirtualMachineState values.
     * 
     * @return known VirtualMachineState values.
     */
    public static Collection<VirtualMachineState> values() {
        return values(VirtualMachineState.class);
    }
}
