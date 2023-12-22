// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Kind of the connection string key.
 */
public final class Kind extends ExpandableStringEnum<Kind> {
    /**
     * Static value Primary for Kind.
     */
    public static final Kind PRIMARY = fromString("Primary");

    /**
     * Static value Secondary for Kind.
     */
    public static final Kind SECONDARY = fromString("Secondary");

    /**
     * Static value PrimaryReadonly for Kind.
     */
    public static final Kind PRIMARY_READONLY = fromString("PrimaryReadonly");

    /**
     * Static value SecondaryReadonly for Kind.
     */
    public static final Kind SECONDARY_READONLY = fromString("SecondaryReadonly");

    /**
     * Creates a new instance of Kind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Kind() {
    }

    /**
     * Creates or finds a Kind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Kind.
     */
    @JsonCreator
    public static Kind fromString(String name) {
        return fromString(name, Kind.class);
    }

    /**
     * Gets known Kind values.
     * 
     * @return known Kind values.
     */
    public static Collection<Kind> values() {
        return values(Kind.class);
    }
}
