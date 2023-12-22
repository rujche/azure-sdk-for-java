// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Information about the extracted key or value in a key-value pair.
 */
@Fluent
public final class KeyValueElement implements JsonSerializable<KeyValueElement> {
    /*
     * Semantic data type of the key value element.
     */
    private KeyValueType type;

    /*
     * The text content of the key or value.
     */
    private String text;

    /*
     * Bounding box of the key or value.
     */
    private List<Float> boundingBox;

    /*
     * When includeTextDetails is set to true, a list of references to the text elements constituting this key or
     * value.
     */
    private List<String> elements;

    /**
     * Creates an instance of KeyValueElement class.
     */
    public KeyValueElement() {
    }

    /**
     * Get the type property: Semantic data type of the key value element.
     * 
     * @return the type value.
     */
    public KeyValueType getType() {
        return this.type;
    }

    /**
     * Set the type property: Semantic data type of the key value element.
     * 
     * @param type the type value to set.
     * @return the KeyValueElement object itself.
     */
    public KeyValueElement setType(KeyValueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the text property: The text content of the key or value.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text content of the key or value.
     * 
     * @param text the text value to set.
     * @return the KeyValueElement object itself.
     */
    public KeyValueElement setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of the key or value.
     * 
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of the key or value.
     * 
     * @param boundingBox the boundingBox value to set.
     * @return the KeyValueElement object itself.
     */
    public KeyValueElement setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this key or value.
     * 
     * @return the elements value.
     */
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * Set the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this key or value.
     * 
     * @param elements the elements value to set.
     * @return the KeyValueElement object itself.
     */
    public KeyValueElement setElements(List<String> elements) {
        this.elements = elements;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeArrayField("boundingBox", this.boundingBox, (writer, element) -> writer.writeFloat(element));
        jsonWriter.writeArrayField("elements", this.elements, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyValueElement from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyValueElement if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeyValueElement.
     */
    public static KeyValueElement fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyValueElement deserializedKeyValueElement = new KeyValueElement();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    deserializedKeyValueElement.text = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedKeyValueElement.type = KeyValueType.fromString(reader.getString());
                } else if ("boundingBox".equals(fieldName)) {
                    List<Float> boundingBox = reader.readArray(reader1 -> reader1.getFloat());
                    deserializedKeyValueElement.boundingBox = boundingBox;
                } else if ("elements".equals(fieldName)) {
                    List<String> elements = reader.readArray(reader1 -> reader1.getString());
                    deserializedKeyValueElement.elements = elements;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyValueElement;
        });
    }
}
