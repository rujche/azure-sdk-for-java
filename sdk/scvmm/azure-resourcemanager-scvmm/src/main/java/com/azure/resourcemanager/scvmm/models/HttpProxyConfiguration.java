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

/**
 * HTTP Proxy configuration for the VM.
 */
@Fluent
public final class HttpProxyConfiguration implements JsonSerializable<HttpProxyConfiguration> {
    /*
     * Gets or sets httpsProxy url.
     */
    private String httpsProxy;

    /**
     * Creates an instance of HttpProxyConfiguration class.
     */
    public HttpProxyConfiguration() {
    }

    /**
     * Get the httpsProxy property: Gets or sets httpsProxy url.
     * 
     * @return the httpsProxy value.
     */
    public String httpsProxy() {
        return this.httpsProxy;
    }

    /**
     * Set the httpsProxy property: Gets or sets httpsProxy url.
     * 
     * @param httpsProxy the httpsProxy value to set.
     * @return the HttpProxyConfiguration object itself.
     */
    public HttpProxyConfiguration withHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("httpsProxy", this.httpsProxy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpProxyConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpProxyConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HttpProxyConfiguration.
     */
    public static HttpProxyConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HttpProxyConfiguration deserializedHttpProxyConfiguration = new HttpProxyConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("httpsProxy".equals(fieldName)) {
                    deserializedHttpProxyConfiguration.httpsProxy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHttpProxyConfiguration;
        });
    }
}
