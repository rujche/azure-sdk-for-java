// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Web App stack minor version.
 */
@Immutable
public final class WebAppMinorVersion {
    /*
     * Web App stack minor version (display only).
     */
    @JsonProperty(value = "displayText", access = JsonProperty.Access.WRITE_ONLY)
    private String displayText;

    /*
     * Web App stack major version name.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * Settings associated with the minor version.
     */
    @JsonProperty(value = "stackSettings", access = JsonProperty.Access.WRITE_ONLY)
    private WebAppRuntimes stackSettings;

    /**
     * Creates an instance of WebAppMinorVersion class.
     */
    public WebAppMinorVersion() {
    }

    /**
     * Get the displayText property: Web App stack minor version (display only).
     * 
     * @return the displayText value.
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Get the value property: Web App stack major version name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the stackSettings property: Settings associated with the minor version.
     * 
     * @return the stackSettings value.
     */
    public WebAppRuntimes stackSettings() {
        return this.stackSettings;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stackSettings() != null) {
            stackSettings().validate();
        }
    }
}
