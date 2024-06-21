// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.maps.search.models.MapsPolygon;
import java.io.IOException;
import java.util.List;

/**
 * This object is returned from a successful Search Polygon call.
 */
@Immutable
public final class PolygonResult implements JsonSerializable<PolygonResult> {
    /*
     * Results array
     */
    private List<MapsPolygon> polygons;

    /**
     * Creates an instance of PolygonResult class.
     */
    public PolygonResult() {
    }

    /**
     * Get the polygons property: Results array.
     * 
     * @return the polygons value.
     */
    public List<MapsPolygon> getPolygons() {
        return this.polygons;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolygonResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolygonResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PolygonResult.
     */
    public static PolygonResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolygonResult deserializedPolygonResult = new PolygonResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("additionalData".equals(fieldName)) {
                    List<MapsPolygon> polygons = reader.readArray(reader1 -> MapsPolygon.fromJson(reader1));
                    deserializedPolygonResult.polygons = polygons;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolygonResult;
        });
    }
}
