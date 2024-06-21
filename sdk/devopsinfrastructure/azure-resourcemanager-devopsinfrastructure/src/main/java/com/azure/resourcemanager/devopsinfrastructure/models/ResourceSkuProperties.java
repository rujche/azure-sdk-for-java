// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of a ResourceSku.
 */
@Immutable
public final class ResourceSkuProperties implements JsonSerializable<ResourceSkuProperties> {
    /*
     * The type of resource the SKU applies to.
     */
    private String resourceType;

    /*
     * The tier of virtual machines in a scale set
     */
    private String tier;

    /*
     * The size of the SKU.
     */
    private String size;

    /*
     * The family of the SKU.
     */
    private String family;

    /*
     * The set of locations that the SKU is available.
     */
    private List<String> locations;

    /*
     * A list of locations and availability zones in those locations where the SKU is available
     */
    private List<ResourceSkuLocationInfo> locationInfo;

    /*
     * Name value pairs to describe the capability.
     */
    private List<ResourceSkuCapabilities> capabilities;

    /*
     * The restrictions of the SKU.
     */
    private List<ResourceSkuRestrictions> restrictions;

    /**
     * Creates an instance of ResourceSkuProperties class.
     */
    private ResourceSkuProperties() {
    }

    /**
     * Get the resourceType property: The type of resource the SKU applies to.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the tier property: The tier of virtual machines in a scale set.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the size property: The size of the SKU.
     * 
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Get the family property: The family of the SKU.
     * 
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Get the locations property: The set of locations that the SKU is available.
     * 
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the locationInfo property: A list of locations and availability zones in those locations where the SKU is
     * available.
     * 
     * @return the locationInfo value.
     */
    public List<ResourceSkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Get the capabilities property: Name value pairs to describe the capability.
     * 
     * @return the capabilities value.
     */
    public List<ResourceSkuCapabilities> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the restrictions property: The restrictions of the SKU.
     * 
     * @return the restrictions value.
     */
    public List<ResourceSkuRestrictions> restrictions() {
        return this.restrictions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resourceType in model ResourceSkuProperties"));
        }
        if (tier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tier in model ResourceSkuProperties"));
        }
        if (size() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property size in model ResourceSkuProperties"));
        }
        if (family() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property family in model ResourceSkuProperties"));
        }
        if (locations() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property locations in model ResourceSkuProperties"));
        }
        if (locationInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property locationInfo in model ResourceSkuProperties"));
        } else {
            locationInfo().forEach(e -> e.validate());
        }
        if (capabilities() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property capabilities in model ResourceSkuProperties"));
        } else {
            capabilities().forEach(e -> e.validate());
        }
        if (restrictions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property restrictions in model ResourceSkuProperties"));
        } else {
            restrictions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceSkuProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeStringField("tier", this.tier);
        jsonWriter.writeStringField("size", this.size);
        jsonWriter.writeStringField("family", this.family);
        jsonWriter.writeArrayField("locations", this.locations, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("locationInfo", this.locationInfo, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("capabilities", this.capabilities, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("restrictions", this.restrictions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceSkuProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSkuProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceSkuProperties.
     */
    public static ResourceSkuProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSkuProperties deserializedResourceSkuProperties = new ResourceSkuProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceType".equals(fieldName)) {
                    deserializedResourceSkuProperties.resourceType = reader.getString();
                } else if ("tier".equals(fieldName)) {
                    deserializedResourceSkuProperties.tier = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedResourceSkuProperties.size = reader.getString();
                } else if ("family".equals(fieldName)) {
                    deserializedResourceSkuProperties.family = reader.getString();
                } else if ("locations".equals(fieldName)) {
                    List<String> locations = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceSkuProperties.locations = locations;
                } else if ("locationInfo".equals(fieldName)) {
                    List<ResourceSkuLocationInfo> locationInfo
                        = reader.readArray(reader1 -> ResourceSkuLocationInfo.fromJson(reader1));
                    deserializedResourceSkuProperties.locationInfo = locationInfo;
                } else if ("capabilities".equals(fieldName)) {
                    List<ResourceSkuCapabilities> capabilities
                        = reader.readArray(reader1 -> ResourceSkuCapabilities.fromJson(reader1));
                    deserializedResourceSkuProperties.capabilities = capabilities;
                } else if ("restrictions".equals(fieldName)) {
                    List<ResourceSkuRestrictions> restrictions
                        = reader.readArray(reader1 -> ResourceSkuRestrictions.fromJson(reader1));
                    deserializedResourceSkuProperties.restrictions = restrictions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSkuProperties;
        });
    }
}
