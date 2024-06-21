// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for DailyDuration.
 */
public final class DailyDuration extends ExpandableStringEnum<DailyDuration> {
    /**
     * 1 day.
     */
    public static final DailyDuration ONE_DAY = fromInt(1);

    /**
     * 2 days.
     */
    public static final DailyDuration TWO_DAYS = fromInt(2);

    /**
     * 3 days.
     */
    public static final DailyDuration THREE_DAYS = fromInt(3);

    /**
     * 4 days.
     */
    public static final DailyDuration FOUR_DAYS = fromInt(4);

    /**
     * 5 days.
     */
    public static final DailyDuration FIVE_DAYS = fromInt(5);

    /**
     * 6 days.
     */
    public static final DailyDuration SIX_DAYS = fromInt(6);

    /**
     * 7 days.
     */
    public static final DailyDuration SEVEN_DAYS = fromInt(7);

    /**
     * Creates a new instance of DailyDuration value.
     * 
     * @deprecated Use the {@link #fromInt(int)} factory method.
     */
    @Deprecated
    public DailyDuration() {
    }

    /**
     * Creates or finds a DailyDuration from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DailyDuration.
     */
    public static DailyDuration fromInt(int name) {
        return fromString(String.valueOf(name), DailyDuration.class);
    }

    /**
     * Gets known DailyDuration values.
     * 
     * @return known DailyDuration values.
     */
    public static Collection<DailyDuration> values() {
        return values(DailyDuration.class);
    }
}
