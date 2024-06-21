// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The GeoJsonFeatureData model.
 */
@Fluent
public class GeoJsonFeatureData implements JsonSerializable<GeoJsonFeatureData> {
    /*
     * A valid `GeoJSON` geometry object. The type must be one of the seven valid GeoJSON geometry types - Point, MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon and GeometryCollection. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1) for details.
     */
    private GeoJsonGeometry geometry;

    /*
     * Properties can contain any additional metadata about the `Feature`. Value can be any JSON object or a JSON null value
     */
    private Object properties;

    /*
     * Identifier for the feature.
     */
    private String id;

    /*
     * The type of the feature. The value depends on the data model the current feature is part of. Some data models may have an empty value.
     */
    private String featureType;

    /**
     * Creates an instance of GeoJsonFeatureData class.
     */
    public GeoJsonFeatureData() {
    }

    /**
     * Get the geometry property: A valid `GeoJSON` geometry object. The type must be one of the seven valid GeoJSON
     * geometry types - Point, MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon and GeometryCollection.
     * Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1) for details.
     * 
     * @return the geometry value.
     */
    public GeoJsonGeometry getGeometry() {
        return this.geometry;
    }

    /**
     * Set the geometry property: A valid `GeoJSON` geometry object. The type must be one of the seven valid GeoJSON
     * geometry types - Point, MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon and GeometryCollection.
     * Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1) for details.
     * 
     * @param geometry the geometry value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData setGeometry(GeoJsonGeometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * Get the properties property: Properties can contain any additional metadata about the `Feature`. Value can be any
     * JSON object or a JSON null value.
     * 
     * @return the properties value.
     */
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties can contain any additional metadata about the `Feature`. Value can be any
     * JSON object or a JSON null value.
     * 
     * @param properties the properties value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the id property: Identifier for the feature.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Identifier for the feature.
     * 
     * @param id the id value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the featureType property: The type of the feature. The value depends on the data model the current feature is
     * part of. Some data models may have an empty value.
     * 
     * @return the featureType value.
     */
    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * Set the featureType property: The type of the feature. The value depends on the data model the current feature is
     * part of. Some data models may have an empty value.
     * 
     * @param featureType the featureType value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("geometry", this.geometry);
        jsonWriter.writeUntypedField("properties", this.properties);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("featureType", this.featureType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeoJsonFeatureData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeoJsonFeatureData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GeoJsonFeatureData.
     */
    public static GeoJsonFeatureData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonFeatureData deserializedGeoJsonFeatureData = new GeoJsonFeatureData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("geometry".equals(fieldName)) {
                    deserializedGeoJsonFeatureData.geometry = GeoJsonGeometry.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedGeoJsonFeatureData.properties = reader.readUntyped();
                } else if ("id".equals(fieldName)) {
                    deserializedGeoJsonFeatureData.id = reader.getString();
                } else if ("featureType".equals(fieldName)) {
                    deserializedGeoJsonFeatureData.featureType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeoJsonFeatureData;
        });
    }
}
