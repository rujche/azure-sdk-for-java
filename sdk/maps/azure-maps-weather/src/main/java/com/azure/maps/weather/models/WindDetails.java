// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Wind details being returned including speed and direction.
 */
@Fluent
public final class WindDetails implements JsonSerializable<WindDetails> {

    /*
     * Wind direction
     */
    private WindDirection direction;

    /*
     * Speed of the wind in specified unit.
     */
    private WeatherUnitDetails speed;

    /**
     * Set default WindDetails constructor to private
     */
    private WindDetails() {
    }

    /**
     * Get the direction property: Wind direction.
     *
     * @return the direction value.
     */
    public WindDirection getDirection() {
        return this.direction;
    }

    /**
     * Get the speed property: Speed of the wind in specified unit.
     *
     * @return the speed value.
     */
    public WeatherUnitDetails getSpeed() {
        return this.speed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("direction", this.direction);
        jsonWriter.writeJsonField("speed", this.speed);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WindDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WindDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WindDetails.
     */
    public static WindDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WindDetails deserializedWindDetails = new WindDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("direction".equals(fieldName)) {
                    deserializedWindDetails.direction = WindDirection.fromJson(reader);
                } else if ("speed".equals(fieldName)) {
                    deserializedWindDetails.speed = WeatherUnitDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedWindDetails;
        });
    }
}
