// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A content line object consisting of an adjacent sequence of content elements,
 * such as words and selection marks.
 */
@Immutable
public final class DocumentLine {
    /*
     * Concatenated content of the contained elements in reading order.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /*
     * Bounding polygon of the line, with coordinates specified relative to the
     * top-left of the page. The numbers represent the x, y values of the polygon
     * vertices, clockwise from the left (-180 degrees inclusive) relative to the
     * element orientation.
     */
    @Generated
    @JsonProperty(value = "polygon")
    private List<Double> polygon;

    /*
     * Location of the line in the reading order concatenated content.
     */
    @Generated
    @JsonProperty(value = "spans")
    private List<DocumentSpan> spans;

    /**
     * Creates an instance of DocumentLine class.
     * 
     * @param content the content value to set.
     * @param spans the spans value to set.
     */
    @Generated
    @JsonCreator
    private DocumentLine(@JsonProperty(value = "content") String content,
        @JsonProperty(value = "spans") List<DocumentSpan> spans) {
        this.content = content;
        this.spans = spans;
    }

    /**
     * Get the content property: Concatenated content of the contained elements in reading order.
     * 
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Get the polygon property: Bounding polygon of the line, with coordinates specified relative to the
     * top-left of the page. The numbers represent the x, y values of the polygon
     * vertices, clockwise from the left (-180 degrees inclusive) relative to the
     * element orientation.
     * 
     * @return the polygon value.
     */
    @Generated
    public List<Double> getPolygon() {
        return this.polygon;
    }

    /**
     * Get the spans property: Location of the line in the reading order concatenated content.
     * 
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }
}
