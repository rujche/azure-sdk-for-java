// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * If Enabled, Azure Active Directory authentication is enabled.
 */
public final class ActiveDirectoryAuthEnum extends ExpandableStringEnum<ActiveDirectoryAuthEnum> {
    /**
     * Static value Enabled for ActiveDirectoryAuthEnum.
     */
    public static final ActiveDirectoryAuthEnum ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for ActiveDirectoryAuthEnum.
     */
    public static final ActiveDirectoryAuthEnum DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ActiveDirectoryAuthEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActiveDirectoryAuthEnum() {
    }

    /**
     * Creates or finds a ActiveDirectoryAuthEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ActiveDirectoryAuthEnum.
     */
    @JsonCreator
    public static ActiveDirectoryAuthEnum fromString(String name) {
        return fromString(name, ActiveDirectoryAuthEnum.class);
    }

    /**
     * Gets known ActiveDirectoryAuthEnum values.
     * 
     * @return known ActiveDirectoryAuthEnum values.
     */
    public static Collection<ActiveDirectoryAuthEnum> values() {
        return values(ActiveDirectoryAuthEnum.class);
    }
}
