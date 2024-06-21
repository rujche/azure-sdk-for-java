// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines the Asset Endpoint Profile properties.
 */
@Fluent
public final class AssetEndpointProfileProperties implements JsonSerializable<AssetEndpointProfileProperties> {
    /*
     * Globally unique, immutable, non-reusable id.
     */
    private String uuid;

    /*
     * The local valid URI specifying the network address/DNS name of a southbound device. The scheme part of the
     * targetAddress URI specifies the type of the device. The additionalConfiguration field holds further connector
     * type specific configuration.
     */
    private String targetAddress;

    /*
     * Defines the client authentication mechanism to the server.
     */
    private UserAuthentication userAuthentication;

    /*
     * Defines the authentication mechanism for the southbound connector connecting to the shop floor/OT device.
     */
    private TransportAuthentication transportAuthentication;

    /*
     * Contains connectivity type specific further configuration (e.g. OPC UA, Modbus, ONVIF).
     */
    private String additionalConfiguration;

    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of AssetEndpointProfileProperties class.
     */
    public AssetEndpointProfileProperties() {
    }

    /**
     * Get the uuid property: Globally unique, immutable, non-reusable id.
     * 
     * @return the uuid value.
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Get the targetAddress property: The local valid URI specifying the network address/DNS name of a southbound
     * device. The scheme part of the targetAddress URI specifies the type of the device. The additionalConfiguration
     * field holds further connector type specific configuration.
     * 
     * @return the targetAddress value.
     */
    public String targetAddress() {
        return this.targetAddress;
    }

    /**
     * Set the targetAddress property: The local valid URI specifying the network address/DNS name of a southbound
     * device. The scheme part of the targetAddress URI specifies the type of the device. The additionalConfiguration
     * field holds further connector type specific configuration.
     * 
     * @param targetAddress the targetAddress value to set.
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
        return this;
    }

    /**
     * Get the userAuthentication property: Defines the client authentication mechanism to the server.
     * 
     * @return the userAuthentication value.
     */
    public UserAuthentication userAuthentication() {
        return this.userAuthentication;
    }

    /**
     * Set the userAuthentication property: Defines the client authentication mechanism to the server.
     * 
     * @param userAuthentication the userAuthentication value to set.
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withUserAuthentication(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
        return this;
    }

    /**
     * Get the transportAuthentication property: Defines the authentication mechanism for the southbound connector
     * connecting to the shop floor/OT device.
     * 
     * @return the transportAuthentication value.
     */
    public TransportAuthentication transportAuthentication() {
        return this.transportAuthentication;
    }

    /**
     * Set the transportAuthentication property: Defines the authentication mechanism for the southbound connector
     * connecting to the shop floor/OT device.
     * 
     * @param transportAuthentication the transportAuthentication value to set.
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withTransportAuthentication(TransportAuthentication transportAuthentication) {
        this.transportAuthentication = transportAuthentication;
        return this;
    }

    /**
     * Get the additionalConfiguration property: Contains connectivity type specific further configuration (e.g. OPC UA,
     * Modbus, ONVIF).
     * 
     * @return the additionalConfiguration value.
     */
    public String additionalConfiguration() {
        return this.additionalConfiguration;
    }

    /**
     * Set the additionalConfiguration property: Contains connectivity type specific further configuration (e.g. OPC UA,
     * Modbus, ONVIF).
     * 
     * @param additionalConfiguration the additionalConfiguration value to set.
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withAdditionalConfiguration(String additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
        return this;
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
        if (targetAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetAddress in model AssetEndpointProfileProperties"));
        }
        if (userAuthentication() != null) {
            userAuthentication().validate();
        }
        if (transportAuthentication() != null) {
            transportAuthentication().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssetEndpointProfileProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetAddress", this.targetAddress);
        jsonWriter.writeJsonField("userAuthentication", this.userAuthentication);
        jsonWriter.writeJsonField("transportAuthentication", this.transportAuthentication);
        jsonWriter.writeStringField("additionalConfiguration", this.additionalConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssetEndpointProfileProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetEndpointProfileProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssetEndpointProfileProperties.
     */
    public static AssetEndpointProfileProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetEndpointProfileProperties deserializedAssetEndpointProfileProperties
                = new AssetEndpointProfileProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetAddress".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.targetAddress = reader.getString();
                } else if ("uuid".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.uuid = reader.getString();
                } else if ("userAuthentication".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.userAuthentication = UserAuthentication.fromJson(reader);
                } else if ("transportAuthentication".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.transportAuthentication
                        = TransportAuthentication.fromJson(reader);
                } else if ("additionalConfiguration".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.additionalConfiguration = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssetEndpointProfileProperties;
        });
    }
}
