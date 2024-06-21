// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Represents a list of people detected in an image and their location.
 */
@Immutable
public final class PeopleResult implements JsonSerializable<PeopleResult> {

    /*
     * A list of people detected in an image and their location.
     */
    @Generated
    private final List<DetectedPerson> values;

    /**
     * Creates an instance of PeopleResult class.
     *
     * @param values the values value to set.
     */
    @Generated
    private PeopleResult(List<DetectedPerson> values) {
        this.values = values;
    }

    /**
     * Get the values property: A list of people detected in an image and their location.
     *
     * @return the values value.
     */
    @Generated
    public List<DetectedPerson> getValues() {
        return this.values;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PeopleResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PeopleResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PeopleResult.
     */
    @Generated
    public static PeopleResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<DetectedPerson> values = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("values".equals(fieldName)) {
                    values = reader.readArray(reader1 -> DetectedPerson.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new PeopleResult(values);
        });
    }
}
