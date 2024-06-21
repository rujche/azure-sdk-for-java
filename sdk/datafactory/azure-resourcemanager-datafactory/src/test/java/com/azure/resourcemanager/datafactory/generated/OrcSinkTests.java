// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.OrcSink;
import com.azure.resourcemanager.datafactory.models.OrcWriteSettings;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class OrcSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrcSink model = BinaryData.fromString(
            "{\"type\":\"OrcSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"dataomgse\",\"disableMetricsCollection\":\"datasydhardx\",\"copyBehavior\":\"dataluqfffglf\",\"metadata\":[{\"name\":\"datakierxuvpr\",\"value\":\"dataxewcscuveljfarin\"},{\"name\":\"dataziztgddahymv\",\"value\":\"datajtdhmig\"},{\"name\":\"dataaoexgienylsijqyg\",\"value\":\"datashd\"},{\"name\":\"datahxv\",\"value\":\"datafdsafgkysymhuxs\"}],\"\":{\"wszrbttzsqeyr\":\"datalbpegcetezaa\",\"curfsofshfmgiix\":\"datafhfgoyxxszpai\",\"oefkpuuuxiuwhc\":\"datarveekhsmulvmy\",\"gtmoy\":\"datackekmufip\"}},\"formatSettings\":{\"type\":\"OrcWriteSettings\",\"maxRowsPerFile\":\"datatmaosongtbhvh\",\"fileNamePrefix\":\"datavubwwqgiyu\",\"\":{\"tnsnb\":\"datavwjxmwalhl\",\"vqhodfmortrsnpb\":\"datai\",\"uc\":\"dataungnjkkmkzfb\"}},\"writeBatchSize\":\"datagzjyrdiiwhmrhz\",\"writeBatchTimeout\":\"datavpjydwmaqeytjp\",\"sinkRetryCount\":\"datadp\",\"sinkRetryWait\":\"datapdcsvzugiurhgqlv\",\"maxConcurrentConnections\":\"datajzscrjtnq\",\"disableMetricsCollection\":\"datapobjufksddxk\",\"\":{\"oylfclsrguecbth\":\"dataxlylxfp\",\"lzguvckpdp\":\"datauivgbimededqgyrv\",\"kikqdqiyb\":\"datacnrjq\",\"npisbpxlse\":\"datatlvofjjsetiznnna\"}}")
            .toObject(OrcSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrcSink model = new OrcSink().withWriteBatchSize("datagzjyrdiiwhmrhz")
            .withWriteBatchTimeout("datavpjydwmaqeytjp")
            .withSinkRetryCount("datadp")
            .withSinkRetryWait("datapdcsvzugiurhgqlv")
            .withMaxConcurrentConnections("datajzscrjtnq")
            .withDisableMetricsCollection("datapobjufksddxk")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("dataomgse")
                .withDisableMetricsCollection("datasydhardx")
                .withCopyBehavior("dataluqfffglf")
                .withMetadata(
                    Arrays.asList(new MetadataItem().withName("datakierxuvpr").withValue("dataxewcscuveljfarin"),
                        new MetadataItem().withName("dataziztgddahymv").withValue("datajtdhmig"),
                        new MetadataItem().withName("dataaoexgienylsijqyg").withValue("datashd"),
                        new MetadataItem().withName("datahxv").withValue("datafdsafgkysymhuxs")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
            .withFormatSettings(
                new OrcWriteSettings().withMaxRowsPerFile("datatmaosongtbhvh").withFileNamePrefix("datavubwwqgiyu"));
        model = BinaryData.fromObject(model).toObject(OrcSink.class);
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
