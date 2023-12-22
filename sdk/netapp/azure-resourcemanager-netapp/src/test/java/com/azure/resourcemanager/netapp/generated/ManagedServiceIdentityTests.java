// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ManagedServiceIdentity;
import com.azure.resourcemanager.netapp.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.netapp.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model = BinaryData.fromString(
            "{\"principalId\":\"b0db07e2-0d55-4a16-9043-862d6d43ce8b\",\"tenantId\":\"546cc382-9f0b-4fe7-b2d9-4dfa7e051a07\",\"type\":\"None\",\"userAssignedIdentities\":{\"moyrxvwfudwpz\":{\"principalId\":\"d68aff32-8de2-4773-a763-52f76c726951\",\"clientId\":\"dd60b7cc-a6c3-4f4d-ba11-d942001d4965\"},\"hdzhlrqj\":{\"principalId\":\"0d3e63e2-482a-425c-abe1-8b6f5e7e27ff\",\"clientId\":\"35fa09f1-945c-48a6-a4ac-96cbe97a0fe2\"},\"kfrlhrxsbky\":{\"principalId\":\"780afe23-a49e-4ec3-a63d-d7475b36aef6\",\"clientId\":\"61d91fa7-c397-4758-89ad-109b0a8c16c8\"},\"ca\":{\"principalId\":\"16f6d962-c37b-40e2-9acd-46244b8407cb\",\"clientId\":\"376332a8-28c1-4b72-96b7-a973c8e61ebd\"}}}")
            .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model
            = new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE).withUserAssignedIdentities(
                mapOf("moyrxvwfudwpz", new UserAssignedIdentity(), "hdzhlrqj", new UserAssignedIdentity(),
                    "kfrlhrxsbky", new UserAssignedIdentity(), "ca", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.type());
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
