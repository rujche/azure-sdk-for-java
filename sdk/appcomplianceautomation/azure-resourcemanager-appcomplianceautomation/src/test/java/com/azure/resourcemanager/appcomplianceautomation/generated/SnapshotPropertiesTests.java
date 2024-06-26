// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.SnapshotProperties;
import org.junit.jupiter.api.Test;

public final class SnapshotPropertiesTests {
    @Test
    public void testDeserialize() {
        SnapshotProperties model =
            BinaryData
                .fromString(
                    "{\"id\":\"xhvpmoue\",\"snapshotName\":\"dzxibqeojnxqbzvd\",\"createdAt\":\"2021-01-10T12:02:15Z\",\"provisioningState\":\"Succeeded\",\"reportProperties\":{\"id\":\"icbtwnpzao\",\"status\":\"Active\",\"tenantId\":\"rhcffcydd\",\"reportName\":\"mjthjqkwp\",\"offerGuid\":\"icxm\",\"timeZone\":\"ciwqvhk\",\"triggerTime\":\"2021-03-25T23:46:11Z\",\"nextTriggerTime\":\"2021-04-08T23:48:15Z\",\"lastTriggerTime\":\"2021-04-28T05:58:26Z\",\"subscriptions\":[\"opbobj\",\"ghmewuam\",\"uhrzayvvt\"],\"resources\":[{\"resourceId\":\"vdfgiotk\",\"resourceType\":\"utqxlngx\",\"resourceKind\":\"fgugnxkrxdqmid\",\"resourceName\":\"hzrvqd\",\"tags\":{}},{\"resourceId\":\"bhj\",\"resourceType\":\"igeho\",\"resourceKind\":\"bowsk\",\"resourceName\":\"yktz\",\"tags\":{}},{\"resourceId\":\"u\",\"resourceType\":\"wgqyw\",\"resourceKind\":\"drvyn\",\"resourceName\":\"gpphrcgyn\",\"tags\":{}},{\"resourceId\":\"cpecfvmmcoofs\",\"resourceType\":\"zevgb\",\"resourceKind\":\"jqabcypmivkwlzuv\",\"resourceName\":\"fwnfnb\",\"tags\":{}}],\"complianceStatus\":{},\"provisioningState\":\"Deleting\"},\"complianceResults\":[{\"complianceName\":\"etqgtzxdpnq\",\"categories\":[]},{\"complianceName\":\"xrjfeallnwsub\",\"categories\":[]},{\"complianceName\":\"ampmngnz\",\"categories\":[]}]}")
                .toObject(SnapshotProperties.class);
    }

    @Test
    public void testSerialize() {
        SnapshotProperties model = new SnapshotProperties();
        model = BinaryData.fromObject(model).toObject(SnapshotProperties.class);
    }
}
