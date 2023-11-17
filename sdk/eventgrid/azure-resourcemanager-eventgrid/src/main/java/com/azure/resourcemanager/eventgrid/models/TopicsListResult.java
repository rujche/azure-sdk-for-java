// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the List Topics operation.
 */
@Fluent
public final class TopicsListResult {
    /*
     * A collection of Topics
     */
    @JsonProperty(value = "value")
    private List<TopicInner> value;

    /*
     * A link for the next page of topics
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of TopicsListResult class.
     */
    public TopicsListResult() {
    }

    /**
     * Get the value property: A collection of Topics.
     * 
     * @return the value value.
     */
    public List<TopicInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Topics.
     * 
     * @param value the value value to set.
     * @return the TopicsListResult object itself.
     */
    public TopicsListResult withValue(List<TopicInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of topics.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of topics.
     * 
     * @param nextLink the nextLink value to set.
     * @return the TopicsListResult object itself.
     */
    public TopicsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
