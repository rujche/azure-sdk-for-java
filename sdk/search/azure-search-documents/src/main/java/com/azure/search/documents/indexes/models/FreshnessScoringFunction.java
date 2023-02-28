// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Defines a function that boosts scores based on the value of a date-time field. */
@Fluent
public final class FreshnessScoringFunction extends ScoringFunction {
    /*
     * Indicates the type of function to use. Valid values include magnitude, freshness, distance, and tag. The
     * function type must be lower case.
     */
    private static final String TYPE = "freshness";

    /*
     * Parameter values for the freshness scoring function.
     */
    private final FreshnessScoringParameters parameters;

    /**
     * Creates an instance of FreshnessScoringFunction class.
     *
     * @param fieldName the fieldName value to set.
     * @param boost the boost value to set.
     * @param parameters the parameters value to set.
     */
    public FreshnessScoringFunction(String fieldName, double boost, FreshnessScoringParameters parameters) {
        super(fieldName, boost);
        this.parameters = parameters;
    }

    /**
     * Get the parameters property: Parameter values for the freshness scoring function.
     *
     * @return the parameters value.
     */
    public FreshnessScoringParameters getParameters() {
        return this.parameters;
    }

    /** {@inheritDoc} */
    @Override
    public FreshnessScoringFunction setInterpolation(ScoringFunctionInterpolation interpolation) {
        super.setInterpolation(interpolation);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", TYPE);
        jsonWriter.writeStringField("fieldName", getFieldName());
        jsonWriter.writeDoubleField("boost", getBoost());
        jsonWriter.writeStringField("interpolation", Objects.toString(getInterpolation(), null));
        jsonWriter.writeJsonField("freshness", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FreshnessScoringFunction from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FreshnessScoringFunction if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the FreshnessScoringFunction.
     */
    public static FreshnessScoringFunction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean fieldNameFound = false;
                    String fieldName = null;
                    boolean boostFound = false;
                    double boost = 0.0;
                    ScoringFunctionInterpolation interpolation = null;
                    boolean parametersFound = false;
                    FreshnessScoringParameters parameters = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String jsonFieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("type".equals(jsonFieldName)) {
                            String type = reader.getString();
                            if (!TYPE.equals(type)) {
                                throw new IllegalStateException(
                                        "'type' was expected to be non-null and equal to '"
                                                + TYPE
                                                + "'. The found 'type' was '"
                                                + type
                                                + "'.");
                            }
                        } else if ("fieldName".equals(jsonFieldName)) {
                            fieldName = reader.getString();
                            fieldNameFound = true;
                        } else if ("boost".equals(jsonFieldName)) {
                            boost = reader.getDouble();
                            boostFound = true;
                        } else if ("interpolation".equals(jsonFieldName)) {
                            interpolation = ScoringFunctionInterpolation.fromString(reader.getString());
                        } else if ("freshness".equals(jsonFieldName)) {
                            parameters = FreshnessScoringParameters.fromJson(reader);
                            parametersFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (fieldNameFound && boostFound && parametersFound) {
                        FreshnessScoringFunction deserializedValue =
                                new FreshnessScoringFunction(fieldName, boost, parameters);
                        deserializedValue.setInterpolation(interpolation);

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!fieldNameFound) {
                        missingProperties.add("fieldName");
                    }
                    if (!boostFound) {
                        missingProperties.add("boost");
                    }
                    if (!parametersFound) {
                        missingProperties.add("freshness");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
