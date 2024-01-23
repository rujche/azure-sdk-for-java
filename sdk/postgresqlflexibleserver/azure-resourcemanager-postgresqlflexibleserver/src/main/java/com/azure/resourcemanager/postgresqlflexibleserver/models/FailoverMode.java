// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Failover mode.
 */
public final class FailoverMode extends ExpandableStringEnum<FailoverMode> {
    /**
     * Static value PlannedFailover for FailoverMode.
     */
    public static final FailoverMode PLANNED_FAILOVER = fromString("PlannedFailover");

    /**
     * Static value ForcedFailover for FailoverMode.
     */
    public static final FailoverMode FORCED_FAILOVER = fromString("ForcedFailover");

    /**
     * Static value PlannedSwitchover for FailoverMode.
     */
    public static final FailoverMode PLANNED_SWITCHOVER = fromString("PlannedSwitchover");

    /**
     * Static value ForcedSwitchover for FailoverMode.
     */
    public static final FailoverMode FORCED_SWITCHOVER = fromString("ForcedSwitchover");

    /**
     * Creates a new instance of FailoverMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FailoverMode() {
    }

    /**
     * Creates or finds a FailoverMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FailoverMode.
     */
    @JsonCreator
    public static FailoverMode fromString(String name) {
        return fromString(name, FailoverMode.class);
    }

    /**
     * Gets known FailoverMode values.
     * 
     * @return known FailoverMode values.
     */
    public static Collection<FailoverMode> values() {
        return values(FailoverMode.class);
    }
}
