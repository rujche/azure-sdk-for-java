// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * &lt;code&gt;Invalid&lt;/code&gt; indicates the name provided does not match Azure App Service naming requirements.
 * &lt;code&gt;AlreadyExists&lt;/code&gt; indicates that the name is already in use and is therefore unavailable.
 */
public final class InAvailabilityReasonType extends ExpandableStringEnum<InAvailabilityReasonType> {
    /**
     * Static value Invalid for InAvailabilityReasonType.
     */
    public static final InAvailabilityReasonType INVALID = fromString("Invalid");

    /**
     * Static value AlreadyExists for InAvailabilityReasonType.
     */
    public static final InAvailabilityReasonType ALREADY_EXISTS = fromString("AlreadyExists");

    /**
     * Creates a new instance of InAvailabilityReasonType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InAvailabilityReasonType() {
    }

    /**
     * Creates or finds a InAvailabilityReasonType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InAvailabilityReasonType.
     */
    @JsonCreator
    public static InAvailabilityReasonType fromString(String name) {
        return fromString(name, InAvailabilityReasonType.class);
    }

    /**
     * Gets known InAvailabilityReasonType values.
     * 
     * @return known InAvailabilityReasonType values.
     */
    public static Collection<InAvailabilityReasonType> values() {
        return values(InAvailabilityReasonType.class);
    }
}
