// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.scvmm.fluent.models.CloudInner;
import com.azure.resourcemanager.scvmm.models.CloudTagsUpdate;
import com.azure.resourcemanager.scvmm.models.ForceDelete;

/**
 * An instance of this class provides access to all the operations defined in CloudsClient.
 */
public interface CloudsClient {
    /**
     * Implements GET Clouds in a subscription.
     * 
     * List of Clouds in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Cloud list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> list();

    /**
     * Implements GET Clouds in a subscription.
     * 
     * List of Clouds in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Cloud list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> list(Context context);

    /**
     * Implements GET Clouds in a resource group.
     * 
     * List of Clouds in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Cloud list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> listByResourceGroup(String resourceGroupName);

    /**
     * Implements GET Clouds in a resource group.
     * 
     * List of Clouds in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Cloud list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a Cloud.
     * 
     * Implements Cloud GET method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudInner> getByResourceGroupWithResponse(String resourceGroupName, String cloudResourceName,
        Context context);

    /**
     * Gets a Cloud.
     * 
     * Implements Cloud GET method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner getByResourceGroup(String resourceGroupName, String cloudResourceName);

    /**
     * Implements Clouds PUT method.
     * 
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginCreateOrUpdate(String resourceGroupName,
        String cloudResourceName, CloudInner resource);

    /**
     * Implements Clouds PUT method.
     * 
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginCreateOrUpdate(String resourceGroupName,
        String cloudResourceName, CloudInner resource, Context context);

    /**
     * Implements Clouds PUT method.
     * 
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner createOrUpdate(String resourceGroupName, String cloudResourceName, CloudInner resource);

    /**
     * Implements Clouds PUT method.
     * 
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner createOrUpdate(String resourceGroupName, String cloudResourceName, CloudInner resource, Context context);

    /**
     * Implements the Clouds PATCH method.
     * 
     * Updates the Clouds resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginUpdate(String resourceGroupName, String cloudResourceName,
        CloudTagsUpdate properties);

    /**
     * Implements the Clouds PATCH method.
     * 
     * Updates the Clouds resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginUpdate(String resourceGroupName, String cloudResourceName,
        CloudTagsUpdate properties, Context context);

    /**
     * Implements the Clouds PATCH method.
     * 
     * Updates the Clouds resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner update(String resourceGroupName, String cloudResourceName, CloudTagsUpdate properties);

    /**
     * Implements the Clouds PATCH method.
     * 
     * Updates the Clouds resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner update(String resourceGroupName, String cloudResourceName, CloudTagsUpdate properties, Context context);

    /**
     * Implements Cloud resource DELETE method.
     * 
     * Deregisters the ScVmm fabric cloud from Azure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudResourceName);

    /**
     * Implements Cloud resource DELETE method.
     * 
     * Deregisters the ScVmm fabric cloud from Azure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param force Forces the resource to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudResourceName,
        ForceDelete force, Context context);

    /**
     * Implements Cloud resource DELETE method.
     * 
     * Deregisters the ScVmm fabric cloud from Azure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudResourceName);

    /**
     * Implements Cloud resource DELETE method.
     * 
     * Deregisters the ScVmm fabric cloud from Azure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudResourceName Name of the Cloud.
     * @param force Forces the resource to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudResourceName, ForceDelete force, Context context);
}
