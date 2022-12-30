// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Whether network address and port translation is enabled. */
public final class NaptEnabled extends ExpandableStringEnum<NaptEnabled> {
    /** Static value Enabled for NaptEnabled. */
    public static final NaptEnabled ENABLED = fromString("Enabled");

    /** Static value Disabled for NaptEnabled. */
    public static final NaptEnabled DISABLED = fromString("Disabled");

    /**
     * Creates or finds a NaptEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NaptEnabled.
     */
    @JsonCreator
    public static NaptEnabled fromString(String name) {
        return fromString(name, NaptEnabled.class);
    }

    /**
     * Gets known NaptEnabled values.
     *
     * @return known NaptEnabled values.
     */
    public static Collection<NaptEnabled> values() {
        return values(NaptEnabled.class);
    }
}
