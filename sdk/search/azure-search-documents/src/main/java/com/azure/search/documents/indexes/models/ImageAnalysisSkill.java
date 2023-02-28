// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A skill that analyzes image files. It extracts a rich set of visual features based on the image content. */
@Fluent
public final class ImageAnalysisSkill extends SearchIndexerSkill {
    /*
     * Identifies the concrete type of the skill.
     */
    private static final String ODATA_TYPE = "#Microsoft.Skills.Vision.ImageAnalysisSkill";

    /*
     * A value indicating which language code to use. Default is en.
     */
    private ImageAnalysisSkillLanguage defaultLanguageCode;

    /*
     * A list of visual features.
     */
    private List<VisualFeature> visualFeatures;

    /*
     * A string indicating which domain-specific details to return.
     */
    private List<ImageDetail> details;

    /**
     * Creates an instance of ImageAnalysisSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public ImageAnalysisSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public ImageAnalysisSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the ImageAnalysisSkill object itself.
     */
    public ImageAnalysisSkill setDefaultLanguageCode(ImageAnalysisSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the visualFeatures property: A list of visual features.
     *
     * @return the visualFeatures value.
     */
    public List<VisualFeature> getVisualFeatures() {
        return this.visualFeatures;
    }

    /**
     * Set the visualFeatures property: A list of visual features.
     *
     * @param visualFeatures the visualFeatures value to set.
     * @return the ImageAnalysisSkill object itself.
     */
    public ImageAnalysisSkill setVisualFeatures(List<VisualFeature> visualFeatures) {
        this.visualFeatures = visualFeatures;
        return this;
    }

    /**
     * Get the details property: A string indicating which domain-specific details to return.
     *
     * @return the details value.
     */
    public List<ImageDetail> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: A string indicating which domain-specific details to return.
     *
     * @param details the details value to set.
     * @return the ImageAnalysisSkill object itself.
     */
    public ImageAnalysisSkill setDetails(List<ImageDetail> details) {
        this.details = details;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageAnalysisSkill setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageAnalysisSkill setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageAnalysisSkill setContext(String context) {
        super.setContext(context);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeArrayField("inputs", getInputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", getOutputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("context", getContext());
        jsonWriter.writeStringField("defaultLanguageCode", Objects.toString(this.defaultLanguageCode, null));
        jsonWriter.writeArrayField(
                "visualFeatures",
                this.visualFeatures,
                (writer, element) -> writer.writeString(Objects.toString(element, null)));
        jsonWriter.writeArrayField(
                "details", this.details, (writer, element) -> writer.writeString(Objects.toString(element, null)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageAnalysisSkill from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageAnalysisSkill if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ImageAnalysisSkill.
     */
    public static ImageAnalysisSkill fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean inputsFound = false;
                    List<InputFieldMappingEntry> inputs = null;
                    boolean outputsFound = false;
                    List<OutputFieldMappingEntry> outputs = null;
                    String name = null;
                    String description = null;
                    String context = null;
                    ImageAnalysisSkillLanguage defaultLanguageCode = null;
                    List<VisualFeature> visualFeatures = null;
                    List<ImageDetail> details = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("inputs".equals(fieldName)) {
                            inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                            inputsFound = true;
                        } else if ("outputs".equals(fieldName)) {
                            outputs = reader.readArray(reader1 -> OutputFieldMappingEntry.fromJson(reader1));
                            outputsFound = true;
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                        } else if ("description".equals(fieldName)) {
                            description = reader.getString();
                        } else if ("context".equals(fieldName)) {
                            context = reader.getString();
                        } else if ("defaultLanguageCode".equals(fieldName)) {
                            defaultLanguageCode = ImageAnalysisSkillLanguage.fromString(reader.getString());
                        } else if ("visualFeatures".equals(fieldName)) {
                            visualFeatures = reader.readArray(reader1 -> VisualFeature.fromString(reader1.getString()));
                        } else if ("details".equals(fieldName)) {
                            details = reader.readArray(reader1 -> ImageDetail.fromString(reader1.getString()));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (inputsFound && outputsFound) {
                        ImageAnalysisSkill deserializedValue = new ImageAnalysisSkill(inputs, outputs);
                        deserializedValue.setName(name);
                        deserializedValue.setDescription(description);
                        deserializedValue.setContext(context);
                        deserializedValue.defaultLanguageCode = defaultLanguageCode;
                        deserializedValue.visualFeatures = visualFeatures;
                        deserializedValue.details = details;

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!inputsFound) {
                        missingProperties.add("inputs");
                    }
                    if (!outputsFound) {
                        missingProperties.add("outputs");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }

    /**
     * Set the visualFeatures property: A list of visual features.
     *
     * @param visualFeatures the visualFeatures value to set.
     * @return the ImageAnalysisSkill object itself.
     */
    public ImageAnalysisSkill setVisualFeatures(VisualFeature... visualFeatures) {
        this.visualFeatures = (visualFeatures == null) ? null : java.util.Arrays.asList(visualFeatures);
        return this;
    }

    /**
     * Set the details property: A string indicating which domain-specific details to return.
     *
     * @param details the details value to set.
     * @return the ImageAnalysisSkill object itself.
     */
    public ImageAnalysisSkill setDetails(ImageDetail... details) {
        this.details = (details == null) ? null : java.util.Arrays.asList(details);
        return this;
    }
}
