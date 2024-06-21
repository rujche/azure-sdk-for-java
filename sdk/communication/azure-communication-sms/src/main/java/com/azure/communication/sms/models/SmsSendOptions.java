// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Optional configuration for sending SMS messages.
 */
@Fluent
public final class SmsSendOptions implements JsonSerializable<SmsSendOptions> {
    /*
     * Enable this flag to receive a delivery report for this message on the Azure Resource EventGrid.
     */
    private boolean deliveryReportEnabled;

    /*
     * Use this field to provide metadata that will then be sent back in the corresponding Delivery Report.
     */
    private String tag;

    /**
     * Creates an instance of SmsSendOptions class.
     */
    public SmsSendOptions() {
    }

    /**
     * Get the deliveryReportEnabled property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     * 
     * @return the deliveryReportEnabled value.
     */
    public boolean isDeliveryReportEnabled() {
        return this.deliveryReportEnabled;
    }

    /**
     * Set the deliveryReportEnabled property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     * 
     * @param deliveryReportEnabled the deliveryReportEnabled value to set.
     * @return the SmsSendOptions object itself.
     */
    public SmsSendOptions setDeliveryReportEnabled(boolean deliveryReportEnabled) {
        this.deliveryReportEnabled = deliveryReportEnabled;
        return this;
    }

    /**
     * Get the tag property: Use this field to provide metadata that will then be sent back in the corresponding
     * Delivery Report.
     * 
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: Use this field to provide metadata that will then be sent back in the corresponding
     * Delivery Report.
     * 
     * @param tag the tag value to set.
     * @return the SmsSendOptions object itself.
     */
    public SmsSendOptions setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enableDeliveryReport", this.deliveryReportEnabled);
        jsonWriter.writeStringField("tag", this.tag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SmsSendOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SmsSendOptions if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SmsSendOptions.
     */
    public static SmsSendOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SmsSendOptions deserializedSmsSendOptions = new SmsSendOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enableDeliveryReport".equals(fieldName)) {
                    deserializedSmsSendOptions.deliveryReportEnabled = reader.getBoolean();
                } else if ("tag".equals(fieldName)) {
                    deserializedSmsSendOptions.tag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSmsSendOptions;
        });
    }
}
