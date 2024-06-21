// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The estimated total time required in minutes for all patching operations (database server, storage server, and
 * network switch patching).
 */
@Immutable
public final class EstimatedPatchingTime implements JsonSerializable<EstimatedPatchingTime> {
    /*
     * The estimated time required in minutes for database server patching.
     */
    private Integer estimatedDbServerPatchingTime;

    /*
     * The estimated time required in minutes for network switch patching.
     */
    private Integer estimatedNetworkSwitchesPatchingTime;

    /*
     * The estimated time required in minutes for storage server patching.
     */
    private Integer estimatedStorageServerPatchingTime;

    /*
     * The estimated total time required in minutes for all patching operations.
     */
    private Integer totalEstimatedPatchingTime;

    /**
     * Creates an instance of EstimatedPatchingTime class.
     */
    public EstimatedPatchingTime() {
    }

    /**
     * Get the estimatedDbServerPatchingTime property: The estimated time required in minutes for database server
     * patching.
     * 
     * @return the estimatedDbServerPatchingTime value.
     */
    public Integer estimatedDbServerPatchingTime() {
        return this.estimatedDbServerPatchingTime;
    }

    /**
     * Get the estimatedNetworkSwitchesPatchingTime property: The estimated time required in minutes for network switch
     * patching.
     * 
     * @return the estimatedNetworkSwitchesPatchingTime value.
     */
    public Integer estimatedNetworkSwitchesPatchingTime() {
        return this.estimatedNetworkSwitchesPatchingTime;
    }

    /**
     * Get the estimatedStorageServerPatchingTime property: The estimated time required in minutes for storage server
     * patching.
     * 
     * @return the estimatedStorageServerPatchingTime value.
     */
    public Integer estimatedStorageServerPatchingTime() {
        return this.estimatedStorageServerPatchingTime;
    }

    /**
     * Get the totalEstimatedPatchingTime property: The estimated total time required in minutes for all patching
     * operations.
     * 
     * @return the totalEstimatedPatchingTime value.
     */
    public Integer totalEstimatedPatchingTime() {
        return this.totalEstimatedPatchingTime;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
     * Reads an instance of EstimatedPatchingTime from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EstimatedPatchingTime if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EstimatedPatchingTime.
     */
    public static EstimatedPatchingTime fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EstimatedPatchingTime deserializedEstimatedPatchingTime = new EstimatedPatchingTime();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("estimatedDbServerPatchingTime".equals(fieldName)) {
                    deserializedEstimatedPatchingTime.estimatedDbServerPatchingTime
                        = reader.getNullable(JsonReader::getInt);
                } else if ("estimatedNetworkSwitchesPatchingTime".equals(fieldName)) {
                    deserializedEstimatedPatchingTime.estimatedNetworkSwitchesPatchingTime
                        = reader.getNullable(JsonReader::getInt);
                } else if ("estimatedStorageServerPatchingTime".equals(fieldName)) {
                    deserializedEstimatedPatchingTime.estimatedStorageServerPatchingTime
                        = reader.getNullable(JsonReader::getInt);
                } else if ("totalEstimatedPatchingTime".equals(fieldName)) {
                    deserializedEstimatedPatchingTime.totalEstimatedPatchingTime
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEstimatedPatchingTime;
        });
    }
}
