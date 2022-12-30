// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for FrontendIpAddressVersion. */
public enum FrontendIpAddressVersion {
    /** Enum value IPv4. */
    IPV4("IPv4"),

    /** Enum value IPv6. */
    IPV6("IPv6");

    /** The actual serialized value for a FrontendIpAddressVersion instance. */
    private final String value;

    FrontendIpAddressVersion(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FrontendIpAddressVersion instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FrontendIpAddressVersion object, or null if unable to parse.
     */
    @JsonCreator
    public static FrontendIpAddressVersion fromString(String value) {
        if (value == null) {
            return null;
        }
        FrontendIpAddressVersion[] items = FrontendIpAddressVersion.values();
        for (FrontendIpAddressVersion item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
