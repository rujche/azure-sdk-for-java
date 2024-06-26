// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.developer.devcenter.models.DevCenterEnvironment;
import com.azure.developer.devcenter.models.EnvironmentProvisioningState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class GetsAnEnvironmentTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testGetsAnEnvironmentTests() {
        // method invocation
        DevCenterEnvironment response = deploymentEnvironmentsClient.getEnvironment("myProject", "me", "mydevenv");

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "parameters"
        Assertions.assertNotNull(response.getParameters());
        // verify property "name"
        Assertions.assertEquals("mydevenv", response.getName());
        // verify property "environmentTypeName"
        Assertions.assertEquals("DevTest", response.getEnvironmentTypeName());
        // verify property "userId"
        Assertions.assertEquals("b08e39b4-2ac6-4465-a35e-48322efb0f98", response.getUserId());
        // verify property "provisioningState"
        Assertions.assertEquals(EnvironmentProvisioningState.SUCCEEDED, response.getProvisioningState());
        // verify property "resourceGroupId"
        Assertions.assertEquals("/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg028321",
            response.getResourceGroupId());
        // verify property "catalogName"
        Assertions.assertEquals("main", response.getCatalogName());
        // verify property "environmentDefinitionName"
        Assertions.assertEquals("helloworld", response.getEnvironmentDefinitionName());
    }
}
