// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.resourcemanager.deviceupdate.fluent.models.CheckNameAvailabilityResponseInner;

/**
 * An immutable client-side representation of CheckNameAvailabilityResponse.
 */
public interface CheckNameAvailabilityResponse {
    /**
     * Gets the nameAvailable property: Indicates if the resource name is available.
     * 
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason why the given name is not available.
     * 
     * @return the reason value.
     */
    CheckNameAvailabilityReason reason();

    /**
     * Gets the message property: Detailed reason why the given name is available.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.deviceupdate.fluent.models.CheckNameAvailabilityResponseInner object.
     * 
     * @return the inner object.
     */
    CheckNameAvailabilityResponseInner innerModel();
}
