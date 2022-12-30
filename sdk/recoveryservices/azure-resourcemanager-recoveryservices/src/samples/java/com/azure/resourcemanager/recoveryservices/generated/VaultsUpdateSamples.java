// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.models.AlertsState;
import com.azure.resourcemanager.recoveryservices.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.recoveryservices.models.ClassicAlertSettings;
import com.azure.resourcemanager.recoveryservices.models.CmkKekIdentity;
import com.azure.resourcemanager.recoveryservices.models.CmkKeyVaultProperties;
import com.azure.resourcemanager.recoveryservices.models.IdentityData;
import com.azure.resourcemanager.recoveryservices.models.InfrastructureEncryptionState;
import com.azure.resourcemanager.recoveryservices.models.MonitoringSettings;
import com.azure.resourcemanager.recoveryservices.models.ResourceIdentityType;
import com.azure.resourcemanager.recoveryservices.models.UserIdentity;
import com.azure.resourcemanager.recoveryservices.models.Vault;
import com.azure.resourcemanager.recoveryservices.models.VaultProperties;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesEncryption;
import java.util.HashMap;
import java.util.Map;

/** Samples for Vaults Update. */
public final class VaultsUpdateSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/PATCHVault_WithMonitoringSettings.json
     */
    /**
     * Sample code: Update Vault With Monitoring Setting.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void updateVaultWithMonitoringSetting(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        Vault resource =
            manager.vaults().getByResourceGroupWithResponse("HelloWorld", "swaggerExample", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("PatchKey", "PatchKeyUpdated"))
            .withProperties(
                new VaultProperties()
                    .withMonitoringSettings(
                        new MonitoringSettings()
                            .withAzureMonitorAlertSettings(
                                new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED))
                            .withClassicAlertSettings(
                                new ClassicAlertSettings().withAlertsForCriticalOperations(AlertsState.DISABLED))))
            .apply();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/PATCHVault_WithCMK.json
     */
    /**
     * Sample code: Update Resource With CustomerManagedKeys.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void updateResourceWithCustomerManagedKeys(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        Vault resource =
            manager.vaults().getByResourceGroupWithResponse("HelloWorld", "swaggerExample", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("PatchKey", "PatchKeyUpdated"))
            .withProperties(
                new VaultProperties()
                    .withEncryption(
                        new VaultPropertiesEncryption()
                            .withKeyVaultProperties(new CmkKeyVaultProperties().withKeyUri("fakeTokenPlaceholder"))
                            .withKekIdentity(
                                new CmkKekIdentity()
                                    .withUserAssignedIdentity(
                                        "/subscriptions/85bf5e8c-3084-4f42-add2-746ebb7e97b2/resourcegroups/defaultrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/examplemsi"))
                            .withInfrastructureEncryption(InfrastructureEncryptionState.ENABLED)))
            .withIdentity(
                new IdentityData()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/85bf5e8c-3084-4f42-add2-746ebb7e97b2/resourcegroups/defaultrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/examplemsi",
                            new UserIdentity())))
            .apply();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/PatchVault_WithCMK2.json
     */
    /**
     * Sample code: Update Resource With CustomerManagedKeys2.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void updateResourceWithCustomerManagedKeys2(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        Vault resource =
            manager.vaults().getByResourceGroupWithResponse("HelloWorld", "swaggerExample", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("PatchKey", "PatchKeyUpdated"))
            .withProperties(
                new VaultProperties()
                    .withEncryption(
                        new VaultPropertiesEncryption()
                            .withKekIdentity(new CmkKekIdentity().withUseSystemAssignedIdentity(true))))
            .withIdentity(new IdentityData().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .apply();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/PATCHVault_WithCMK3.json
     */
    /**
     * Sample code: Update Resource With CustomerManagedKeys3.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void updateResourceWithCustomerManagedKeys3(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        Vault resource =
            manager.vaults().getByResourceGroupWithResponse("HelloWorld", "swaggerExample", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("PatchKey", "PatchKeyUpdated"))
            .withProperties(
                new VaultProperties()
                    .withEncryption(
                        new VaultPropertiesEncryption()
                            .withKeyVaultProperties(new CmkKeyVaultProperties().withKeyUri("fakeTokenPlaceholder"))))
            .withIdentity(
                new IdentityData()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/85bf5e8c-3084-4f42-add2-746ebb7e97b2/resourcegroups/defaultrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/examplemsi",
                            new UserIdentity())))
            .apply();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/PATCHVault.json
     */
    /**
     * Sample code: Update Resource.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void updateResource(com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        Vault resource =
            manager.vaults().getByResourceGroupWithResponse("HelloWorld", "swaggerExample", Context.NONE).getValue();
        resource.update().withTags(mapOf("PatchKey", "PatchKeyUpdated")).apply();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/PATCHVault_WithUserAssignedIdentity.json
     */
    /**
     * Sample code: Update Resource With User Assigned Identity.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void updateResourceWithUserAssignedIdentity(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        Vault resource =
            manager.vaults().getByResourceGroupWithResponse("HelloWorld", "swaggerExample", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("PatchKey", "PatchKeyUpdated"))
            .withIdentity(
                new IdentityData()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/85bf5e8c-3084-4f42-add2-746ebb7e97b2/resourcegroups/defaultrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/examplemsi",
                            new UserIdentity())))
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
