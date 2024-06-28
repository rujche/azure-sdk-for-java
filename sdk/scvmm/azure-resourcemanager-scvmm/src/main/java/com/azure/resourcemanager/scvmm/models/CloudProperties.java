// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines the resource properties.
 */
@Fluent
public final class CloudProperties implements JsonSerializable<CloudProperties> {
    /*
     * Gets or sets the inventory Item ID for the resource.
     */
    private String inventoryItemId;

    /*
     * Unique ID of the cloud.
     */
    private String uuid;

    /*
     * ARM Id of the vmmServer resource in which this resource resides.
     */
    private String vmmServerId;

    /*
     * Name of the cloud in VmmServer.
     */
    private String cloudName;

    /*
     * Capacity of the cloud.
     */
    private CloudCapacity cloudCapacity;

    /*
     * List of QoS policies available for the cloud.
     */
    private List<StorageQosPolicy> storageQosPolicies;

    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of CloudProperties class.
     */
    public CloudProperties() {
    }

    /**
     * Get the inventoryItemId property: Gets or sets the inventory Item ID for the resource.
     * 
     * @return the inventoryItemId value.
     */
    public String inventoryItemId() {
        return this.inventoryItemId;
    }

    /**
     * Set the inventoryItemId property: Gets or sets the inventory Item ID for the resource.
     * 
     * @param inventoryItemId the inventoryItemId value to set.
     * @return the CloudProperties object itself.
     */
    public CloudProperties withInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    /**
     * Get the uuid property: Unique ID of the cloud.
     * 
     * @return the uuid value.
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: Unique ID of the cloud.
     * 
     * @param uuid the uuid value to set.
     * @return the CloudProperties object itself.
     */
    public CloudProperties withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides.
     * 
     * @return the vmmServerId value.
     */
    public String vmmServerId() {
        return this.vmmServerId;
    }

    /**
     * Set the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides.
     * 
     * @param vmmServerId the vmmServerId value to set.
     * @return the CloudProperties object itself.
     */
    public CloudProperties withVmmServerId(String vmmServerId) {
        this.vmmServerId = vmmServerId;
        return this;
    }

    /**
     * Get the cloudName property: Name of the cloud in VmmServer.
     * 
     * @return the cloudName value.
     */
    public String cloudName() {
        return this.cloudName;
    }

    /**
     * Get the cloudCapacity property: Capacity of the cloud.
     * 
     * @return the cloudCapacity value.
     */
    public CloudCapacity cloudCapacity() {
        return this.cloudCapacity;
    }

    /**
     * Get the storageQosPolicies property: List of QoS policies available for the cloud.
     * 
     * @return the storageQosPolicies value.
     */
    public List<StorageQosPolicy> storageQosPolicies() {
        return this.storageQosPolicies;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cloudCapacity() != null) {
            cloudCapacity().validate();
        }
        if (storageQosPolicies() != null) {
            storageQosPolicies().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("inventoryItemId", this.inventoryItemId);
        jsonWriter.writeStringField("uuid", this.uuid);
        jsonWriter.writeStringField("vmmServerId", this.vmmServerId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudProperties.
     */
    public static CloudProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudProperties deserializedCloudProperties = new CloudProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inventoryItemId".equals(fieldName)) {
                    deserializedCloudProperties.inventoryItemId = reader.getString();
                } else if ("uuid".equals(fieldName)) {
                    deserializedCloudProperties.uuid = reader.getString();
                } else if ("vmmServerId".equals(fieldName)) {
                    deserializedCloudProperties.vmmServerId = reader.getString();
                } else if ("cloudName".equals(fieldName)) {
                    deserializedCloudProperties.cloudName = reader.getString();
                } else if ("cloudCapacity".equals(fieldName)) {
                    deserializedCloudProperties.cloudCapacity = CloudCapacity.fromJson(reader);
                } else if ("storageQoSPolicies".equals(fieldName)) {
                    List<StorageQosPolicy> storageQosPolicies
                        = reader.readArray(reader1 -> StorageQosPolicy.fromJson(reader1));
                    deserializedCloudProperties.storageQosPolicies = storageQosPolicies;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCloudProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudProperties;
        });
    }
}
