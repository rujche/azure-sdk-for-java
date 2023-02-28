// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/**
 * The warm store configuration provides the details to create a warm store cache that will retain a copy of the
 * environment's data available for faster query.
 */
@Fluent
public final class WarmStoreConfigurationProperties {
    /*
     * ISO8601 timespan specifying the number of days the environment's events will be available for query from the
     * warm store.
     */
    @JsonProperty(value = "dataRetention", required = true)
    private Duration dataRetention;

    /** Creates an instance of WarmStoreConfigurationProperties class. */
    public WarmStoreConfigurationProperties() {
    }

    /**
     * Get the dataRetention property: ISO8601 timespan specifying the number of days the environment's events will be
     * available for query from the warm store.
     *
     * @return the dataRetention value.
     */
    public Duration dataRetention() {
        return this.dataRetention;
    }

    /**
     * Set the dataRetention property: ISO8601 timespan specifying the number of days the environment's events will be
     * available for query from the warm store.
     *
     * @param dataRetention the dataRetention value to set.
     * @return the WarmStoreConfigurationProperties object itself.
     */
    public WarmStoreConfigurationProperties withDataRetention(Duration dataRetention) {
        this.dataRetention = dataRetention;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataRetention() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataRetention in model WarmStoreConfigurationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WarmStoreConfigurationProperties.class);
}
