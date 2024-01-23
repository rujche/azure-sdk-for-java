// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TabularTranslator;
import com.azure.resourcemanager.datafactory.models.TypeConversionSettings;

public final class TabularTranslatorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TabularTranslator model = BinaryData.fromString(
            "{\"type\":\"TabularTranslator\",\"columnMappings\":\"datadqilzogilgrqzwy\",\"schemaMapping\":\"datahfybflr\",\"collectionReference\":\"datacgqq\",\"mapComplexValuesToString\":\"dataksghpsqvuisedeqr\",\"mappings\":\"dataj\",\"typeConversion\":\"dataxnqrq\",\"typeConversionSettings\":{\"allowDataTruncation\":\"databtpvwx\",\"treatBooleanAsNumber\":\"datas\",\"dateTimeFormat\":\"datacvpagwohkro\",\"dateTimeOffsetFormat\":\"datasse\",\"timeSpanFormat\":\"dataozjyovrll\",\"culture\":\"databgkgjp\"},\"\":{\"pfbiqjrzfrxizor\":\"datathflgpsalynanmw\"}}")
            .toObject(TabularTranslator.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TabularTranslator model = new TabularTranslator().withColumnMappings("datadqilzogilgrqzwy")
            .withSchemaMapping("datahfybflr").withCollectionReference("datacgqq")
            .withMapComplexValuesToString("dataksghpsqvuisedeqr").withMappings("dataj").withTypeConversion("dataxnqrq")
            .withTypeConversionSettings(new TypeConversionSettings().withAllowDataTruncation("databtpvwx")
                .withTreatBooleanAsNumber("datas").withDateTimeFormat("datacvpagwohkro")
                .withDateTimeOffsetFormat("datasse").withTimeSpanFormat("dataozjyovrll").withCulture("databgkgjp"));
        model = BinaryData.fromObject(model).toObject(TabularTranslator.class);
    }
}
