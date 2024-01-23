// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ActiveDirectoryAdministratorInner;

/**
 * An immutable client-side representation of ActiveDirectoryAdministrator.
 */
public interface ActiveDirectoryAdministrator {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the principalType property: The principal type used to represent the type of Active Directory Administrator.
     * 
     * @return the principalType value.
     */
    PrincipalType principalType();

    /**
     * Gets the principalName property: Active Directory administrator principal name.
     * 
     * @return the principalName value.
     */
    String principalName();

    /**
     * Gets the objectId property: The objectId of the Active Directory administrator.
     * 
     * @return the objectId value.
     */
    String objectId();

    /**
     * Gets the tenantId property: The tenantId of the Active Directory administrator.
     * 
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ActiveDirectoryAdministratorInner
     * object.
     * 
     * @return the inner object.
     */
    ActiveDirectoryAdministratorInner innerModel();

    /**
     * The entirety of the ActiveDirectoryAdministrator definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ActiveDirectoryAdministrator definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ActiveDirectoryAdministrator definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ActiveDirectoryAdministrator definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingFlexibleServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the ActiveDirectoryAdministrator definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPrincipalType, DefinitionStages.WithPrincipalName,
            DefinitionStages.WithTenantId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ActiveDirectoryAdministrator create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ActiveDirectoryAdministrator create(Context context);
        }

        /**
         * The stage of the ActiveDirectoryAdministrator definition allowing to specify principalType.
         */
        interface WithPrincipalType {
            /**
             * Specifies the principalType property: The principal type used to represent the type of Active Directory
             * Administrator..
             * 
             * @param principalType The principal type used to represent the type of Active Directory Administrator.
             * @return the next definition stage.
             */
            WithCreate withPrincipalType(PrincipalType principalType);
        }

        /**
         * The stage of the ActiveDirectoryAdministrator definition allowing to specify principalName.
         */
        interface WithPrincipalName {
            /**
             * Specifies the principalName property: Active Directory administrator principal name..
             * 
             * @param principalName Active Directory administrator principal name.
             * @return the next definition stage.
             */
            WithCreate withPrincipalName(String principalName);
        }

        /**
         * The stage of the ActiveDirectoryAdministrator definition allowing to specify tenantId.
         */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: The tenantId of the Active Directory administrator..
             * 
             * @param tenantId The tenantId of the Active Directory administrator.
             * @return the next definition stage.
             */
            WithCreate withTenantId(String tenantId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ActiveDirectoryAdministrator refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ActiveDirectoryAdministrator refresh(Context context);
}
