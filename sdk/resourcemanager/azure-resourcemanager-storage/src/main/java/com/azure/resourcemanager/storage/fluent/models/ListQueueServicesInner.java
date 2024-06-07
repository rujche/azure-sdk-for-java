// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The ListQueueServices model.
 */
@Immutable
public final class ListQueueServicesInner {
    /*
     * List of queue services returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<QueueServicePropertiesInner> value;

    /**
     * Creates an instance of ListQueueServicesInner class.
     */
    public ListQueueServicesInner() {
    }

    /**
     * Get the value property: List of queue services returned.
     *
     * @return the value value.
     */
    public List<QueueServicePropertiesInner> value() {
        return this.value;
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
