// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListLocalRulestackResourceInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FqdnListLocalRulestackResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FqdnListLocalRulestackResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"ff\",\"fqdnList\":[\"qitmhheioqaqhv\"],\"etag\":\"ufuqyrx\",\"auditComment\":\"lcgqlsismj\",\"provisioningState\":\"Deleted\"},\"id\":\"dgamquhiosrsj\",\"name\":\"ivfcdisyirnx\",\"type\":\"hcz\"}")
            .toObject(FqdnListLocalRulestackResourceInner.class);
        Assertions.assertEquals("ff", model.description());
        Assertions.assertEquals("qitmhheioqaqhv", model.fqdnList().get(0));
        Assertions.assertEquals("ufuqyrx", model.etag());
        Assertions.assertEquals("lcgqlsismj", model.auditComment());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FqdnListLocalRulestackResourceInner model = new FqdnListLocalRulestackResourceInner().withDescription("ff")
            .withFqdnList(Arrays.asList("qitmhheioqaqhv")).withEtag("ufuqyrx").withAuditComment("lcgqlsismj");
        model = BinaryData.fromObject(model).toObject(FqdnListLocalRulestackResourceInner.class);
        Assertions.assertEquals("ff", model.description());
        Assertions.assertEquals("qitmhheioqaqhv", model.fqdnList().get(0));
        Assertions.assertEquals("ufuqyrx", model.etag());
        Assertions.assertEquals("lcgqlsismj", model.auditComment());
    }
}
