// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SIMs to delete.
 */
@Fluent
public final class SimDeleteList {
    /*
     * A list of SIM resource names to delete.
     */
    @JsonProperty(value = "sims", required = true)
    private List<String> sims;

    /**
     * Creates an instance of SimDeleteList class.
     */
    public SimDeleteList() {
    }

    /**
     * Get the sims property: A list of SIM resource names to delete.
     * 
     * @return the sims value.
     */
    public List<String> sims() {
        return this.sims;
    }

    /**
     * Set the sims property: A list of SIM resource names to delete.
     * 
     * @param sims the sims value to set.
     * @return the SimDeleteList object itself.
     */
    public SimDeleteList withSims(List<String> sims) {
        this.sims = sims;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sims() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sims in model SimDeleteList"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SimDeleteList.class);
}
