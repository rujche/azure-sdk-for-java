// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The default authentication provider to use when multiple providers are configured.
 * This setting is only needed if multiple providers are configured and the unauthenticated client
 * action is set to "RedirectToLoginPage".
 */
public enum BuiltInAuthenticationProvider {
    /**
     * Enum value AzureActiveDirectory.
     */
    AZURE_ACTIVE_DIRECTORY("AzureActiveDirectory"),

    /**
     * Enum value Facebook.
     */
    FACEBOOK("Facebook"),

    /**
     * Enum value Google.
     */
    GOOGLE("Google"),

    /**
     * Enum value MicrosoftAccount.
     */
    MICROSOFT_ACCOUNT("MicrosoftAccount"),

    /**
     * Enum value Twitter.
     */
    TWITTER("Twitter"),

    /**
     * Enum value Github.
     */
    GITHUB("Github");

    /**
     * The actual serialized value for a BuiltInAuthenticationProvider instance.
     */
    private final String value;

    BuiltInAuthenticationProvider(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BuiltInAuthenticationProvider instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed BuiltInAuthenticationProvider object, or null if unable to parse.
     */
    @JsonCreator
    public static BuiltInAuthenticationProvider fromString(String value) {
        if (value == null) {
            return null;
        }
        BuiltInAuthenticationProvider[] items = BuiltInAuthenticationProvider.values();
        for (BuiltInAuthenticationProvider item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
