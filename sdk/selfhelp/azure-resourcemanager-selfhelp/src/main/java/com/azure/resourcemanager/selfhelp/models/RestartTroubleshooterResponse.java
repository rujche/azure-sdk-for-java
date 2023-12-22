// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.resourcemanager.selfhelp.fluent.models.RestartTroubleshooterResponseInner;

/**
 * An immutable client-side representation of RestartTroubleshooterResponse.
 */
public interface RestartTroubleshooterResponse {
    /**
     * Gets the troubleshooterResourceName property: Updated TroubleshooterResource Name .
     * 
     * @return the troubleshooterResourceName value.
     */
    String troubleshooterResourceName();

    /**
     * Gets the inner com.azure.resourcemanager.selfhelp.fluent.models.RestartTroubleshooterResponseInner object.
     * 
     * @return the inner object.
     */
    RestartTroubleshooterResponseInner innerModel();
}
