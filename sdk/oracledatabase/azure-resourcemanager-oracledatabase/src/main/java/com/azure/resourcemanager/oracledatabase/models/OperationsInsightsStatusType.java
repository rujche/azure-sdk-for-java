// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Operations Insights status type enum.
 */
public final class OperationsInsightsStatusType extends ExpandableStringEnum<OperationsInsightsStatusType> {
    /**
     * Static value Enabling for OperationsInsightsStatusType.
     */
    public static final OperationsInsightsStatusType ENABLING = fromString("Enabling");

    /**
     * Static value Enabled for OperationsInsightsStatusType.
     */
    public static final OperationsInsightsStatusType ENABLED = fromString("Enabled");

    /**
     * Static value Disabling for OperationsInsightsStatusType.
     */
    public static final OperationsInsightsStatusType DISABLING = fromString("Disabling");

    /**
     * Static value NotEnabled for OperationsInsightsStatusType.
     */
    public static final OperationsInsightsStatusType NOT_ENABLED = fromString("NotEnabled");

    /**
     * Static value FailedEnabling for OperationsInsightsStatusType.
     */
    public static final OperationsInsightsStatusType FAILED_ENABLING = fromString("FailedEnabling");

    /**
     * Static value FailedDisabling for OperationsInsightsStatusType.
     */
    public static final OperationsInsightsStatusType FAILED_DISABLING = fromString("FailedDisabling");

    /**
     * Creates a new instance of OperationsInsightsStatusType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationsInsightsStatusType() {
    }

    /**
     * Creates or finds a OperationsInsightsStatusType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperationsInsightsStatusType.
     */
    public static OperationsInsightsStatusType fromString(String name) {
        return fromString(name, OperationsInsightsStatusType.class);
    }

    /**
     * Gets known OperationsInsightsStatusType values.
     * 
     * @return known OperationsInsightsStatusType values.
     */
    public static Collection<OperationsInsightsStatusType> values() {
        return values(OperationsInsightsStatusType.class);
    }
}
