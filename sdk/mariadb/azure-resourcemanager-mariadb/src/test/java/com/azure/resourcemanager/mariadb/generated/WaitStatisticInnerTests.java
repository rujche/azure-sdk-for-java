// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.WaitStatisticInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class WaitStatisticInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WaitStatisticInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"startTime\":\"2020-12-23T12:41:55Z\",\"endTime\":\"2021-11-22T00:13:21Z\",\"eventName\":\"oqnermclfpl\",\"eventTypeName\":\"oxuscrpabgyepsbj\",\"queryId\":1292231161047660234,\"databaseName\":\"gxywpmue\",\"userId\":4342383129018744659,\"count\":6619797185475635506,\"totalTimeInMs\":4.5201340432621695},\"id\":\"jidsuyonobglaoc\",\"name\":\"xtccmg\",\"type\":\"udxytlmoyrx\"}")
                .toObject(WaitStatisticInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-23T12:41:55Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-22T00:13:21Z"), model.endTime());
        Assertions.assertEquals("oqnermclfpl", model.eventName());
        Assertions.assertEquals("oxuscrpabgyepsbj", model.eventTypeName());
        Assertions.assertEquals(1292231161047660234L, model.queryId());
        Assertions.assertEquals("gxywpmue", model.databaseName());
        Assertions.assertEquals(4342383129018744659L, model.userId());
        Assertions.assertEquals(6619797185475635506L, model.count());
        Assertions.assertEquals(4.5201340432621695D, model.totalTimeInMs());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WaitStatisticInner model =
            new WaitStatisticInner()
                .withStartTime(OffsetDateTime.parse("2020-12-23T12:41:55Z"))
                .withEndTime(OffsetDateTime.parse("2021-11-22T00:13:21Z"))
                .withEventName("oqnermclfpl")
                .withEventTypeName("oxuscrpabgyepsbj")
                .withQueryId(1292231161047660234L)
                .withDatabaseName("gxywpmue")
                .withUserId(4342383129018744659L)
                .withCount(6619797185475635506L)
                .withTotalTimeInMs(4.5201340432621695D);
        model = BinaryData.fromObject(model).toObject(WaitStatisticInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-23T12:41:55Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-22T00:13:21Z"), model.endTime());
        Assertions.assertEquals("oqnermclfpl", model.eventName());
        Assertions.assertEquals("oxuscrpabgyepsbj", model.eventTypeName());
        Assertions.assertEquals(1292231161047660234L, model.queryId());
        Assertions.assertEquals("gxywpmue", model.databaseName());
        Assertions.assertEquals(4342383129018744659L, model.userId());
        Assertions.assertEquals(6619797185475635506L, model.count());
        Assertions.assertEquals(4.5201340432621695D, model.totalTimeInMs());
    }
}
