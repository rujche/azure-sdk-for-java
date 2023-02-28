// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.voiceservices.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.voiceservices.models.CheckNameAvailabilityRequest;

/** An instance of this class provides access to all the operations defined in NameAvailabilitiesClient. */
public interface NameAvailabilitiesClient {
    /**
     * Check whether the resource name is available in the given region.
     *
     * @param location The location in which uniqueness will be verified.
     * @param body The check availability request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseInner> checkLocalWithResponse(
        String location, CheckNameAvailabilityRequest body, Context context);

    /**
     * Check whether the resource name is available in the given region.
     *
     * @param location The location in which uniqueness will be verified.
     * @param body The check availability request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseInner checkLocal(String location, CheckNameAvailabilityRequest body);
}
