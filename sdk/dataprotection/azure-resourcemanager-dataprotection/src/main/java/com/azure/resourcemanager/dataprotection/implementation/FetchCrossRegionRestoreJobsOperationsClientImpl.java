// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.dataprotection.fluent.FetchCrossRegionRestoreJobsOperationsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupJobResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupJobResourceList;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreJobsRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * FetchCrossRegionRestoreJobsOperationsClient.
 */
public final class FetchCrossRegionRestoreJobsOperationsClientImpl
    implements FetchCrossRegionRestoreJobsOperationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FetchCrossRegionRestoreJobsOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final DataProtectionClientImpl client;

    /**
     * Initializes an instance of FetchCrossRegionRestoreJobsOperationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    FetchCrossRegionRestoreJobsOperationsClientImpl(DataProtectionClientImpl client) {
        this.service = RestProxy.create(FetchCrossRegionRestoreJobsOperationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataProtectionClientFetchCrossRegionRestoreJobsOperations to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataProtectionClient")
    public interface FetchCrossRegionRestoreJobsOperationsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataProtection/locations/{location}/fetchCrossRegionRestoreJobs")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AzureBackupJobResourceList>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("location") String location,
            @QueryParam("$filter") String filter,
            @BodyParam("application/json") CrossRegionRestoreJobsRequest parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AzureBackupJobResourceList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Fetches list of Cross Region Restore job belonging to the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of the Azure region.
     * @param parameters Request body for operation.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureBackupJobResourceInner>> listSinglePageAsync(String resourceGroupName,
        String location, CrossRegionRestoreJobsRequest parameters, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(),
                resourceGroupName, this.client.getSubscriptionId(), location, filter, parameters, accept, context))
            .<PagedResponse<AzureBackupJobResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Fetches list of Cross Region Restore job belonging to the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of the Azure region.
     * @param parameters Request body for operation.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureBackupJobResourceInner>> listSinglePageAsync(String resourceGroupName,
        String location, CrossRegionRestoreJobsRequest parameters, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), resourceGroupName,
                this.client.getSubscriptionId(), location, filter, parameters, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Fetches list of Cross Region Restore job belonging to the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of the Azure region.
     * @param parameters Request body for operation.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AzureBackupJobResourceInner> listAsync(String resourceGroupName, String location,
        CrossRegionRestoreJobsRequest parameters, String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, location, parameters, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Fetches list of Cross Region Restore job belonging to the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of the Azure region.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AzureBackupJobResourceInner> listAsync(String resourceGroupName, String location,
        CrossRegionRestoreJobsRequest parameters) {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, location, parameters, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Fetches list of Cross Region Restore job belonging to the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of the Azure region.
     * @param parameters Request body for operation.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AzureBackupJobResourceInner> listAsync(String resourceGroupName, String location,
        CrossRegionRestoreJobsRequest parameters, String filter, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, location, parameters, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Fetches list of Cross Region Restore job belonging to the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of the Azure region.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AzureBackupJobResourceInner> list(String resourceGroupName, String location,
        CrossRegionRestoreJobsRequest parameters) {
        final String filter = null;
        return new PagedIterable<>(listAsync(resourceGroupName, location, parameters, filter));
    }

    /**
     * Fetches list of Cross Region Restore job belonging to the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of the Azure region.
     * @param parameters Request body for operation.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AzureBackupJobResourceInner> list(String resourceGroupName, String location,
        CrossRegionRestoreJobsRequest parameters, String filter, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, location, parameters, filter, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureBackupJobResourceInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AzureBackupJobResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureBackupJobResourceInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
