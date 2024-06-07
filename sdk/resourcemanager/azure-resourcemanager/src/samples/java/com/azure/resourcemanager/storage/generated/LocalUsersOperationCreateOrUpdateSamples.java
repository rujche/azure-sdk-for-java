// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.fluent.models.LocalUserInner;
import com.azure.resourcemanager.storage.models.PermissionScope;
import com.azure.resourcemanager.storage.models.SshPublicKey;
import java.util.Arrays;

/**
 * Samples for LocalUsersOperation CreateOrUpdate.
 */
public final class LocalUsersOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/LocalUserCreate.json
     */
    /**
     * Sample code: CreateLocalUser.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createLocalUser(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getLocalUsersOperations()
            .createOrUpdateWithResponse("res6977", "sto2527", "user1",
                new LocalUserInner()
                    .withPermissionScopes(Arrays.asList(
                        new PermissionScope().withPermissions("rwd").withService("file").withResourceName("share1"),
                        new PermissionScope().withPermissions("rw").withService("file").withResourceName("share2")))
                    .withHomeDirectory("homedirectory")
                    .withSshAuthorizedKeys(
                        Arrays.asList(new SshPublicKey().withDescription("key name").withKey("fakeTokenPlaceholder")))
                    .withHasSshPassword(true)
                    .withGroupId(2000)
                    .withAllowAclAuthorization(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/LocalUserCreateNFSv3Enabled.json
     */
    /**
     * Sample code: CreateNFSv3EnabledLocalUser.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createNFSv3EnabledLocalUser(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getLocalUsersOperations()
            .createOrUpdateWithResponse("res6977", "sto2527", "user1",
                new LocalUserInner().withExtendedGroups(Arrays.asList(1001, 1005, 2005)).withIsNFSv3Enabled(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/LocalUserUpdate.json
     */
    /**
     * Sample code: UpdateLocalUser.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateLocalUser(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getLocalUsersOperations()
            .createOrUpdateWithResponse("res6977", "sto2527", "user1",
                new LocalUserInner().withHomeDirectory("homedirectory2")
                    .withHasSharedKey(false)
                    .withHasSshKey(false)
                    .withHasSshPassword(false)
                    .withGroupId(3000)
                    .withAllowAclAuthorization(false)
                    .withExtendedGroups(Arrays.asList(1001, 1005, 2005))
                    .withIsNFSv3Enabled(true),
                com.azure.core.util.Context.NONE);
    }
}
