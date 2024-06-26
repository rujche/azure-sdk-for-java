// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logz.fluent.models.UserRoleResponseInner;
import com.azure.resourcemanager.logz.models.UserRole;
import com.azure.resourcemanager.logz.models.UserRoleListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UserRoleListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserRoleListResponse model =
            BinaryData
                .fromString("{\"value\":[{\"role\":\"None\"},{\"role\":\"Admin\"}],\"nextLink\":\"wd\"}")
                .toObject(UserRoleListResponse.class);
        Assertions.assertEquals(UserRole.NONE, model.value().get(0).role());
        Assertions.assertEquals("wd", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserRoleListResponse model =
            new UserRoleListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new UserRoleResponseInner().withRole(UserRole.NONE),
                            new UserRoleResponseInner().withRole(UserRole.ADMIN)))
                .withNextLink("wd");
        model = BinaryData.fromObject(model).toObject(UserRoleListResponse.class);
        Assertions.assertEquals(UserRole.NONE, model.value().get(0).role());
        Assertions.assertEquals("wd", model.nextLink());
    }
}
