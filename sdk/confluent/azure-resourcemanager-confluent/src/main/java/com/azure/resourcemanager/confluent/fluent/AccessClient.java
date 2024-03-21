// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.confluent.fluent.models.AccessListClusterSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListEnvironmentsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListInvitationsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListRoleBindingsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListServiceAccountsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListUsersSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessRoleBindingNameListSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.InvitationRecordInner;
import com.azure.resourcemanager.confluent.models.AccessCreateRoleBindingRequestModel;
import com.azure.resourcemanager.confluent.models.AccessInviteUserAccountModel;
import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import com.azure.resourcemanager.confluent.models.RoleBindingRecord;

/**
 * An instance of this class provides access to all the operations defined in AccessClient.
 */
public interface AccessClient {
    /**
     * Organization users details.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list users success response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessListUsersSuccessResponseInner> listUsersWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context);

    /**
     * Organization users details.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list users success response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessListUsersSuccessResponseInner listUsers(String resourceGroupName, String organizationName,
        ListAccessRequestModel body);

    /**
     * Organization service accounts details.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list service accounts success response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessListServiceAccountsSuccessResponseInner> listServiceAccountsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context);

    /**
     * Organization service accounts details.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list service accounts success response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessListServiceAccountsSuccessResponseInner listServiceAccounts(String resourceGroupName, String organizationName,
        ListAccessRequestModel body);

    /**
     * Organization accounts invitation details.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list invitations success response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessListInvitationsSuccessResponseInner> listInvitationsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context);

    /**
     * Organization accounts invitation details.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list invitations success response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessListInvitationsSuccessResponseInner listInvitations(String resourceGroupName, String organizationName,
        ListAccessRequestModel body);

    /**
     * Invite user to the organization.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body Invite user account model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return record of the invitation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InvitationRecordInner> inviteUserWithResponse(String resourceGroupName, String organizationName,
        AccessInviteUserAccountModel body, Context context);

    /**
     * Invite user to the organization.
     * 
     * @param resourceGroupName Resource group name.
     * @param organizationName Organization resource name.
     * @param body Invite user account model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return record of the invitation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InvitationRecordInner inviteUser(String resourceGroupName, String organizationName,
        AccessInviteUserAccountModel body);

    /**
     * Environment list of an organization.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the environments returned on successful response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessListEnvironmentsSuccessResponseInner> listEnvironmentsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context);

    /**
     * Environment list of an organization.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the environments returned on successful response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessListEnvironmentsSuccessResponseInner listEnvironments(String resourceGroupName, String organizationName,
        ListAccessRequestModel body);

    /**
     * Cluster details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the clusters returned on successful response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessListClusterSuccessResponseInner> listClustersWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context);

    /**
     * Cluster details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the clusters returned on successful response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessListClusterSuccessResponseInner listClusters(String resourceGroupName, String organizationName,
        ListAccessRequestModel body);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the role bindings returned on successful response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessListRoleBindingsSuccessResponseInner> listRoleBindingsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the role bindings returned on successful response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessListRoleBindingsSuccessResponseInner listRoleBindings(String resourceGroupName, String organizationName,
        ListAccessRequestModel body);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body Create role binding Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details on principal, role name and crn pattern of a role binding along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleBindingRecord> createRoleBindingWithResponse(String resourceGroupName, String organizationName,
        AccessCreateRoleBindingRequestModel body, Context context);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body Create role binding Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details on principal, role name and crn pattern of a role binding.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleBindingRecord createRoleBinding(String resourceGroupName, String organizationName,
        AccessCreateRoleBindingRequestModel body);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param roleBindingId Confluent Role binding id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteRoleBindingWithResponse(String resourceGroupName, String organizationName,
        String roleBindingId, Context context);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param roleBindingId Confluent Role binding id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteRoleBinding(String resourceGroupName, String organizationName, String roleBindingId);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the role binding names returned on successful response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessRoleBindingNameListSuccessResponseInner> listRoleBindingNameListWithResponse(
        String resourceGroupName, String organizationName, ListAccessRequestModel body, Context context);

    /**
     * Organization role bindings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Organization resource name.
     * @param body List Access Request Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the role binding names returned on successful response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessRoleBindingNameListSuccessResponseInner listRoleBindingNameList(String resourceGroupName,
        String organizationName, ListAccessRequestModel body);
}
