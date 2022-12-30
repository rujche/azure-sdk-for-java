// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provisioning state. */
public final class TimeSeriesDatabaseConnectionState extends ExpandableStringEnum<TimeSeriesDatabaseConnectionState> {
    /** Static value Provisioning for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState PROVISIONING = fromString("Provisioning");

    /** Static value Deleting for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState DELETING = fromString("Deleting");

    /** Static value Updating for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState UPDATING = fromString("Updating");

    /** Static value Succeeded for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState FAILED = fromString("Failed");

    /** Static value Canceled for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState CANCELED = fromString("Canceled");

    /** Static value Deleted for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState DELETED = fromString("Deleted");

    /** Static value Warning for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState WARNING = fromString("Warning");

    /** Static value Suspending for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState SUSPENDING = fromString("Suspending");

    /** Static value Restoring for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState RESTORING = fromString("Restoring");

    /** Static value Moving for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState MOVING = fromString("Moving");

    /** Static value Disabled for TimeSeriesDatabaseConnectionState. */
    public static final TimeSeriesDatabaseConnectionState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a TimeSeriesDatabaseConnectionState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TimeSeriesDatabaseConnectionState.
     */
    @JsonCreator
    public static TimeSeriesDatabaseConnectionState fromString(String name) {
        return fromString(name, TimeSeriesDatabaseConnectionState.class);
    }

    /**
     * Gets known TimeSeriesDatabaseConnectionState values.
     *
     * @return known TimeSeriesDatabaseConnectionState values.
     */
    public static Collection<TimeSeriesDatabaseConnectionState> values() {
        return values(TimeSeriesDatabaseConnectionState.class);
    }
}
