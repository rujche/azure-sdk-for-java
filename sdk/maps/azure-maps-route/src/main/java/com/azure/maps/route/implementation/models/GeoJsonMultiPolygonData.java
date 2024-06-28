// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The GeoJsonMultiPolygonData model.
 */
@Fluent
public class GeoJsonMultiPolygonData implements JsonSerializable<GeoJsonMultiPolygonData> {
    /*
     * Contains a list of valid `GeoJSON Polygon` objects. **Note** that coordinates in GeoJSON are in x, y order (longitude, latitude).
     */
    private List<List<List<List<Double>>>> coordinates;

    /**
     * Creates an instance of GeoJsonMultiPolygonData class.
     */
    public GeoJsonMultiPolygonData() {
    }

    /**
     * Get the coordinates property: Contains a list of valid `GeoJSON Polygon` objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     * 
     * @return the coordinates value.
     */
    public List<List<List<List<Double>>>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Contains a list of valid `GeoJSON Polygon` objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     * 
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiPolygonData object itself.
     */
    public GeoJsonMultiPolygonData setCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("coordinates", this.coordinates,
            (writer, element) -> writer.writeArray(element,
                (writer1, element1) -> writer1.writeArray(element1, (writer2, element2) -> writer2.writeArray(element2,
                    (writer3, element3) -> writer3.writeDouble(element3)))));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeoJsonMultiPolygonData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeoJsonMultiPolygonData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GeoJsonMultiPolygonData.
     */
    public static GeoJsonMultiPolygonData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonMultiPolygonData deserializedGeoJsonMultiPolygonData = new GeoJsonMultiPolygonData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("coordinates".equals(fieldName)) {
                    List<List<List<List<Double>>>> coordinates = reader.readArray(reader1 -> reader1.readArray(
                        reader2 -> reader2.readArray(reader3 -> reader3.readArray(reader4 -> reader4.getDouble()))));
                    deserializedGeoJsonMultiPolygonData.coordinates = coordinates;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeoJsonMultiPolygonData;
        });
    }
}
