// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.AzureMLUpdateResourceActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLUpdateResourceActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLUpdateResourceActivity model = BinaryData.fromString(
            "{\"type\":\"AzureMLUpdateResource\",\"typeProperties\":{\"trainedModelName\":\"datahjorguifchvrgbmn\",\"trainedModelLinkedServiceName\":{\"referenceName\":\"kqejrh\",\"parameters\":{\"cfxbywpw\":\"datazzdlfayich\"}},\"trainedModelFilePath\":\"datavpglstxznkbj\"},\"linkedServiceName\":{\"referenceName\":\"e\",\"parameters\":{\"ocwbcxwdbx\":\"datarddygpdnnvep\"}},\"policy\":{\"timeout\":\"datapummphb\",\"retry\":\"datariv\",\"retryIntervalInSeconds\":100885789,\"secureInput\":true,\"secureOutput\":true,\"\":{\"xzm\":\"dataenaj\",\"ljl\":\"datapnersmevhgsuq\",\"zsyqpkpvb\":\"datarjqakb\",\"gyguqyxvzyi\":\"datag\"}},\"name\":\"gzeio\",\"description\":\"cngiaadg\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"teidfzof\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"ucsgquphqnuitumx\":\"datacmlomlnprkiky\"}},{\"activity\":\"vemogab\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"jdmdb\":\"datajfkcmzanru\",\"t\":\"datab\",\"jlaxeqehg\":\"dataqiuohi\",\"gb\":\"datajgvrawjom\"}},{\"activity\":\"dwfyagvhe\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Skipped\",\"Completed\"],\"\":{\"z\":\"datawpcupejz\"}}],\"userProperties\":[{\"name\":\"pxxgvcsvtflcjxmt\",\"value\":\"dataexapfypdfierut\"},{\"name\":\"edeygsrrgdimaqy\",\"value\":\"datasahv\"},{\"name\":\"wlibrwomdwzz\",\"value\":\"datacyrkcdo\"}],\"\":{\"aitihncysa\":\"datag\",\"ora\":\"datajlq\",\"ajlptydvebipkeo\":\"datatbiskkceb\"}}")
            .toObject(AzureMLUpdateResourceActivity.class);
        Assertions.assertEquals("gzeio", model.name());
        Assertions.assertEquals("cngiaadg", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("teidfzof", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pxxgvcsvtflcjxmt", model.userProperties().get(0).name());
        Assertions.assertEquals("e", model.linkedServiceName().referenceName());
        Assertions.assertEquals(100885789, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("kqejrh", model.trainedModelLinkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLUpdateResourceActivity model = new AzureMLUpdateResourceActivity().withName("gzeio")
            .withDescription("cngiaadg")
            .withState(ActivityState.INACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("teidfzof")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("vemogab")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("dwfyagvhe")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED,
                        DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(
                Arrays.asList(new UserProperty().withName("pxxgvcsvtflcjxmt").withValue("dataexapfypdfierut"),
                    new UserProperty().withName("edeygsrrgdimaqy").withValue("datasahv"),
                    new UserProperty().withName("wlibrwomdwzz").withValue("datacyrkcdo")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("e")
                .withParameters(mapOf("ocwbcxwdbx", "datarddygpdnnvep")))
            .withPolicy(new ActivityPolicy().withTimeout("datapummphb")
                .withRetry("datariv")
                .withRetryIntervalInSeconds(100885789)
                .withSecureInput(true)
                .withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withTrainedModelName("datahjorguifchvrgbmn")
            .withTrainedModelLinkedServiceName(new LinkedServiceReference().withReferenceName("kqejrh")
                .withParameters(mapOf("cfxbywpw", "datazzdlfayich")))
            .withTrainedModelFilePath("datavpglstxznkbj");
        model = BinaryData.fromObject(model).toObject(AzureMLUpdateResourceActivity.class);
        Assertions.assertEquals("gzeio", model.name());
        Assertions.assertEquals("cngiaadg", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("teidfzof", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pxxgvcsvtflcjxmt", model.userProperties().get(0).name());
        Assertions.assertEquals("e", model.linkedServiceName().referenceName());
        Assertions.assertEquals(100885789, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("kqejrh", model.trainedModelLinkedServiceName().referenceName());
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
