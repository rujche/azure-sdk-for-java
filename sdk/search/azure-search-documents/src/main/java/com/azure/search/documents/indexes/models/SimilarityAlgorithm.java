// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base type for similarity algorithms. Similarity algorithms are used to calculate scores that tie queries to
 * documents. The higher the score, the more relevant the document is to that specific query. Those scores are used to
 * rank the search results.
 */
@Immutable
public abstract class SimilarityAlgorithm implements JsonSerializable<SimilarityAlgorithm> {
    /** Creates an instance of SimilarityAlgorithm class. */
    public SimilarityAlgorithm() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SimilarityAlgorithm from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SimilarityAlgorithm if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the SimilarityAlgorithm.
     */
    public static SimilarityAlgorithm fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    String discriminatorValue = null;
                    JsonReader readerToUse = null;

                    // Read the first field name and determine if it's the discriminator field.
                    reader.nextToken();
                    if ("@odata.type".equals(reader.getFieldName())) {
                        reader.nextToken();
                        discriminatorValue = reader.getString();
                        readerToUse = reader;
                    } else {
                        // If it isn't the discriminator field buffer the JSON to make it replayable and find the
                        // discriminator field value.
                        JsonReader replayReader = reader.bufferObject();
                        replayReader.nextToken(); // Prepare for reading
                        while (replayReader.nextToken() != JsonToken.END_OBJECT) {
                            String fieldName = replayReader.getFieldName();
                            replayReader.nextToken();
                            if ("@odata.type".equals(fieldName)) {
                                discriminatorValue = replayReader.getString();
                                break;
                            } else {
                                replayReader.skipChildren();
                            }
                        }

                        if (discriminatorValue != null) {
                            readerToUse = replayReader.reset();
                        }
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("#Microsoft.Azure.Search.ClassicSimilarity".equals(discriminatorValue)) {
                        return ClassicSimilarityAlgorithm.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.BM25Similarity".equals(discriminatorValue)) {
                        return BM25SimilarityAlgorithm.fromJson(readerToUse);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Azure.Search.ClassicSimilarity', or '#Microsoft.Azure.Search.BM25Similarity'. It was: '"
                                        + discriminatorValue
                                        + "'.");
                    }
                });
    }
}
