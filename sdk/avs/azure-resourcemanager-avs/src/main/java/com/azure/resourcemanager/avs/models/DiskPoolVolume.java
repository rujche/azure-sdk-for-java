// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An iSCSI volume from Microsoft.StoragePool provider.
 */
@Fluent
public final class DiskPoolVolume implements JsonSerializable<DiskPoolVolume> {
    /*
     * Azure resource ID of the iSCSI target
     */
    private String targetId;

    /*
     * Name of the LUN to be used for datastore
     */
    private String lunName;

    /*
     * Mode that describes whether the LUN has to be mounted as a datastore or
     * attached as a LUN
     */
    private MountOptionEnum mountOption;

    /*
     * Device path
     */
    private String path;

    /**
     * Creates an instance of DiskPoolVolume class.
     */
    public DiskPoolVolume() {
    }

    /**
     * Get the targetId property: Azure resource ID of the iSCSI target.
     * 
     * @return the targetId value.
     */
    public String targetId() {
        return this.targetId;
    }

    /**
     * Set the targetId property: Azure resource ID of the iSCSI target.
     * 
     * @param targetId the targetId value to set.
     * @return the DiskPoolVolume object itself.
     */
    public DiskPoolVolume withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * Get the lunName property: Name of the LUN to be used for datastore.
     * 
     * @return the lunName value.
     */
    public String lunName() {
        return this.lunName;
    }

    /**
     * Set the lunName property: Name of the LUN to be used for datastore.
     * 
     * @param lunName the lunName value to set.
     * @return the DiskPoolVolume object itself.
     */
    public DiskPoolVolume withLunName(String lunName) {
        this.lunName = lunName;
        return this;
    }

    /**
     * Get the mountOption property: Mode that describes whether the LUN has to be mounted as a datastore or
     * attached as a LUN.
     * 
     * @return the mountOption value.
     */
    public MountOptionEnum mountOption() {
        return this.mountOption;
    }

    /**
     * Set the mountOption property: Mode that describes whether the LUN has to be mounted as a datastore or
     * attached as a LUN.
     * 
     * @param mountOption the mountOption value to set.
     * @return the DiskPoolVolume object itself.
     */
    public DiskPoolVolume withMountOption(MountOptionEnum mountOption) {
        this.mountOption = mountOption;
        return this;
    }

    /**
     * Get the path property: Device path.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property targetId in model DiskPoolVolume"));
        }
        if (lunName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property lunName in model DiskPoolVolume"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskPoolVolume.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetId", this.targetId);
        jsonWriter.writeStringField("lunName", this.lunName);
        jsonWriter.writeStringField("mountOption", this.mountOption == null ? null : this.mountOption.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiskPoolVolume from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskPoolVolume if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiskPoolVolume.
     */
    public static DiskPoolVolume fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskPoolVolume deserializedDiskPoolVolume = new DiskPoolVolume();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetId".equals(fieldName)) {
                    deserializedDiskPoolVolume.targetId = reader.getString();
                } else if ("lunName".equals(fieldName)) {
                    deserializedDiskPoolVolume.lunName = reader.getString();
                } else if ("mountOption".equals(fieldName)) {
                    deserializedDiskPoolVolume.mountOption = MountOptionEnum.fromString(reader.getString());
                } else if ("path".equals(fieldName)) {
                    deserializedDiskPoolVolume.path = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiskPoolVolume;
        });
    }
}
