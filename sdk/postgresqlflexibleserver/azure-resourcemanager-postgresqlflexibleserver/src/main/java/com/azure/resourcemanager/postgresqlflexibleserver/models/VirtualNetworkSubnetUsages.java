// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of VirtualNetworkSubnetUsages.
 */
public interface VirtualNetworkSubnetUsages {
    /**
     * Get virtual network subnet usage for a given vNet resource id.
     * 
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id along with {@link Response}.
     */
    Response<VirtualNetworkSubnetUsageResult> executeWithResponse(String locationName,
        VirtualNetworkSubnetUsageParameter parameters, Context context);

    /**
     * Get virtual network subnet usage for a given vNet resource id.
     * 
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id.
     */
    VirtualNetworkSubnetUsageResult execute(String locationName, VirtualNetworkSubnetUsageParameter parameters);
}
