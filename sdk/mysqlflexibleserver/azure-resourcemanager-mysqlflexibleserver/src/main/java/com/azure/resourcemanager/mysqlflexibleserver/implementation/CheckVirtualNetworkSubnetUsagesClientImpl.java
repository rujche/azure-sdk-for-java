// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.CheckVirtualNetworkSubnetUsagesClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.VirtualNetworkSubnetUsageResultInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.VirtualNetworkSubnetUsageParameter;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CheckVirtualNetworkSubnetUsagesClient. */
public final class CheckVirtualNetworkSubnetUsagesClientImpl implements CheckVirtualNetworkSubnetUsagesClient {
    /** The proxy service used to perform REST calls. */
    private final CheckVirtualNetworkSubnetUsagesService service;

    /** The service client containing this operation class. */
    private final MySqlManagementClientImpl client;

    /**
     * Initializes an instance of CheckVirtualNetworkSubnetUsagesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CheckVirtualNetworkSubnetUsagesClientImpl(MySqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    CheckVirtualNetworkSubnetUsagesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MySqlManagementClientCheckVirtualNetworkSubnetUsages to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MySqlManagementClien")
    public interface CheckVirtualNetworkSubnetUsagesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DBforMySQL/locations/{locationName}"
                + "/checkVirtualNetworkSubnetUsage")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VirtualNetworkSubnetUsageResultInner>> execute(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationName") String locationName,
            @BodyParam("application/json") VirtualNetworkSubnetUsageParameter parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get virtual network subnet usage for a given vNet resource id.
     *
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualNetworkSubnetUsageResultInner>> executeWithResponseAsync(
        String locationName, VirtualNetworkSubnetUsageParameter parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .execute(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            locationName,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get virtual network subnet usage for a given vNet resource id.
     *
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualNetworkSubnetUsageResultInner>> executeWithResponseAsync(
        String locationName, VirtualNetworkSubnetUsageParameter parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .execute(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                locationName,
                parameters,
                accept,
                context);
    }

    /**
     * Get virtual network subnet usage for a given vNet resource id.
     *
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VirtualNetworkSubnetUsageResultInner> executeAsync(
        String locationName, VirtualNetworkSubnetUsageParameter parameters) {
        return executeWithResponseAsync(locationName, parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get virtual network subnet usage for a given vNet resource id.
     *
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VirtualNetworkSubnetUsageResultInner> executeWithResponse(
        String locationName, VirtualNetworkSubnetUsageParameter parameters, Context context) {
        return executeWithResponseAsync(locationName, parameters, context).block();
    }

    /**
     * Get virtual network subnet usage for a given vNet resource id.
     *
     * @param locationName The name of the location.
     * @param parameters The required parameters for creating or updating a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network subnet usage for a given vNet resource id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkSubnetUsageResultInner execute(
        String locationName, VirtualNetworkSubnetUsageParameter parameters) {
        return executeWithResponse(locationName, parameters, Context.NONE).getValue();
    }
}
