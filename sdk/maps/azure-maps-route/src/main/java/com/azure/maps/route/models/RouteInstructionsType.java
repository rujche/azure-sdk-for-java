// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for RouteInstructionsType.
 */
public final class RouteInstructionsType extends ExpandableStringEnum<RouteInstructionsType> {
    /**
     * Returns raw instruction data without human-readable messages.
     */
    public static final RouteInstructionsType CODED = fromString("coded");

    /**
     * Returns raw instructions data with human-readable messages in plain text.
     */
    public static final RouteInstructionsType TEXT = fromString("text");

    /**
     * Returns raw instruction data with tagged human-readable messages to permit formatting. A human-readable message
     * is built up from repeatable identified elements. These are tagged to allow client applications to format them
     * correctly. The following message components are tagged when instructionsType=tagged: street, roadNumber,
     * signpostText, exitNumber, roundaboutExitNumber.
     * 
     * Example of tagged 'Turn left' message:​
     * 
     * ```
     * Turn left onto &lt;roadNumber&gt;A4&lt;/roadNumber&gt;/&lt;roadNumber&gt;E19&lt;/roadNumber&gt;
     * towards &lt;signpostText&gt;Den Haag&lt;/signpostText&gt;
     * ```.
     */
    public static final RouteInstructionsType TAGGED = fromString("tagged");

    /**
     * Creates a new instance of RouteInstructionsType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RouteInstructionsType() {
    }

    /**
     * Creates or finds a RouteInstructionsType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RouteInstructionsType.
     */
    public static RouteInstructionsType fromString(String name) {
        return fromString(name, RouteInstructionsType.class);
    }

    /**
     * Gets known RouteInstructionsType values.
     * 
     * @return known RouteInstructionsType values.
     */
    public static Collection<RouteInstructionsType> values() {
        return values(RouteInstructionsType.class);
    }
}
