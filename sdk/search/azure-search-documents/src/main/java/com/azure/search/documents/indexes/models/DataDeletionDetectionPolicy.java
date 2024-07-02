// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base type for data deletion detection policies.
 */
@Immutable
public class DataDeletionDetectionPolicy implements JsonSerializable<DataDeletionDetectionPolicy> {
    /*
     * A URI fragment specifying the type of data deletion detection policy.
     */
    private String odataType = "DataDeletionDetectionPolicy";

    /**
     * Creates an instance of DataDeletionDetectionPolicy class.
     */
    public DataDeletionDetectionPolicy() {
    }

    /**
     * Get the odataType property: A URI fragment specifying the type of data deletion detection policy.
     * 
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataDeletionDetectionPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataDeletionDetectionPolicy if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataDeletionDetectionPolicy.
     */
    public static DataDeletionDetectionPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy".equals(discriminatorValue)) {
                    return SoftDeleteColumnDeletionDetectionPolicy.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static DataDeletionDetectionPolicy fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataDeletionDetectionPolicy deserializedDataDeletionDetectionPolicy = new DataDeletionDetectionPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedDataDeletionDetectionPolicy.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataDeletionDetectionPolicy;
        });
    }
}
