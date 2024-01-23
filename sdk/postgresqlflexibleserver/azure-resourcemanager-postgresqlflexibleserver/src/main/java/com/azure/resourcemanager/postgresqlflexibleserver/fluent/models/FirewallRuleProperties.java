// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a server firewall rule.
 */
@Fluent
public final class FirewallRuleProperties {
    /*
     * The start IP address of the server firewall rule. Must be IPv4 format.
     */
    @JsonProperty(value = "startIpAddress", required = true)
    private String startIpAddress;

    /*
     * The end IP address of the server firewall rule. Must be IPv4 format.
     */
    @JsonProperty(value = "endIpAddress", required = true)
    private String endIpAddress;

    /**
     * Creates an instance of FirewallRuleProperties class.
     */
    public FirewallRuleProperties() {
    }

    /**
     * Get the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @param startIpAddress the startIpAddress value to set.
     * @return the FirewallRuleProperties object itself.
     */
    public FirewallRuleProperties withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @param endIpAddress the endIpAddress value to set.
     * @return the FirewallRuleProperties object itself.
     */
    public FirewallRuleProperties withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startIpAddress() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property startIpAddress in model FirewallRuleProperties"));
        }
        if (endIpAddress() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property endIpAddress in model FirewallRuleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FirewallRuleProperties.class);
}
