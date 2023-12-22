// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.ai.formrecognizer.documentanalysis.models.DocumentBarcodeKind;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A barcode object.
 */
@Fluent
public final class DocumentBarcode implements JsonSerializable<DocumentBarcode> {
    /*
     * Barcode kind.
     */
    private final DocumentBarcodeKind kind;

    /*
     * Barcode value
     */
    private final String value;

    /*
     * Bounding polygon of the barcode.
     */
    private List<Float> polygon;

    /*
     * Location of the barcode in the reading order concatenated content.
     */
    private final DocumentSpan span;

    /*
     * Confidence of correctly extracting the barcode.
     */
    private final float confidence;

    /**
     * Creates an instance of DocumentBarcode class.
     * 
     * @param kind the kind value to set.
     * @param value the value value to set.
     * @param span the span value to set.
     * @param confidence the confidence value to set.
     */
    public DocumentBarcode(DocumentBarcodeKind kind, String value, DocumentSpan span, float confidence) {
        this.kind = kind;
        this.value = value;
        this.span = span;
        this.confidence = confidence;
    }

    /**
     * Get the kind property: Barcode kind.
     * 
     * @return the kind value.
     */
    public DocumentBarcodeKind getKind() {
        return this.kind;
    }

    /**
     * Get the value property: Barcode value.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Get the polygon property: Bounding polygon of the barcode.
     * 
     * @return the polygon value.
     */
    public List<Float> getPolygon() {
        return this.polygon;
    }

    /**
     * Set the polygon property: Bounding polygon of the barcode.
     * 
     * @param polygon the polygon value to set.
     * @return the DocumentBarcode object itself.
     */
    public DocumentBarcode setPolygon(List<Float> polygon) {
        this.polygon = polygon;
        return this;
    }

    /**
     * Get the span property: Location of the barcode in the reading order concatenated content.
     * 
     * @return the span value.
     */
    public DocumentSpan getSpan() {
        return this.span;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the barcode.
     * 
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeJsonField("span", this.span);
        jsonWriter.writeFloatField("confidence", this.confidence);
        jsonWriter.writeArrayField("polygon", this.polygon, (writer, element) -> writer.writeFloat(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentBarcode from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentBarcode if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentBarcode.
     */
    public static DocumentBarcode fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean kindFound = false;
            DocumentBarcodeKind kind = null;
            boolean valueFound = false;
            String value = null;
            boolean spanFound = false;
            DocumentSpan span = null;
            boolean confidenceFound = false;
            float confidence = 0.0f;
            List<Float> polygon = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    kind = DocumentBarcodeKind.fromString(reader.getString());
                    kindFound = true;
                } else if ("value".equals(fieldName)) {
                    value = reader.getString();
                    valueFound = true;
                } else if ("span".equals(fieldName)) {
                    span = DocumentSpan.fromJson(reader);
                    spanFound = true;
                } else if ("confidence".equals(fieldName)) {
                    confidence = reader.getFloat();
                    confidenceFound = true;
                } else if ("polygon".equals(fieldName)) {
                    polygon = reader.readArray(reader1 -> reader1.getFloat());
                } else {
                    reader.skipChildren();
                }
            }
            if (kindFound && valueFound && spanFound && confidenceFound) {
                DocumentBarcode deserializedDocumentBarcode = new DocumentBarcode(kind, value, span, confidence);
                deserializedDocumentBarcode.polygon = polygon;

                return deserializedDocumentBarcode;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!kindFound) {
                missingProperties.add("kind");
            }
            if (!valueFound) {
                missingProperties.add("value");
            }
            if (!spanFound) {
                missingProperties.add("span");
            }
            if (!confidenceFound) {
                missingProperties.add("confidence");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
