// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CustomEventsTriggerTypeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomEventsTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomEventsTriggerTypeProperties model = BinaryData.fromString(
            "{\"subjectBeginsWith\":\"povr\",\"subjectEndsWith\":\"otbybcx\",\"events\":[\"datarlzdnccx\",\"dataq\"],\"scope\":\"pfgjnynuqikoiu\"}")
            .toObject(CustomEventsTriggerTypeProperties.class);
        Assertions.assertEquals("povr", model.subjectBeginsWith());
        Assertions.assertEquals("otbybcx", model.subjectEndsWith());
        Assertions.assertEquals("pfgjnynuqikoiu", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomEventsTriggerTypeProperties model
            = new CustomEventsTriggerTypeProperties().withSubjectBeginsWith("povr").withSubjectEndsWith("otbybcx")
                .withEvents(Arrays.asList("datarlzdnccx", "dataq")).withScope("pfgjnynuqikoiu");
        model = BinaryData.fromObject(model).toObject(CustomEventsTriggerTypeProperties.class);
        Assertions.assertEquals("povr", model.subjectBeginsWith());
        Assertions.assertEquals("otbybcx", model.subjectEndsWith());
        Assertions.assertEquals("pfgjnynuqikoiu", model.scope());
    }
}
