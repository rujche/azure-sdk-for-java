// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;

/**
 * The RoutesRequestRouteDirectionsBatchHeaders model.
 */
@Fluent
public final class RoutesRequestRouteDirectionsBatchHeaders {
    /*
     * The Location property.
     */
    private String location;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of RoutesRequestRouteDirectionsBatchHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public RoutesRequestRouteDirectionsBatchHeaders(HttpHeaders rawHeaders) {
        this.location = rawHeaders.getValue(HttpHeaderName.LOCATION);
    }

    /**
     * Get the location property: The Location property.
     * 
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     * 
     * @param location the location value to set.
     * @return the RoutesRequestRouteDirectionsBatchHeaders object itself.
     */
    public RoutesRequestRouteDirectionsBatchHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}
