// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Traffic control permission. */
public final class TrafficControlPermission extends ExpandableStringEnum<TrafficControlPermission> {
    /** Static value Enabled for TrafficControlPermission. */
    public static final TrafficControlPermission ENABLED = fromString("Enabled");

    /** Static value Blocked for TrafficControlPermission. */
    public static final TrafficControlPermission BLOCKED = fromString("Blocked");

    /**
     * Creates or finds a TrafficControlPermission from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrafficControlPermission.
     */
    @JsonCreator
    public static TrafficControlPermission fromString(String name) {
        return fromString(name, TrafficControlPermission.class);
    }

    /**
     * Gets known TrafficControlPermission values.
     *
     * @return known TrafficControlPermission values.
     */
    public static Collection<TrafficControlPermission> values() {
        return values(TrafficControlPermission.class);
    }
}
