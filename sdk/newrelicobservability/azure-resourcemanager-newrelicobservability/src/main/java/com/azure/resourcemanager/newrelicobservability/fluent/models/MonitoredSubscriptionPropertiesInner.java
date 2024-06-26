// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.newrelicobservability.models.SubscriptionList;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The request to update subscriptions needed to be monitored by the NewRelic monitor resource.
 */
@Fluent
public final class MonitoredSubscriptionPropertiesInner extends ProxyResource {
    /*
     * The request to update subscriptions needed to be monitored by the NewRelic monitor resource.
     */
    @JsonProperty(value = "properties")
    private SubscriptionList properties;

    /**
     * Creates an instance of MonitoredSubscriptionPropertiesInner class.
     */
    public MonitoredSubscriptionPropertiesInner() {
    }

    /**
     * Get the properties property: The request to update subscriptions needed to be monitored by the NewRelic monitor
     * resource.
     * 
     * @return the properties value.
     */
    public SubscriptionList properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The request to update subscriptions needed to be monitored by the NewRelic monitor
     * resource.
     * 
     * @param properties the properties value to set.
     * @return the MonitoredSubscriptionPropertiesInner object itself.
     */
    public MonitoredSubscriptionPropertiesInner withProperties(SubscriptionList properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
