// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Ranking function based on the Okapi BM25 similarity algorithm. BM25 is a TF-IDF-like algorithm that includes length
 * normalization (controlled by the 'b' parameter) as well as term frequency saturation (controlled by the 'k1'
 * parameter).
 */
@Fluent
public final class BM25SimilarityAlgorithm extends SimilarityAlgorithm {
    /*
     * The @odata.type property.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.BM25Similarity";

    /*
     * This property controls the scaling function between the term frequency of each matching terms and the final
     * relevance score of a document-query pair. By default, a value of 1.2 is used. A value of 0.0 means the score
     * does not scale with an increase in term frequency.
     */
    private Double k1;

    /*
     * This property controls how the length of a document affects the relevance score. By default, a value of 0.75 is
     * used. A value of 0.0 means no length normalization is applied, while a value of 1.0 means the score is fully
     * normalized by the length of the document.
     */
    private Double b;

    /** Creates an instance of BM25SimilarityAlgorithm class. */
    public BM25SimilarityAlgorithm() {}

    /**
     * Get the k1 property: This property controls the scaling function between the term frequency of each matching
     * terms and the final relevance score of a document-query pair. By default, a value of 1.2 is used. A value of 0.0
     * means the score does not scale with an increase in term frequency.
     *
     * @return the k1 value.
     */
    public Double getK1() {
        return this.k1;
    }

    /**
     * Set the k1 property: This property controls the scaling function between the term frequency of each matching
     * terms and the final relevance score of a document-query pair. By default, a value of 1.2 is used. A value of 0.0
     * means the score does not scale with an increase in term frequency.
     *
     * @param k1 the k1 value to set.
     * @return the BM25SimilarityAlgorithm object itself.
     */
    public BM25SimilarityAlgorithm setK1(Double k1) {
        this.k1 = k1;
        return this;
    }

    /**
     * Get the b property: This property controls how the length of a document affects the relevance score. By default,
     * a value of 0.75 is used. A value of 0.0 means no length normalization is applied, while a value of 1.0 means the
     * score is fully normalized by the length of the document.
     *
     * @return the b value.
     */
    public Double getB() {
        return this.b;
    }

    /**
     * Set the b property: This property controls how the length of a document affects the relevance score. By default,
     * a value of 0.75 is used. A value of 0.0 means no length normalization is applied, while a value of 1.0 means the
     * score is fully normalized by the length of the document.
     *
     * @param b the b value to set.
     * @return the BM25SimilarityAlgorithm object itself.
     */
    public BM25SimilarityAlgorithm setB(Double b) {
        this.b = b;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeNumberField("k1", this.k1);
        jsonWriter.writeNumberField("b", this.b);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BM25SimilarityAlgorithm from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BM25SimilarityAlgorithm if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the BM25SimilarityAlgorithm.
     */
    public static BM25SimilarityAlgorithm fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    Double k1 = null;
                    Double b = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("k1".equals(fieldName)) {
                            k1 = reader.getNullable(JsonReader::getDouble);
                        } else if ("b".equals(fieldName)) {
                            b = reader.getNullable(JsonReader::getDouble);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    BM25SimilarityAlgorithm deserializedValue = new BM25SimilarityAlgorithm();
                    deserializedValue.k1 = k1;
                    deserializedValue.b = b;

                    return deserializedValue;
                });
    }
}
