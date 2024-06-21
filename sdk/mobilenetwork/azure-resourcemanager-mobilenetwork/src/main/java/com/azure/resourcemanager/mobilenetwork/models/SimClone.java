// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SIMs to clone.
 */
@Fluent
public final class SimClone {
    /*
     * The SIM Group where the SIMs should be cloned.
     */
    @JsonProperty(value = "targetSimGroupId")
    private SimGroupResourceId targetSimGroupId;

    /*
     * A list of SIM resource names to be cloned.
     */
    @JsonProperty(value = "sims")
    private List<String> sims;

    /**
     * Creates an instance of SimClone class.
     */
    public SimClone() {
    }

    /**
     * Get the targetSimGroupId property: The SIM Group where the SIMs should be cloned.
     * 
     * @return the targetSimGroupId value.
     */
    public SimGroupResourceId targetSimGroupId() {
        return this.targetSimGroupId;
    }

    /**
     * Set the targetSimGroupId property: The SIM Group where the SIMs should be cloned.
     * 
     * @param targetSimGroupId the targetSimGroupId value to set.
     * @return the SimClone object itself.
     */
    public SimClone withTargetSimGroupId(SimGroupResourceId targetSimGroupId) {
        this.targetSimGroupId = targetSimGroupId;
        return this;
    }

    /**
     * Get the sims property: A list of SIM resource names to be cloned.
     * 
     * @return the sims value.
     */
    public List<String> sims() {
        return this.sims;
    }

    /**
     * Set the sims property: A list of SIM resource names to be cloned.
     * 
     * @param sims the sims value to set.
     * @return the SimClone object itself.
     */
    public SimClone withSims(List<String> sims) {
        this.sims = sims;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetSimGroupId() != null) {
            targetSimGroupId().validate();
        }
    }
}
