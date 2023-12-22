// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.fluent.models.ReplicationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List Replications.
 */
@Fluent
public final class ListReplications {
    /*
     * A list of replications
     */
    @JsonProperty(value = "value")
    private List<ReplicationInner> value;

    /**
     * Creates an instance of ListReplications class.
     */
    public ListReplications() {
    }

    /**
     * Get the value property: A list of replications.
     * 
     * @return the value value.
     */
    public List<ReplicationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of replications.
     * 
     * @param value the value value to set.
     * @return the ListReplications object itself.
     */
    public ListReplications withValue(List<ReplicationInner> value) {
        this.value = value;
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
