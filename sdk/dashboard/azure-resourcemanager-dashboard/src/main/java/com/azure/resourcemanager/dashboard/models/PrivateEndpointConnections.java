// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of PrivateEndpointConnections.
 */
public interface PrivateEndpointConnections {
    /**
     * Get private endpoint connections.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The workspace name of Azure Managed Grafana.
     * @param privateEndpointConnectionName The private endpoint connection name of Azure Managed Grafana.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connections along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getWithResponse(String resourceGroupName, String workspaceName,
        String privateEndpointConnectionName, Context context);

    /**
     * Get private endpoint connections.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The workspace name of Azure Managed Grafana.
     * @param privateEndpointConnectionName The private endpoint connection name of Azure Managed Grafana.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connections.
     */
    PrivateEndpointConnection get(String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Delete private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The workspace name of Azure Managed Grafana.
     * @param privateEndpointConnectionName The private endpoint connection name of Azure Managed Grafana.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Delete private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The workspace name of Azure Managed Grafana.
     * @param privateEndpointConnectionName The private endpoint connection name of Azure Managed Grafana.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context);

    /**
     * Get private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The workspace name of Azure Managed Grafana.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String workspaceName);

    /**
     * Get private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The workspace name of Azure Managed Grafana.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Get private endpoint connections.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connections along with {@link Response}.
     */
    PrivateEndpointConnection getById(String id);

    /**
     * Get private endpoint connections.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connections along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context);

    /**
     * Delete private endpoint connection.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete private endpoint connection.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PrivateEndpointConnection resource.
     * 
     * @param name resource name.
     * @return the first stage of the new PrivateEndpointConnection definition.
     */
    PrivateEndpointConnection.DefinitionStages.Blank define(String name);
}
