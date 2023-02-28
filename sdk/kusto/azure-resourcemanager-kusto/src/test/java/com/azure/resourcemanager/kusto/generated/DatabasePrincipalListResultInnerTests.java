// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalListResultInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabasePrincipalListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabasePrincipalListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"role\":\"Viewer\",\"name\":\"ourqhakau\",\"type\":\"Group\",\"fqn\":\"hsfwxosowzxcug\",\"email\":\"jooxdjebw\",\"appId\":\"cwwfvovbvme\",\"tenantName\":\"civyhzceuo\"},{\"role\":\"Viewer\",\"name\":\"jrwjueiotwm\",\"type\":\"App\",\"fqn\":\"tdx\",\"email\":\"txnrjaw\",\"appId\":\"wgxhn\",\"tenantName\":\"kxfbkpycgklwndn\"},{\"role\":\"User\",\"name\":\"dauwhvylwzbtd\",\"type\":\"App\",\"fqn\":\"jznb\",\"email\":\"ow\",\"appId\":\"przqlveu\",\"tenantName\":\"upjm\"}]}")
                .toObject(DatabasePrincipalListResultInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.VIEWER, model.value().get(0).role());
        Assertions.assertEquals("ourqhakau", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.GROUP, model.value().get(0).type());
        Assertions.assertEquals("hsfwxosowzxcug", model.value().get(0).fqn());
        Assertions.assertEquals("jooxdjebw", model.value().get(0).email());
        Assertions.assertEquals("cwwfvovbvme", model.value().get(0).appId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabasePrincipalListResultInner model =
            new DatabasePrincipalListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.VIEWER)
                                .withName("ourqhakau")
                                .withType(DatabasePrincipalType.GROUP)
                                .withFqn("hsfwxosowzxcug")
                                .withEmail("jooxdjebw")
                                .withAppId("cwwfvovbvme"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.VIEWER)
                                .withName("jrwjueiotwm")
                                .withType(DatabasePrincipalType.APP)
                                .withFqn("tdx")
                                .withEmail("txnrjaw")
                                .withAppId("wgxhn"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.USER)
                                .withName("dauwhvylwzbtd")
                                .withType(DatabasePrincipalType.APP)
                                .withFqn("jznb")
                                .withEmail("ow")
                                .withAppId("przqlveu")));
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalListResultInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.VIEWER, model.value().get(0).role());
        Assertions.assertEquals("ourqhakau", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.GROUP, model.value().get(0).type());
        Assertions.assertEquals("hsfwxosowzxcug", model.value().get(0).fqn());
        Assertions.assertEquals("jooxdjebw", model.value().get(0).email());
        Assertions.assertEquals("cwwfvovbvme", model.value().get(0).appId());
    }
}
