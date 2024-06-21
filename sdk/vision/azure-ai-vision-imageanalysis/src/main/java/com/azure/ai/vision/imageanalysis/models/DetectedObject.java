// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Represents a physical object detected in an image.
 */
@Immutable
public final class DetectedObject implements JsonSerializable<DetectedObject> {

    /*
     * A rectangular boundary where the object was detected.
     */
    @Generated
    private final ImageBoundingBox boundingBox;

    /*
     * A single-item list containing the object information.
     */
    @Generated
    private final List<DetectedTag> tags;

    /**
     * Creates an instance of DetectedObject class.
     *
     * @param boundingBox the boundingBox value to set.
     * @param tags the tags value to set.
     */
    @Generated
    private DetectedObject(ImageBoundingBox boundingBox, List<DetectedTag> tags) {
        this.boundingBox = boundingBox;
        this.tags = tags;
    }

    /**
     * Get the boundingBox property: A rectangular boundary where the object was detected.
     *
     * @return the boundingBox value.
     */
    @Generated
    public ImageBoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Get the tags property: A single-item list containing the object information.
     *
     * @return the tags value.
     */
    @Generated
    public List<DetectedTag> getTags() {
        return this.tags;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("boundingBox", this.boundingBox);
        jsonWriter.writeArrayField("tags", this.tags, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DetectedObject from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DetectedObject if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DetectedObject.
     */
    @Generated
    public static DetectedObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageBoundingBox boundingBox = null;
            List<DetectedTag> tags = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("boundingBox".equals(fieldName)) {
                    boundingBox = ImageBoundingBox.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readArray(reader1 -> DetectedTag.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new DetectedObject(boundingBox, tags);
        });
    }
}
