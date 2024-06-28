// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualNetworkInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a VirtualNetwork list operation.
 */
@Immutable
public final class VirtualNetworkListResult implements JsonSerializable<VirtualNetworkListResult> {
    /*
     * The VirtualNetwork items on this page
     */
    private List<VirtualNetworkInner> value;

    /*
     * The link to the next page of items
     */
    private String nextLink;

    /**
     * Creates an instance of VirtualNetworkListResult class.
     */
    private VirtualNetworkListResult() {
    }

    /**
     * Get the value property: The VirtualNetwork items on this page.
     * 
     * @return the value value.
     */
    public List<VirtualNetworkInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model VirtualNetworkListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualNetworkListResult.
     */
    public static VirtualNetworkListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkListResult deserializedVirtualNetworkListResult = new VirtualNetworkListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VirtualNetworkInner> value
                        = reader.readArray(reader1 -> VirtualNetworkInner.fromJson(reader1));
                    deserializedVirtualNetworkListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedVirtualNetworkListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkListResult;
        });
    }
}
