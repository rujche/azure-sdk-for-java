// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.resourcemanager.healthcareapis.models.IotConnector;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for IotConnectors Update.
 */
public final class IotConnectorsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2023-11-01/examples/iotconnectors/
     * iotconnector_Patch.json
     */
    /**
     * Sample code: Patch an IoT Connector.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void patchAnIoTConnector(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        IotConnector resource = manager.iotConnectors()
            .getWithResponse("testRG", "workspace1", "blue", com.azure.core.util.Context.NONE).getValue();
        resource.update()
            .withTags(mapOf("additionalProp1", "string", "additionalProp2", "string", "additionalProp3", "string"))
            .withIdentity(new ServiceManagedIdentityIdentity().withType(ServiceManagedIdentityType.SYSTEM_ASSIGNED))
            .apply();
    }

    // Use "Map.of" if available
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
