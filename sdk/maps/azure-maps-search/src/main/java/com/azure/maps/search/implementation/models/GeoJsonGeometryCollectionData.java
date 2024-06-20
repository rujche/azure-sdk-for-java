// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The GeoJsonGeometryCollectionData model.
 */
@Fluent
public class GeoJsonGeometryCollectionData implements JsonSerializable<GeoJsonGeometryCollectionData> {
    /*
     * Contains a list of valid `GeoJSON` geometry objects. **Note** that coordinates in GeoJSON are in x, y order (longitude, latitude).
     */
    private List<GeoJsonGeometry> geometries;

    /**
     * Creates an instance of GeoJsonGeometryCollectionData class.
     */
    public GeoJsonGeometryCollectionData() {
    }

    /**
     * Get the geometries property: Contains a list of valid `GeoJSON` geometry objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     * 
     * @return the geometries value.
     */
    public List<GeoJsonGeometry> getGeometries() {
        return this.geometries;
    }

    /**
     * Set the geometries property: Contains a list of valid `GeoJSON` geometry objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     * 
     * @param geometries the geometries value to set.
     * @return the GeoJsonGeometryCollectionData object itself.
     */
    public GeoJsonGeometryCollectionData setGeometries(List<GeoJsonGeometry> geometries) {
        this.geometries = geometries;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("geometries", this.geometries, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeoJsonGeometryCollectionData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeoJsonGeometryCollectionData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GeoJsonGeometryCollectionData.
     */
    public static GeoJsonGeometryCollectionData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonGeometryCollectionData deserializedGeoJsonGeometryCollectionData
                = new GeoJsonGeometryCollectionData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("geometries".equals(fieldName)) {
                    List<GeoJsonGeometry> geometries = reader.readArray(reader1 -> GeoJsonGeometry.fromJson(reader1));
                    deserializedGeoJsonGeometryCollectionData.geometries = geometries;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeoJsonGeometryCollectionData;
        });
    }
}
