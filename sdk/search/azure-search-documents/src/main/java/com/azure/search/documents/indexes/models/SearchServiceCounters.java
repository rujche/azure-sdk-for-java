// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents service-level resource counters and quotas.
 */
@Fluent
public final class SearchServiceCounters implements JsonSerializable<SearchServiceCounters> {
    /*
     * Total number of documents across all indexes in the service.
     */
    private final ResourceCounter documentCounter;

    /*
     * Total number of indexes.
     */
    private final ResourceCounter indexCounter;

    /*
     * Total number of indexers.
     */
    private final ResourceCounter indexerCounter;

    /*
     * Total number of data sources.
     */
    private final ResourceCounter dataSourceCounter;

    /*
     * Total size of used storage in bytes.
     */
    private final ResourceCounter storageSizeCounter;

    /*
     * Total number of synonym maps.
     */
    private final ResourceCounter synonymMapCounter;

    /*
     * Total number of skillsets.
     */
    private ResourceCounter skillsetCounter;

    /*
     * Total memory consumption of all vector indexes within the service, in bytes.
     */
    private ResourceCounter vectorIndexSizeCounter;

    /**
     * Creates an instance of SearchServiceCounters class.
     * 
     * @param documentCounter the documentCounter value to set.
     * @param indexCounter the indexCounter value to set.
     * @param indexerCounter the indexerCounter value to set.
     * @param dataSourceCounter the dataSourceCounter value to set.
     * @param storageSizeCounter the storageSizeCounter value to set.
     * @param synonymMapCounter the synonymMapCounter value to set.
     */
    public SearchServiceCounters(ResourceCounter documentCounter, ResourceCounter indexCounter,
        ResourceCounter indexerCounter, ResourceCounter dataSourceCounter, ResourceCounter storageSizeCounter,
        ResourceCounter synonymMapCounter) {
        this.documentCounter = documentCounter;
        this.indexCounter = indexCounter;
        this.indexerCounter = indexerCounter;
        this.dataSourceCounter = dataSourceCounter;
        this.storageSizeCounter = storageSizeCounter;
        this.synonymMapCounter = synonymMapCounter;
    }

    /**
     * Get the documentCounter property: Total number of documents across all indexes in the service.
     * 
     * @return the documentCounter value.
     */
    public ResourceCounter getDocumentCounter() {
        return this.documentCounter;
    }

    /**
     * Get the indexCounter property: Total number of indexes.
     * 
     * @return the indexCounter value.
     */
    public ResourceCounter getIndexCounter() {
        return this.indexCounter;
    }

    /**
     * Get the indexerCounter property: Total number of indexers.
     * 
     * @return the indexerCounter value.
     */
    public ResourceCounter getIndexerCounter() {
        return this.indexerCounter;
    }

    /**
     * Get the dataSourceCounter property: Total number of data sources.
     * 
     * @return the dataSourceCounter value.
     */
    public ResourceCounter getDataSourceCounter() {
        return this.dataSourceCounter;
    }

    /**
     * Get the storageSizeCounter property: Total size of used storage in bytes.
     * 
     * @return the storageSizeCounter value.
     */
    public ResourceCounter getStorageSizeCounter() {
        return this.storageSizeCounter;
    }

    /**
     * Get the synonymMapCounter property: Total number of synonym maps.
     * 
     * @return the synonymMapCounter value.
     */
    public ResourceCounter getSynonymMapCounter() {
        return this.synonymMapCounter;
    }

    /**
     * Get the skillsetCounter property: Total number of skillsets.
     * 
     * @return the skillsetCounter value.
     */
    public ResourceCounter getSkillsetCounter() {
        return this.skillsetCounter;
    }

    /**
     * Set the skillsetCounter property: Total number of skillsets.
     * 
     * @param skillsetCounter the skillsetCounter value to set.
     * @return the SearchServiceCounters object itself.
     */
    public SearchServiceCounters setSkillsetCounter(ResourceCounter skillsetCounter) {
        this.skillsetCounter = skillsetCounter;
        return this;
    }

    /**
     * Get the vectorIndexSizeCounter property: Total memory consumption of all vector indexes within the service, in
     * bytes.
     * 
     * @return the vectorIndexSizeCounter value.
     */
    public ResourceCounter getVectorIndexSizeCounter() {
        return this.vectorIndexSizeCounter;
    }

    /**
     * Set the vectorIndexSizeCounter property: Total memory consumption of all vector indexes within the service, in
     * bytes.
     * 
     * @param vectorIndexSizeCounter the vectorIndexSizeCounter value to set.
     * @return the SearchServiceCounters object itself.
     */
    public SearchServiceCounters setVectorIndexSizeCounter(ResourceCounter vectorIndexSizeCounter) {
        this.vectorIndexSizeCounter = vectorIndexSizeCounter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("documentCount", this.documentCounter);
        jsonWriter.writeJsonField("indexesCount", this.indexCounter);
        jsonWriter.writeJsonField("indexersCount", this.indexerCounter);
        jsonWriter.writeJsonField("dataSourcesCount", this.dataSourceCounter);
        jsonWriter.writeJsonField("storageSize", this.storageSizeCounter);
        jsonWriter.writeJsonField("synonymMaps", this.synonymMapCounter);
        jsonWriter.writeJsonField("skillsetCount", this.skillsetCounter);
        jsonWriter.writeJsonField("vectorIndexSize", this.vectorIndexSizeCounter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchServiceCounters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchServiceCounters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchServiceCounters.
     */
    public static SearchServiceCounters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean documentCounterFound = false;
            ResourceCounter documentCounter = null;
            boolean indexCounterFound = false;
            ResourceCounter indexCounter = null;
            boolean indexerCounterFound = false;
            ResourceCounter indexerCounter = null;
            boolean dataSourceCounterFound = false;
            ResourceCounter dataSourceCounter = null;
            boolean storageSizeCounterFound = false;
            ResourceCounter storageSizeCounter = null;
            boolean synonymMapCounterFound = false;
            ResourceCounter synonymMapCounter = null;
            ResourceCounter skillsetCounter = null;
            ResourceCounter vectorIndexSizeCounter = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("documentCount".equals(fieldName)) {
                    documentCounter = ResourceCounter.fromJson(reader);
                    documentCounterFound = true;
                } else if ("indexesCount".equals(fieldName)) {
                    indexCounter = ResourceCounter.fromJson(reader);
                    indexCounterFound = true;
                } else if ("indexersCount".equals(fieldName)) {
                    indexerCounter = ResourceCounter.fromJson(reader);
                    indexerCounterFound = true;
                } else if ("dataSourcesCount".equals(fieldName)) {
                    dataSourceCounter = ResourceCounter.fromJson(reader);
                    dataSourceCounterFound = true;
                } else if ("storageSize".equals(fieldName)) {
                    storageSizeCounter = ResourceCounter.fromJson(reader);
                    storageSizeCounterFound = true;
                } else if ("synonymMaps".equals(fieldName)) {
                    synonymMapCounter = ResourceCounter.fromJson(reader);
                    synonymMapCounterFound = true;
                } else if ("skillsetCount".equals(fieldName)) {
                    skillsetCounter = ResourceCounter.fromJson(reader);
                } else if ("vectorIndexSize".equals(fieldName)) {
                    vectorIndexSizeCounter = ResourceCounter.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (documentCounterFound
                && indexCounterFound
                && indexerCounterFound
                && dataSourceCounterFound
                && storageSizeCounterFound
                && synonymMapCounterFound) {
                SearchServiceCounters deserializedSearchServiceCounters = new SearchServiceCounters(documentCounter,
                    indexCounter, indexerCounter, dataSourceCounter, storageSizeCounter, synonymMapCounter);
                deserializedSearchServiceCounters.skillsetCounter = skillsetCounter;
                deserializedSearchServiceCounters.vectorIndexSizeCounter = vectorIndexSizeCounter;

                return deserializedSearchServiceCounters;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!documentCounterFound) {
                missingProperties.add("documentCount");
            }
            if (!indexCounterFound) {
                missingProperties.add("indexesCount");
            }
            if (!indexerCounterFound) {
                missingProperties.add("indexersCount");
            }
            if (!dataSourceCounterFound) {
                missingProperties.add("dataSourcesCount");
            }
            if (!storageSizeCounterFound) {
                missingProperties.add("storageSize");
            }
            if (!synonymMapCounterFound) {
                missingProperties.add("synonymMaps");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
