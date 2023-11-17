// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of the endpoint for the partner destination.
 */
public final class PartnerEndpointType extends ExpandableStringEnum<PartnerEndpointType> {
    /**
     * Static value WebHook for PartnerEndpointType.
     */
    public static final PartnerEndpointType WEB_HOOK = fromString("WebHook");

    /**
     * Creates a new instance of PartnerEndpointType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PartnerEndpointType() {
    }

    /**
     * Creates or finds a PartnerEndpointType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PartnerEndpointType.
     */
    @JsonCreator
    public static PartnerEndpointType fromString(String name) {
        return fromString(name, PartnerEndpointType.class);
    }

    /**
     * Gets known PartnerEndpointType values.
     * 
     * @return known PartnerEndpointType values.
     */
    public static Collection<PartnerEndpointType> values() {
        return values(PartnerEndpointType.class);
    }
}
