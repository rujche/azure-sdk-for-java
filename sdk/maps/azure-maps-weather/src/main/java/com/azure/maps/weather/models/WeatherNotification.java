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
 * The WeatherNotification model.
 */
@Fluent
public final class WeatherNotification implements JsonSerializable<WeatherNotification> {

    /*
     * A type of notification generated to warn drivers of the onset of a hazard, or increase in intensity of a hazard.
     */
    private String type;

    /*
     * A severity/hazard index.
     *   * `0` - No hazard.
     *   * `1` - Be informed, be aware.
     *   * `2` - Pay attention, be prepared.
     *   * `3` - Take action.
     *   * `4` - Life threatening, emergency.
     */
    private HazardIndex hazardIndex;

    /*
     * A unique identifier (non-displayable) for each type of hazard: LightRain, ModerateRain, HeavyRain, LightMix, ModerateMix, HeavyMix, LightSnow, ModerateSnow, HeavySnow, LightIce, ModerateIce, HeavyIce, Hail, LargeHail, SunGlare, SunGlareHigh, Lightning, SevereLightning, WindModerate, WindHigh, WindExtreme, FloodWarning, FlashFloodWarning, TornadoWarning, TsunamiWarning, SevereThunderstormWarning.
     */
    private String hazardCode;

    /*
     * A displayable short phrase describing the forecasted conditions and precipitation intensity/type.
     */
    private String shortDescription;

    /**
     * Set default WeatherNotification constructor to private
     */
    private WeatherNotification() {
    }

    /**
     * Get the type property: A type of notification generated to warn drivers of the onset of a hazard, or increase in
     * intensity of a hazard.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the hazardIndex property: A severity/hazard index.
     * * `0` - No hazard.
     * * `1` - Be informed, be aware.
     * * `2` - Pay attention, be prepared.
     * * `3` - Take action.
     * * `4` - Life threatening, emergency.
     *
     * @return the hazardIndex value.
     */
    public HazardIndex getHazardIndex() {
        return this.hazardIndex;
    }

    /**
     * Get the hazardCode property: A unique identifier (non-displayable) for each type of hazard: LightRain,
     * ModerateRain, HeavyRain, LightMix, ModerateMix, HeavyMix, LightSnow, ModerateSnow, HeavySnow, LightIce,
     * ModerateIce, HeavyIce, Hail, LargeHail, SunGlare, SunGlareHigh, Lightning, SevereLightning, WindModerate,
     * WindHigh, WindExtreme, FloodWarning, FlashFloodWarning, TornadoWarning, TsunamiWarning,
     * SevereThunderstormWarning.
     *
     * @return the hazardCode value.
     */
    public String getHazardCode() {
        return this.hazardCode;
    }

    /**
     * Get the shortDescription property: A displayable short phrase describing the forecasted conditions and
     * precipitation intensity/type.
     *
     * @return the shortDescription value.
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeNumberField("hazardIndex", this.hazardIndex == null ? null : this.hazardIndex.toInt());
        jsonWriter.writeStringField("hazardCode", this.hazardCode);
        jsonWriter.writeStringField("shortPhrase", this.shortDescription);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WeatherNotification from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WeatherNotification if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WeatherNotification.
     */
    public static WeatherNotification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WeatherNotification deserializedWeatherNotification = new WeatherNotification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedWeatherNotification.type = reader.getString();
                } else if ("hazardIndex".equals(fieldName)) {
                    deserializedWeatherNotification.hazardIndex = HazardIndex.fromInt(reader.getInt());
                } else if ("hazardCode".equals(fieldName)) {
                    deserializedWeatherNotification.hazardCode = reader.getString();
                } else if ("shortPhrase".equals(fieldName)) {
                    deserializedWeatherNotification.shortDescription = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedWeatherNotification;
        });
    }
}
