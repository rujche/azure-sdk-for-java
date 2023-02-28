// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.models.EventSourceCreateOrUpdateParameters;
import com.azure.resourcemanager.timeseriesinsights.models.LocalTimestamp;
import com.azure.resourcemanager.timeseriesinsights.models.LocalTimestampFormat;
import com.azure.resourcemanager.timeseriesinsights.models.LocalTimestampTimeZoneOffset;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class EventSourceCreateOrUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventSourceCreateOrUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"kind\":\"EventSourceCreateOrUpdateParameters\",\"localTimestamp\":{\"format\":\"Embedded\",\"timeZoneOffset\":{\"propertyName\":\"qajzyulpkudjkr\"}},\"location\":\"khbzhfepgzg\",\"tags\":{\"scpai\":\"zloc\",\"l\":\"rhhbcs\",\"bnbdxkqpxokajion\":\"mmajtjaodx\"}}")
                .toObject(EventSourceCreateOrUpdateParameters.class);
        Assertions.assertEquals("khbzhfepgzg", model.location());
        Assertions.assertEquals("zloc", model.tags().get("scpai"));
        Assertions.assertEquals(LocalTimestampFormat.EMBEDDED, model.localTimestamp().format());
        Assertions.assertEquals("qajzyulpkudjkr", model.localTimestamp().timeZoneOffset().propertyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventSourceCreateOrUpdateParameters model =
            new EventSourceCreateOrUpdateParameters()
                .withLocation("khbzhfepgzg")
                .withTags(mapOf("scpai", "zloc", "l", "rhhbcs", "bnbdxkqpxokajion", "mmajtjaodx"))
                .withLocalTimestamp(
                    new LocalTimestamp()
                        .withFormat(LocalTimestampFormat.EMBEDDED)
                        .withTimeZoneOffset(new LocalTimestampTimeZoneOffset().withPropertyName("qajzyulpkudjkr")));
        model = BinaryData.fromObject(model).toObject(EventSourceCreateOrUpdateParameters.class);
        Assertions.assertEquals("khbzhfepgzg", model.location());
        Assertions.assertEquals("zloc", model.tags().get("scpai"));
        Assertions.assertEquals(LocalTimestampFormat.EMBEDDED, model.localTimestamp().format());
        Assertions.assertEquals("qajzyulpkudjkr", model.localTimestamp().timeZoneOffset().propertyName());
    }

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
