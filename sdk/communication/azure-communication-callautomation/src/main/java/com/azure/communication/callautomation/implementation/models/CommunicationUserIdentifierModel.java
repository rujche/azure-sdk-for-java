// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A user that got created with an Azure Communication Services resource.
 */
@Fluent
public final class CommunicationUserIdentifierModel implements JsonSerializable<CommunicationUserIdentifierModel> {
    /*
     * The Id of the communication user.
     */
    private String id;

    /**
     * Creates an instance of CommunicationUserIdentifierModel class.
     */
    public CommunicationUserIdentifierModel() {
    }

    /**
     * Get the id property: The Id of the communication user.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The Id of the communication user.
     * 
     * @param id the id value to set.
     * @return the CommunicationUserIdentifierModel object itself.
     */
    public CommunicationUserIdentifierModel setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CommunicationUserIdentifierModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunicationUserIdentifierModel if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommunicationUserIdentifierModel.
     */
    public static CommunicationUserIdentifierModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationUserIdentifierModel deserializedCommunicationUserIdentifierModel
                = new CommunicationUserIdentifierModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCommunicationUserIdentifierModel.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommunicationUserIdentifierModel;
        });
    }
}
