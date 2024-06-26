// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.AmfId;
import com.azure.resourcemanager.mobilenetwork.models.Guti5G;
import com.azure.resourcemanager.mobilenetwork.models.PlmnId;
import org.junit.jupiter.api.Assertions;

public final class Guti5GTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Guti5G model = BinaryData.fromString(
            "{\"plmn\":{\"mcc\":\"zflbqvg\",\"mnc\":\"qvlgafcqusrdvetn\"},\"amfId\":{\"regionId\":999562740,\"setId\":89870573,\"pointer\":2059814466},\"fivegTmsi\":1022807330}")
            .toObject(Guti5G.class);
        Assertions.assertEquals("zflbqvg", model.plmn().mcc());
        Assertions.assertEquals("qvlgafcqusrdvetn", model.plmn().mnc());
        Assertions.assertEquals(999562740, model.amfId().regionId());
        Assertions.assertEquals(89870573, model.amfId().setId());
        Assertions.assertEquals(2059814466, model.amfId().pointer());
        Assertions.assertEquals(1022807330, model.fivegTmsi());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Guti5G model = new Guti5G().withPlmn(new PlmnId().withMcc("zflbqvg").withMnc("qvlgafcqusrdvetn"))
            .withAmfId(new AmfId().withRegionId(999562740).withSetId(89870573).withPointer(2059814466))
            .withFivegTmsi(1022807330);
        model = BinaryData.fromObject(model).toObject(Guti5G.class);
        Assertions.assertEquals("zflbqvg", model.plmn().mcc());
        Assertions.assertEquals("qvlgafcqusrdvetn", model.plmn().mnc());
        Assertions.assertEquals(999562740, model.amfId().regionId());
        Assertions.assertEquals(89870573, model.amfId().setId());
        Assertions.assertEquals(2059814466, model.amfId().pointer());
        Assertions.assertEquals(1022807330, model.fivegTmsi());
    }
}
