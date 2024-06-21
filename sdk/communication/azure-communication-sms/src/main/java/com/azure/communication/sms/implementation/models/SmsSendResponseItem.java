// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response for a single recipient.
 */
@Fluent
public final class SmsSendResponseItem implements JsonSerializable<SmsSendResponseItem> {
    /*
     * The recipient's phone number in E.164 format.
     */
    private String to;

    /*
     * The identifier of the outgoing Sms message. Only present if message processed.
     */
    private String messageId;

    /*
     * HTTP Status code.
     */
    private int httpStatusCode;

    /*
     * The result of a repeatable request with one of the case-insensitive values accepted or rejected.
     */
    private SmsSendResponseItemRepeatabilityResult repeatabilityResult;

    /*
     * Indicates if the message is processed successfully or not.
     */
    private boolean successful;

    /*
     * Optional error message in case of 4xx/5xx/repeatable errors.
     */
    private String errorMessage;

    /**
     * Creates an instance of SmsSendResponseItem class.
     */
    public SmsSendResponseItem() {
    }

    /**
     * Get the to property: The recipient's phone number in E.164 format.
     * 
     * @return the to value.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Set the to property: The recipient's phone number in E.164 format.
     * 
     * @param to the to value to set.
     * @return the SmsSendResponseItem object itself.
     */
    public SmsSendResponseItem setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the messageId property: The identifier of the outgoing Sms message. Only present if message processed.
     * 
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The identifier of the outgoing Sms message. Only present if message processed.
     * 
     * @param messageId the messageId value to set.
     * @return the SmsSendResponseItem object itself.
     */
    public SmsSendResponseItem setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the httpStatusCode property: HTTP Status code.
     * 
     * @return the httpStatusCode value.
     */
    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * Set the httpStatusCode property: HTTP Status code.
     * 
     * @param httpStatusCode the httpStatusCode value to set.
     * @return the SmsSendResponseItem object itself.
     */
    public SmsSendResponseItem setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    /**
     * Get the repeatabilityResult property: The result of a repeatable request with one of the case-insensitive values
     * accepted or rejected.
     * 
     * @return the repeatabilityResult value.
     */
    public SmsSendResponseItemRepeatabilityResult getRepeatabilityResult() {
        return this.repeatabilityResult;
    }

    /**
     * Set the repeatabilityResult property: The result of a repeatable request with one of the case-insensitive values
     * accepted or rejected.
     * 
     * @param repeatabilityResult the repeatabilityResult value to set.
     * @return the SmsSendResponseItem object itself.
     */
    public SmsSendResponseItem setRepeatabilityResult(SmsSendResponseItemRepeatabilityResult repeatabilityResult) {
        this.repeatabilityResult = repeatabilityResult;
        return this;
    }

    /**
     * Get the successful property: Indicates if the message is processed successfully or not.
     * 
     * @return the successful value.
     */
    public boolean isSuccessful() {
        return this.successful;
    }

    /**
     * Set the successful property: Indicates if the message is processed successfully or not.
     * 
     * @param successful the successful value to set.
     * @return the SmsSendResponseItem object itself.
     */
    public SmsSendResponseItem setSuccessful(boolean successful) {
        this.successful = successful;
        return this;
    }

    /**
     * Get the errorMessage property: Optional error message in case of 4xx/5xx/repeatable errors.
     * 
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Optional error message in case of 4xx/5xx/repeatable errors.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the SmsSendResponseItem object itself.
     */
    public SmsSendResponseItem setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("to", this.to);
        jsonWriter.writeIntField("httpStatusCode", this.httpStatusCode);
        jsonWriter.writeBooleanField("successful", this.successful);
        jsonWriter.writeStringField("messageId", this.messageId);
        jsonWriter.writeStringField("repeatabilityResult",
            this.repeatabilityResult == null ? null : this.repeatabilityResult.toString());
        jsonWriter.writeStringField("errorMessage", this.errorMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SmsSendResponseItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SmsSendResponseItem if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SmsSendResponseItem.
     */
    public static SmsSendResponseItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SmsSendResponseItem deserializedSmsSendResponseItem = new SmsSendResponseItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("to".equals(fieldName)) {
                    deserializedSmsSendResponseItem.to = reader.getString();
                } else if ("httpStatusCode".equals(fieldName)) {
                    deserializedSmsSendResponseItem.httpStatusCode = reader.getInt();
                } else if ("successful".equals(fieldName)) {
                    deserializedSmsSendResponseItem.successful = reader.getBoolean();
                } else if ("messageId".equals(fieldName)) {
                    deserializedSmsSendResponseItem.messageId = reader.getString();
                } else if ("repeatabilityResult".equals(fieldName)) {
                    deserializedSmsSendResponseItem.repeatabilityResult
                        = SmsSendResponseItemRepeatabilityResult.fromString(reader.getString());
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedSmsSendResponseItem.errorMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSmsSendResponseItem;
        });
    }
}
