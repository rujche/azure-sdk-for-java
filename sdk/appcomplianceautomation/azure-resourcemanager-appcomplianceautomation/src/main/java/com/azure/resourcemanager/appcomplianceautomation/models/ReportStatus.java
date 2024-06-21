// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Report status.
 */
public final class ReportStatus extends ExpandableStringEnum<ReportStatus> {
    /**
     * Static value Active for ReportStatus.
     */
    public static final ReportStatus ACTIVE = fromString("Active");

    /**
     * Static value Failed for ReportStatus.
     */
    public static final ReportStatus FAILED = fromString("Failed");

    /**
     * Static value Reviewing for ReportStatus.
     */
    public static final ReportStatus REVIEWING = fromString("Reviewing");

    /**
     * Static value Disabled for ReportStatus.
     */
    public static final ReportStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ReportStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReportStatus() {
    }

    /**
     * Creates or finds a ReportStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReportStatus.
     */
    public static ReportStatus fromString(String name) {
        return fromString(name, ReportStatus.class);
    }

    /**
     * Gets known ReportStatus values.
     * 
     * @return known ReportStatus values.
     */
    public static Collection<ReportStatus> values() {
        return values(ReportStatus.class);
    }
}
