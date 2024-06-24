// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

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
import com.azure.resourcemanager.selfhelp.fluent.DiscoverySolutionNlpsClient;
import com.azure.resourcemanager.selfhelp.fluent.models.DiscoveryNlpResponseInner;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DiscoverySolutionNlpsClient.
 */
public final class DiscoverySolutionNlpsClientImpl implements DiscoverySolutionNlpsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DiscoverySolutionNlpsService service;

    /**
     * The service client containing this operation class.
     */
    private final HelpRPImpl client;

    /**
     * Initializes an instance of DiscoverySolutionNlpsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DiscoverySolutionNlpsClientImpl(HelpRPImpl client) {
        this.service = RestProxy.create(DiscoverySolutionNlpsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HelpRPDiscoverySolutionNlps to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "HelpRPDiscoverySolut")
    public interface DiscoverySolutionNlpsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.Help/discoverSolutions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveryNlpResponseInner>> discoverSolutions(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DiscoveryNlpRequest discoverSolutionRequest,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Help/discoverSolutions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveryNlpResponseInner>> discoverSolutionsBySubscription(@HostParam("$host") String endpoint,
            @PathParam(value = "subscriptionId", encoded = true) String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DiscoveryNlpRequest discoverSolutionRequest,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary.
     * 
     * @param discoverSolutionRequest Request body for discovering solutions using NLP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiscoveryNlpResponseInner>>
        discoverSolutionsWithResponseAsync(DiscoveryNlpRequest discoverSolutionRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (discoverSolutionRequest != null) {
            discoverSolutionRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.discoverSolutions(this.client.getEndpoint(), this.client.getApiVersion(),
                discoverSolutionRequest, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary.
     * 
     * @param discoverSolutionRequest Request body for discovering solutions using NLP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiscoveryNlpResponseInner>>
        discoverSolutionsWithResponseAsync(DiscoveryNlpRequest discoverSolutionRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (discoverSolutionRequest != null) {
            discoverSolutionRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.discoverSolutions(this.client.getEndpoint(), this.client.getApiVersion(),
            discoverSolutionRequest, accept, context);
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DiscoveryNlpResponseInner> discoverSolutionsAsync() {
        final DiscoveryNlpRequest discoverSolutionRequest = null;
        return discoverSolutionsWithResponseAsync(discoverSolutionRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary.
     * 
     * @param discoverSolutionRequest Request body for discovering solutions using NLP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiscoveryNlpResponseInner>
        discoverSolutionsWithResponse(DiscoveryNlpRequest discoverSolutionRequest, Context context) {
        return discoverSolutionsWithResponseAsync(discoverSolutionRequest, context).block();
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiscoveryNlpResponseInner discoverSolutions() {
        final DiscoveryNlpRequest discoverSolutionRequest = null;
        return discoverSolutionsWithResponse(discoverSolutionRequest, Context.NONE).getValue();
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary and
     * subscription.
     * 
     * @param subscriptionId The Azure subscription ID.
     * @param discoverSolutionRequest Request body for discovering solutions using NLP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiscoveryNlpResponseInner>> discoverSolutionsBySubscriptionWithResponseAsync(
        String subscriptionId, DiscoveryNlpRequest discoverSolutionRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (discoverSolutionRequest != null) {
            discoverSolutionRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.discoverSolutionsBySubscription(this.client.getEndpoint(), subscriptionId,
                this.client.getApiVersion(), discoverSolutionRequest, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary and
     * subscription.
     * 
     * @param subscriptionId The Azure subscription ID.
     * @param discoverSolutionRequest Request body for discovering solutions using NLP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiscoveryNlpResponseInner>> discoverSolutionsBySubscriptionWithResponseAsync(
        String subscriptionId, DiscoveryNlpRequest discoverSolutionRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (discoverSolutionRequest != null) {
            discoverSolutionRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.discoverSolutionsBySubscription(this.client.getEndpoint(), subscriptionId,
            this.client.getApiVersion(), discoverSolutionRequest, accept, context);
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary and
     * subscription.
     * 
     * @param subscriptionId The Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DiscoveryNlpResponseInner> discoverSolutionsBySubscriptionAsync(String subscriptionId) {
        final DiscoveryNlpRequest discoverSolutionRequest = null;
        return discoverSolutionsBySubscriptionWithResponseAsync(subscriptionId, discoverSolutionRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary and
     * subscription.
     * 
     * @param subscriptionId The Azure subscription ID.
     * @param discoverSolutionRequest Request body for discovering solutions using NLP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiscoveryNlpResponseInner> discoverSolutionsBySubscriptionWithResponse(String subscriptionId,
        DiscoveryNlpRequest discoverSolutionRequest, Context context) {
        return discoverSolutionsBySubscriptionWithResponseAsync(subscriptionId, discoverSolutionRequest, context)
            .block();
    }

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary and
     * subscription.
     * 
     * @param subscriptionId The Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiscoveryNlpResponseInner discoverSolutionsBySubscription(String subscriptionId) {
        final DiscoveryNlpRequest discoverSolutionRequest = null;
        return discoverSolutionsBySubscriptionWithResponse(subscriptionId, discoverSolutionRequest, Context.NONE)
            .getValue();
    }
}
