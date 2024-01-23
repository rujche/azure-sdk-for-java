// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the format of the JSON the output will be written in. The currently supported values are 'lineSeparated'
 * indicating the output will be formatted by having each JSON object separated by a new line and 'array' indicating the
 * output will be formatted as an array of JSON objects.
 */
public final class JsonOutputSerializationFormat extends ExpandableStringEnum<JsonOutputSerializationFormat> {
    /**
     * Static value LineSeparated for JsonOutputSerializationFormat.
     */
    public static final JsonOutputSerializationFormat LINE_SEPARATED = fromString("LineSeparated");

    /**
     * Static value Array for JsonOutputSerializationFormat.
     */
    public static final JsonOutputSerializationFormat ARRAY = fromString("Array");

    /**
     * Creates a new instance of JsonOutputSerializationFormat value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JsonOutputSerializationFormat() {
    }

    /**
     * Creates or finds a JsonOutputSerializationFormat from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JsonOutputSerializationFormat.
     */
    @JsonCreator
    public static JsonOutputSerializationFormat fromString(String name) {
        return fromString(name, JsonOutputSerializationFormat.class);
    }

    /**
     * Gets known JsonOutputSerializationFormat values.
     * 
     * @return known JsonOutputSerializationFormat values.
     */
    public static Collection<JsonOutputSerializationFormat> values() {
        return values(JsonOutputSerializationFormat.class);
    }
}
