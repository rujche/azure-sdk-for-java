// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storagemover.fluent.models.StorageMoverInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of Storage Movers.
 */
@Immutable
public final class StorageMoverList {
    /*
     * The value property.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageMoverInner> value;

    /*
     * Request URL that can be used to query next page of containers. Returned when total number of requested containers
     * exceed maximum page size.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of StorageMoverList class.
     */
    public StorageMoverList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<StorageMoverInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of containers. Returned when total
     * number of requested containers exceed maximum page size.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
