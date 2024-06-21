// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Evidence file's download request.
 */
@Fluent
public final class EvidenceFileDownloadRequest implements JsonSerializable<EvidenceFileDownloadRequest> {
    /*
     * Tenant id.
     */
    private String reportCreatorTenantId;

    /*
     * The offerGuid which mapping to the reports.
     */
    private String offerGuid;

    /**
     * Creates an instance of EvidenceFileDownloadRequest class.
     */
    public EvidenceFileDownloadRequest() {
    }

    /**
     * Get the reportCreatorTenantId property: Tenant id.
     * 
     * @return the reportCreatorTenantId value.
     */
    public String reportCreatorTenantId() {
        return this.reportCreatorTenantId;
    }

    /**
     * Set the reportCreatorTenantId property: Tenant id.
     * 
     * @param reportCreatorTenantId the reportCreatorTenantId value to set.
     * @return the EvidenceFileDownloadRequest object itself.
     */
    public EvidenceFileDownloadRequest withReportCreatorTenantId(String reportCreatorTenantId) {
        this.reportCreatorTenantId = reportCreatorTenantId;
        return this;
    }

    /**
     * Get the offerGuid property: The offerGuid which mapping to the reports.
     * 
     * @return the offerGuid value.
     */
    public String offerGuid() {
        return this.offerGuid;
    }

    /**
     * Set the offerGuid property: The offerGuid which mapping to the reports.
     * 
     * @param offerGuid the offerGuid value to set.
     * @return the EvidenceFileDownloadRequest object itself.
     */
    public EvidenceFileDownloadRequest withOfferGuid(String offerGuid) {
        this.offerGuid = offerGuid;
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
        jsonWriter.writeStringField("reportCreatorTenantId", this.reportCreatorTenantId);
        jsonWriter.writeStringField("offerGuid", this.offerGuid);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EvidenceFileDownloadRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EvidenceFileDownloadRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EvidenceFileDownloadRequest.
     */
    public static EvidenceFileDownloadRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EvidenceFileDownloadRequest deserializedEvidenceFileDownloadRequest = new EvidenceFileDownloadRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("reportCreatorTenantId".equals(fieldName)) {
                    deserializedEvidenceFileDownloadRequest.reportCreatorTenantId = reader.getString();
                } else if ("offerGuid".equals(fieldName)) {
                    deserializedEvidenceFileDownloadRequest.offerGuid = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEvidenceFileDownloadRequest;
        });
    }
}
