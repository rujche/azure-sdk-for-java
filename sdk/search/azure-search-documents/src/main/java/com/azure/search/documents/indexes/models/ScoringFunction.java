// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** Base type for functions that can modify document scores during ranking. */
@Fluent
public abstract class ScoringFunction implements JsonSerializable<ScoringFunction> {
    /*
     * The name of the field used as input to the scoring function.
     */
    private final String fieldName;

    /*
     * A multiplier for the raw score. Must be a positive number not equal to 1.0.
     */
    private final double boost;

    /*
     * A value indicating how boosting will be interpolated across document scores; defaults to "Linear".
     */
    private ScoringFunctionInterpolation interpolation;

    /**
     * Creates an instance of ScoringFunction class.
     *
     * @param fieldName the fieldName value to set.
     * @param boost the boost value to set.
     */
    public ScoringFunction(String fieldName, double boost) {
        this.fieldName = fieldName;
        this.boost = boost;
    }

    /**
     * Get the fieldName property: The name of the field used as input to the scoring function.
     *
     * @return the fieldName value.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Get the boost property: A multiplier for the raw score. Must be a positive number not equal to 1.0.
     *
     * @return the boost value.
     */
    public double getBoost() {
        return this.boost;
    }

    /**
     * Get the interpolation property: A value indicating how boosting will be interpolated across document scores;
     * defaults to "Linear".
     *
     * @return the interpolation value.
     */
    public ScoringFunctionInterpolation getInterpolation() {
        return this.interpolation;
    }

    /**
     * Set the interpolation property: A value indicating how boosting will be interpolated across document scores;
     * defaults to "Linear".
     *
     * @param interpolation the interpolation value to set.
     * @return the ScoringFunction object itself.
     */
    public ScoringFunction setInterpolation(ScoringFunctionInterpolation interpolation) {
        this.interpolation = interpolation;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fieldName", this.fieldName);
        jsonWriter.writeDoubleField("boost", this.boost);
        jsonWriter.writeStringField("interpolation", Objects.toString(this.interpolation, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScoringFunction from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScoringFunction if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ScoringFunction.
     */
    public static ScoringFunction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    String discriminatorValue = null;
                    JsonReader readerToUse = null;

                    // Read the first field name and determine if it's the discriminator field.
                    reader.nextToken();
                    if ("type".equals(reader.getFieldName())) {
                        reader.nextToken();
                        discriminatorValue = reader.getString();
                        readerToUse = reader;
                    } else {
                        // If it isn't the discriminator field buffer the JSON to make it replayable and find the
                        // discriminator field value.
                        JsonReader replayReader = reader.bufferObject();
                        replayReader.nextToken(); // Prepare for reading
                        while (replayReader.nextToken() != JsonToken.END_OBJECT) {
                            String jsonFieldName = replayReader.getFieldName();
                            replayReader.nextToken();
                            if ("type".equals(jsonFieldName)) {
                                discriminatorValue = replayReader.getString();
                                break;
                            } else {
                                replayReader.skipChildren();
                            }
                        }

                        if (discriminatorValue != null) {
                            readerToUse = replayReader.reset();
                        }
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("distance".equals(discriminatorValue)) {
                        return DistanceScoringFunction.fromJson(readerToUse);
                    } else if ("freshness".equals(discriminatorValue)) {
                        return FreshnessScoringFunction.fromJson(readerToUse);
                    } else if ("magnitude".equals(discriminatorValue)) {
                        return MagnitudeScoringFunction.fromJson(readerToUse);
                    } else if ("tag".equals(discriminatorValue)) {
                        return TagScoringFunction.fromJson(readerToUse);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field 'type' didn't match one of the expected values 'distance', 'freshness', 'magnitude', or 'tag'. It was: '"
                                        + discriminatorValue
                                        + "'.");
                    }
                });
    }
}
