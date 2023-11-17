// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ServerThreatProtectionSettingsModelInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of ServerThreatProtectionSettingsModel. */
public interface ServerThreatProtectionSettingsModel {
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
     * Gets the state property: Specifies the state of the Threat Protection, whether it is enabled or disabled or a
     * state has not been applied yet on the specific server.
     *
     * @return the state value.
     */
    ThreatProtectionState state();

    /**
     * Gets the creationTime property: Specifies the UTC creation time of the policy.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner
     * com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ServerThreatProtectionSettingsModelInner object.
     *
     * @return the inner object.
     */
    ServerThreatProtectionSettingsModelInner innerModel();

    /** The entirety of the ServerThreatProtectionSettingsModel definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The ServerThreatProtectionSettingsModel definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServerThreatProtectionSettingsModel definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the ServerThreatProtectionSettingsModel definition allowing to specify parent resource. */
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
         * The stage of the ServerThreatProtectionSettingsModel definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServerThreatProtectionSettingsModel create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServerThreatProtectionSettingsModel create(Context context);
        }

        /** The stage of the ServerThreatProtectionSettingsModel definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the Threat Protection, whether it is enabled or
             * disabled or a state has not been applied yet on the specific server..
             *
             * @param state Specifies the state of the Threat Protection, whether it is enabled or disabled or a state
             *     has not been applied yet on the specific server.
             * @return the next definition stage.
             */
            WithCreate withState(ThreatProtectionState state);
        }
    }

    /**
     * Begins update for the ServerThreatProtectionSettingsModel resource.
     *
     * @return the stage of resource update.
     */
    ServerThreatProtectionSettingsModel.Update update();

    /** The template for ServerThreatProtectionSettingsModel update. */
    interface Update extends UpdateStages.WithState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServerThreatProtectionSettingsModel apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServerThreatProtectionSettingsModel apply(Context context);
    }

    /** The ServerThreatProtectionSettingsModel update stages. */
    interface UpdateStages {
        /** The stage of the ServerThreatProtectionSettingsModel update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the Threat Protection, whether it is enabled or
             * disabled or a state has not been applied yet on the specific server..
             *
             * @param state Specifies the state of the Threat Protection, whether it is enabled or disabled or a state
             *     has not been applied yet on the specific server.
             * @return the next definition stage.
             */
            Update withState(ThreatProtectionState state);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServerThreatProtectionSettingsModel refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServerThreatProtectionSettingsModel refresh(Context context);
}
