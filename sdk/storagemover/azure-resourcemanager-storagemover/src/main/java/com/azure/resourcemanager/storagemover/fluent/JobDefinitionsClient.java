// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.storagemover.fluent.models.JobDefinitionInner;
import com.azure.resourcemanager.storagemover.fluent.models.JobRunResourceIdInner;
import com.azure.resourcemanager.storagemover.models.JobDefinitionUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in JobDefinitionsClient.
 */
public interface JobDefinitionsClient {
    /**
     * Lists all Job Definitions in a Project.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobDefinitionInner> list(String resourceGroupName, String storageMoverName, String projectName);

    /**
     * Lists all Job Definitions in a Project.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobDefinitionInner> list(String resourceGroupName, String storageMoverName, String projectName,
        Context context);

    /**
     * Gets a Job Definition resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job Definition resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobDefinitionInner> getWithResponse(String resourceGroupName, String storageMoverName, String projectName,
        String jobDefinitionName, Context context);

    /**
     * Gets a Job Definition resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job Definition resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobDefinitionInner get(String resourceGroupName, String storageMoverName, String projectName,
        String jobDefinitionName);

    /**
     * Creates or updates a Job Definition resource, which contains configuration for a single unit of managed data
     * transfer.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobDefinition The jobDefinition parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Job Definition resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobDefinitionInner> createOrUpdateWithResponse(String resourceGroupName, String storageMoverName,
        String projectName, String jobDefinitionName, JobDefinitionInner jobDefinition, Context context);

    /**
     * Creates or updates a Job Definition resource, which contains configuration for a single unit of managed data
     * transfer.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobDefinition The jobDefinition parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Job Definition resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobDefinitionInner createOrUpdate(String resourceGroupName, String storageMoverName, String projectName,
        String jobDefinitionName, JobDefinitionInner jobDefinition);

    /**
     * Updates properties for a Job Definition resource. Properties not specified in the request body will be unchanged.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobDefinition The jobDefinition parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Job Definition resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobDefinitionInner> updateWithResponse(String resourceGroupName, String storageMoverName,
        String projectName, String jobDefinitionName, JobDefinitionUpdateParameters jobDefinition, Context context);

    /**
     * Updates properties for a Job Definition resource. Properties not specified in the request body will be unchanged.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobDefinition The jobDefinition parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Job Definition resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobDefinitionInner update(String resourceGroupName, String storageMoverName, String projectName,
        String jobDefinitionName, JobDefinitionUpdateParameters jobDefinition);

    /**
     * Deletes a Job Definition resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String storageMoverName,
        String projectName, String jobDefinitionName);

    /**
     * Deletes a Job Definition resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String storageMoverName,
        String projectName, String jobDefinitionName, Context context);

    /**
     * Deletes a Job Definition resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName);

    /**
     * Deletes a Job Definition resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName,
        Context context);

    /**
     * Creates a new Job Run resource for the specified Job Definition and passes it to the Agent for execution.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response that identifies a Job Run along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobRunResourceIdInner> startJobWithResponse(String resourceGroupName, String storageMoverName,
        String projectName, String jobDefinitionName, Context context);

    /**
     * Creates a new Job Run resource for the specified Job Definition and passes it to the Agent for execution.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response that identifies a Job Run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobRunResourceIdInner startJob(String resourceGroupName, String storageMoverName, String projectName,
        String jobDefinitionName);

    /**
     * Requests the Agent of any active instance of this Job Definition to stop.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response that identifies a Job Run along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobRunResourceIdInner> stopJobWithResponse(String resourceGroupName, String storageMoverName,
        String projectName, String jobDefinitionName, Context context);

    /**
     * Requests the Agent of any active instance of this Job Definition to stop.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response that identifies a Job Run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobRunResourceIdInner stopJob(String resourceGroupName, String storageMoverName, String projectName,
        String jobDefinitionName);
}
