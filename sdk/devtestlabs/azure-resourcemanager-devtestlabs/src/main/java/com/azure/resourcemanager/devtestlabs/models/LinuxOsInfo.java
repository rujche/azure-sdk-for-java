// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a Linux OS. */
@Fluent
public final class LinuxOsInfo {
    /*
     * The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
     */
    @JsonProperty(value = "linuxOsState")
    private LinuxOsState linuxOsState;

    /** Creates an instance of LinuxOsInfo class. */
    public LinuxOsInfo() {
    }

    /**
     * Get the linuxOsState property: The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested,
     * DeprovisionApplied).
     *
     * @return the linuxOsState value.
     */
    public LinuxOsState linuxOsState() {
        return this.linuxOsState;
    }

    /**
     * Set the linuxOsState property: The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested,
     * DeprovisionApplied).
     *
     * @param linuxOsState the linuxOsState value to set.
     * @return the LinuxOsInfo object itself.
     */
    public LinuxOsInfo withLinuxOsState(LinuxOsState linuxOsState) {
        this.linuxOsState = linuxOsState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
