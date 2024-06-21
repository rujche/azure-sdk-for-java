// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * DayOfWeekName enum.
 */
public final class DayOfWeekName extends ExpandableStringEnum<DayOfWeekName> {
    /**
     * Static value Monday for DayOfWeekName.
     */
    public static final DayOfWeekName MONDAY = fromString("Monday");

    /**
     * Static value Tuesday for DayOfWeekName.
     */
    public static final DayOfWeekName TUESDAY = fromString("Tuesday");

    /**
     * Static value Wednesday for DayOfWeekName.
     */
    public static final DayOfWeekName WEDNESDAY = fromString("Wednesday");

    /**
     * Static value Thursday for DayOfWeekName.
     */
    public static final DayOfWeekName THURSDAY = fromString("Thursday");

    /**
     * Static value Friday for DayOfWeekName.
     */
    public static final DayOfWeekName FRIDAY = fromString("Friday");

    /**
     * Static value Saturday for DayOfWeekName.
     */
    public static final DayOfWeekName SATURDAY = fromString("Saturday");

    /**
     * Static value Sunday for DayOfWeekName.
     */
    public static final DayOfWeekName SUNDAY = fromString("Sunday");

    /**
     * Creates a new instance of DayOfWeekName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DayOfWeekName() {
    }

    /**
     * Creates or finds a DayOfWeekName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DayOfWeekName.
     */
    public static DayOfWeekName fromString(String name) {
        return fromString(name, DayOfWeekName.class);
    }

    /**
     * Gets known DayOfWeekName values.
     * 
     * @return known DayOfWeekName values.
     */
    public static Collection<DayOfWeekName> values() {
        return values(DayOfWeekName.class);
    }
}
