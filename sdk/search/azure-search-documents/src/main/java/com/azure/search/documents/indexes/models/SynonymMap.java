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

/**
 * Represents a synonym map definition.
 */
@Fluent
public final class SynonymMap implements JsonSerializable<SynonymMap> {

    /*
     * The name of the synonym map.
     */
    private String name;

    /*
     * The format of the synonym map. Only the 'solr' format is currently supported.
     */
    private String format = "solr";

    /*
     * A series of synonym rules in the specified synonym map format. The rules must be separated by newlines.
     */
    private String synonyms;

    /*
     * A description of an encryption key that you create in Azure Key Vault. This key is used to provide an additional
     * level of encryption-at-rest for your data when you want full assurance that no one, not even Microsoft, can
     * decrypt your data. Once you have encrypted your data, it will always remain encrypted. The search service will
     * ignore attempts to set this property to null. You can change this property as needed if you want to rotate your
     * encryption key; Your data will be unaffected. Encryption with customer-managed keys is not available for free
     * search services, and is only available for paid services created on or after January 1, 2019.
     */
    private SearchResourceEncryptionKey encryptionKey;

    /*
     * The ETag of the synonym map.
     */
    private String eTag;

    /**
     * Creates an instance of SynonymMap class.
     */
    public SynonymMap() {
    }

    /**
     * Get the name property: The name of the synonym map.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the synonyms property: A series of synonym rules in the specified synonym map format. The rules must be
     * separated by newlines.
     *
     * @return the synonyms value.
     */
    public String getSynonyms() {
        return this.synonyms;
    }

    /**
     * Set the synonyms property: A series of synonym rules in the specified synonym map format. The rules must be
     * separated by newlines.
     *
     * @param synonyms the synonyms value to set.
     * @return the SynonymMap object itself.
     */
    public SynonymMap setSynonyms(String synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    /**
     * Get the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your data when you want full assurance that no
     * one, not even Microsoft, can decrypt your data. Once you have encrypted your data, it will always remain
     * encrypted. The search service will ignore attempts to set this property to null. You can change this property as
     * needed if you want to rotate your encryption key; Your data will be unaffected. Encryption with customer-managed
     * keys is not available for free search services, and is only available for paid services created on or after
     * January 1, 2019.
     *
     * @return the encryptionKey value.
     */
    public SearchResourceEncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your data when you want full assurance that no
     * one, not even Microsoft, can decrypt your data. Once you have encrypted your data, it will always remain
     * encrypted. The search service will ignore attempts to set this property to null. You can change this property as
     * needed if you want to rotate your encryption key; Your data will be unaffected. Encryption with customer-managed
     * keys is not available for free search services, and is only available for paid services created on or after
     * January 1, 2019.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the SynonymMap object itself.
     */
    public SynonymMap setEncryptionKey(SearchResourceEncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the synonym map.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the synonym map.
     *
     * @param eTag the eTag value to set.
     * @return the SynonymMap object itself.
     */
    public SynonymMap setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("format", this.format);
        jsonWriter.writeStringField("synonyms", this.synonyms);
        jsonWriter.writeJsonField("encryptionKey", this.encryptionKey);
        jsonWriter.writeStringField("@odata.etag", this.eTag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SynonymMap from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SynonymMap if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SynonymMap.
     */
    public static SynonymMap fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SynonymMap deserializedSynonymMap = new SynonymMap();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    deserializedSynonymMap.name = reader.getString();
                } else if ("format".equals(fieldName)) {
                    deserializedSynonymMap.format = reader.getString();
                } else if ("synonyms".equals(fieldName)) {
                    deserializedSynonymMap.synonyms = reader.getString();
                } else if ("encryptionKey".equals(fieldName)) {
                    deserializedSynonymMap.encryptionKey = SearchResourceEncryptionKey.fromJson(reader);
                } else if ("@odata.etag".equals(fieldName)) {
                    deserializedSynonymMap.eTag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedSynonymMap;
        });
    }

    /**
     * Constructor of {@link SynonymMap}.
     *
     * @param name The name of the synonym map.
     */
    public SynonymMap(String name) {
        this(name, null);
    }

    /**
     * Constructor of {@link SynonymMap}.
     *
     * @param name The name of the synonym map.
     * @param synonyms A series of synonym rules in the specified synonym map format. The rules must be separated by
     * newlines.
     */
    public SynonymMap(String name, String synonyms) {
        this.format = "solr";
        this.name = name;
        this.synonyms = synonyms;
    }

    /**
     * Creates a new instance of SynonymMap with synonyms read from the passed file.
     *
     * @param name The name of the synonym map.
     * @param filePath The path to the file where the formatted synonyms are read.
     * @return A SynonymMap.
     * @throws java.io.UncheckedIOException If reading {@code filePath} fails.
     */
    public static SynonymMap createFromFile(String name, java.nio.file.Path filePath) {
        String synonyms = com.azure.search.documents.implementation.util.Utility.readSynonymsFromFile(filePath);
        return new SynonymMap(name, synonyms);
    }
}
