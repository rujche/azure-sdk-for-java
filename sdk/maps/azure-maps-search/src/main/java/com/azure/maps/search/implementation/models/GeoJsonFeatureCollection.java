// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A valid `GeoJSON FeatureCollection` object type. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.3) for details.
 */
@Fluent
public final class GeoJsonFeatureCollection extends GeoJsonObject {
    /*
     * Specifies the `GeoJSON` type. Must be one of the nine valid GeoJSON object types - Point, MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon, GeometryCollection, Feature and FeatureCollection.
     */
    private GeoJsonObjectType type = GeoJsonObjectType.GEO_JSON_FEATURE_COLLECTION;

    /*
     * Contains a list of valid `GeoJSON Feature` objects.
     */
    private List<GeoJsonFeature> features;

    /**
     * Creates an instance of GeoJsonFeatureCollection class.
     */
    public GeoJsonFeatureCollection() {
    }

    /**
     * Get the type property: Specifies the `GeoJSON` type. Must be one of the nine valid GeoJSON object types - Point,
     * MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon, GeometryCollection, Feature and
     * FeatureCollection.
     * 
     * @return the type value.
     */
    @Override
    public GeoJsonObjectType getType() {
        return this.type;
    }

    /**
     * Get the features property: Contains a list of valid `GeoJSON Feature` objects.
     * 
     * @return the features value.
     */
    public List<GeoJsonFeature> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: Contains a list of valid `GeoJSON Feature` objects.
     * 
     * @param features the features value to set.
     * @return the GeoJsonFeatureCollection object itself.
     */
    public GeoJsonFeatureCollection setFeatures(List<GeoJsonFeature> features) {
        this.features = features;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("features", this.features, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeoJsonFeatureCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeoJsonFeatureCollection if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GeoJsonFeatureCollection.
     */
    public static GeoJsonFeatureCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonFeatureCollection deserializedGeoJsonFeatureCollection = new GeoJsonFeatureCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("features".equals(fieldName)) {
                    List<GeoJsonFeature> features = reader.readArray(reader1 -> GeoJsonFeature.fromJson(reader1));
                    deserializedGeoJsonFeatureCollection.features = features;
                } else if ("type".equals(fieldName)) {
                    deserializedGeoJsonFeatureCollection.type = GeoJsonObjectType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeoJsonFeatureCollection;
        });
    }
}
