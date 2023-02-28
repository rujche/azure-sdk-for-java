// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an event source that reads events from an event broker in Azure. */
@Fluent
public class AzureEventSourceProperties extends EventSourceCommonProperties {
    /*
     * The resource id of the event source in Azure Resource Manager.
     */
    @JsonProperty(value = "eventSourceResourceId", required = true)
    private String eventSourceResourceId;

    /** Creates an instance of AzureEventSourceProperties class. */
    public AzureEventSourceProperties() {
    }

    /**
     * Get the eventSourceResourceId property: The resource id of the event source in Azure Resource Manager.
     *
     * @return the eventSourceResourceId value.
     */
    public String eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * Set the eventSourceResourceId property: The resource id of the event source in Azure Resource Manager.
     *
     * @param eventSourceResourceId the eventSourceResourceId value to set.
     * @return the AzureEventSourceProperties object itself.
     */
    public AzureEventSourceProperties withEventSourceResourceId(String eventSourceResourceId) {
        this.eventSourceResourceId = eventSourceResourceId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureEventSourceProperties withTimestampPropertyName(String timestampPropertyName) {
        super.withTimestampPropertyName(timestampPropertyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureEventSourceProperties withLocalTimestamp(LocalTimestamp localTimestamp) {
        super.withLocalTimestamp(localTimestamp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureEventSourceProperties withType(IngressStartAtType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureEventSourceProperties withTime(String time) {
        super.withTime(time);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (eventSourceResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property eventSourceResourceId in model AzureEventSourceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureEventSourceProperties.class);
}
