// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.maps.search.implementation.models.OperatingHoursTime;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Open time range for a day.
 */
@Fluent
public final class OperatingHoursTimeRange implements JsonSerializable<OperatingHoursTimeRange> {

    /*
     * The point in the next 7 days range when a given POI is being opened, or the beginning of the range if it was opened before the range.
     */
    private OperatingHoursTime startTime;

    /*
     * The point in the next 7 days range when a given POI is being closed, or the beginning of the range if it was closed before the range.
     */
    private OperatingHoursTime endTime;

    /**
     * Creates an instance of OperatingHoursTimeRange class.
     */
    private OperatingHoursTimeRange() {
    }

    /**
     * Get the startTime property: The point in the next 7 days range when a given POI is being opened, or the beginning
     * of the range if it was opened before the range.
     *
     * @return the startTime value.
     */
    public LocalDateTime getStartTime() {
        String[] date = this.startTime.toString().split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return LocalDateTime.of(year, month, day, this.startTime.getHour(), this.startTime.getMinute());
    }

    /**
     * Set the startTime property: The point in the next 7 days range when a given POI is being opened, or the beginning
     * of the range if it was opened before the range.
     *
     * @param startTime the startTime value to set.
     * @return the OperatingHoursTimeRange object itself.
     */
    public OperatingHoursTimeRange setStartTime(LocalDateTime startTime) {
        this.startTime
            = new OperatingHoursTime(startTime.toLocalDate().toString(), startTime.getHour(), startTime.getMinute());
        return this;
    }

    /**
     * Get the endTime property: The point in the next 7 days range when a given POI is being closed, or the beginning
     * of the range if it was closed before the range.
     *
     * @return the endTime value.
     */
    public LocalDateTime getEndTime() {
        String[] date = this.endTime.toString().split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return LocalDateTime.of(year, month, day, this.endTime.getHour(), this.endTime.getMinute());
    }

    /**
     * Set the endTime property: The point in the next 7 days range when a given POI is being closed, or the beginning
     * of the range if it was closed before the range.
     *
     * @param endTime the endTime value to set.
     * @return the OperatingHoursTimeRange object itself.
     */
    public OperatingHoursTimeRange setEndTime(LocalDateTime endTime) {
        this.endTime = new OperatingHoursTime(endTime.toLocalDate().toString(), endTime.getHour(), endTime.getMinute());
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("startTime", this.startTime);
        jsonWriter.writeJsonField("endTime", this.endTime);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperatingHoursTimeRange from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperatingHoursTimeRange if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperatingHoursTimeRange.
     */
    public static OperatingHoursTimeRange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperatingHoursTimeRange deserializedOperatingHoursTimeRange = new OperatingHoursTimeRange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("startTime".equals(fieldName)) {
                    deserializedOperatingHoursTimeRange.startTime = OperatingHoursTime.fromJson(reader);
                } else if ("endTime".equals(fieldName)) {
                    deserializedOperatingHoursTimeRange.endTime = OperatingHoursTime.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedOperatingHoursTimeRange;
        });
    }

    /**
     * OperatingHoursTimeRange constructor
     *
     * @param startTime The point in the next 7 days range when a given POI is being opened, or the beginning of the
     * range if it was opened before the range.
     * @param endTime The point in the next 7 days range when a given POI is being closed, or the beginning of the range
     * if it was closed before the range.
     */
    public OperatingHoursTimeRange(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime
            = new OperatingHoursTime(startTime.toLocalDate().toString(), startTime.getHour(), startTime.getMinute());
        this.endTime = new OperatingHoursTime(endTime.toLocalDate().toString(), endTime.getHour(), endTime.getMinute());
    }
}
