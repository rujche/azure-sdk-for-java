// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ScriptExecutionInner;
import com.azure.resourcemanager.avs.models.ScriptExecutionParameter;
import com.azure.resourcemanager.avs.models.ScriptExecutionsList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScriptExecutionsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptExecutionsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"scriptCmdletId\":\"sgwbnbbeld\",\"parameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"zbaliourqha\"}],\"hiddenParameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"hashsfwxosow\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"xcug\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"cjooxdjebwpucwwf\"}],\"failureReason\":\"vbvmeu\",\"timeout\":\"civyhzceuo\",\"retention\":\"jrwjueiotwm\",\"submittedAt\":\"2021-01-06T11:18:17Z\",\"startedAt\":\"2021-05-06T08:04:17Z\",\"finishedAt\":\"2021-09-27T21:02:03Z\",\"provisioningState\":\"Pending\",\"output\":[\"rjaw\",\"qwgxhniskx\",\"bkpyc\"],\"namedOutputs\":{\"auwhvylwzbtdhx\":\"datawndnhj\"},\"information\":[\"nbmpowuwprzq\",\"veual\",\"pjmkhfxobbc\",\"wsrtjriplrbpbe\"],\"warnings\":[\"hfgblc\"],\"errors\":[\"zvlvqhjkbegib\",\"nmxiebwwaloayqc\",\"wrtz\",\"uzgwyzmhtx\"]},\"id\":\"gmtsavjcbpwxqpsr\",\"name\":\"nftguvriuhpr\",\"type\":\"mdyvxqtayriw\"},{\"properties\":{\"scriptCmdletId\":\"yqbexrmcqibycno\",\"parameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"nmefqsgzvahapj\"}],\"hiddenParameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"pvgqzcjrvxdjzlm\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"lxkvu\"}],\"failureReason\":\"hzovawjvzunlut\",\"timeout\":\"nnprn\",\"retention\":\"peilpjzuaejxdu\",\"submittedAt\":\"2021-04-04T06:42:49Z\",\"startedAt\":\"2021-07-28T02:16:26Z\",\"finishedAt\":\"2021-11-26T08:31:17Z\",\"provisioningState\":\"Running\",\"output\":[\"mv\",\"ekg\",\"wozuhkf\",\"bsjyofdx\"],\"namedOutputs\":{\"touwaboekqv\":\"datasd\"},\"information\":[\"nsmvbxwyj\"],\"warnings\":[\"hhcaal\"],\"errors\":[\"xisxyawjoyaqcsl\",\"jpkiidzyexznelix\",\"nr\"]},\"id\":\"folhbnxknal\",\"name\":\"ulppggdtpnapnyir\",\"type\":\"pu\"}],\"nextLink\":\"igvpgylg\"}")
            .toObject(ScriptExecutionsList.class);
        Assertions.assertEquals("sgwbnbbeld", model.value().get(0).scriptCmdletId());
        Assertions.assertEquals("zbaliourqha", model.value().get(0).parameters().get(0).name());
        Assertions.assertEquals("hashsfwxosow", model.value().get(0).hiddenParameters().get(0).name());
        Assertions.assertEquals("vbvmeu", model.value().get(0).failureReason());
        Assertions.assertEquals("civyhzceuo", model.value().get(0).timeout());
        Assertions.assertEquals("jrwjueiotwm", model.value().get(0).retention());
        Assertions.assertEquals("rjaw", model.value().get(0).output().get(0));
        Assertions.assertEquals("igvpgylg", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptExecutionsList model = new ScriptExecutionsList().withValue(Arrays.asList(
            new ScriptExecutionInner().withScriptCmdletId("sgwbnbbeld")
                .withParameters(Arrays.asList(new ScriptExecutionParameter().withName("zbaliourqha")))
                .withHiddenParameters(Arrays.asList(new ScriptExecutionParameter().withName("hashsfwxosow"),
                    new ScriptExecutionParameter().withName("xcug"),
                    new ScriptExecutionParameter().withName("cjooxdjebwpucwwf")))
                .withFailureReason("vbvmeu")
                .withTimeout("civyhzceuo")
                .withRetention("jrwjueiotwm")
                .withOutput(Arrays.asList("rjaw", "qwgxhniskx", "bkpyc"))
                .withNamedOutputs(mapOf("auwhvylwzbtdhx", "datawndnhj")),
            new ScriptExecutionInner().withScriptCmdletId("yqbexrmcqibycno")
                .withParameters(Arrays.asList(new ScriptExecutionParameter().withName("nmefqsgzvahapj")))
                .withHiddenParameters(Arrays.asList(new ScriptExecutionParameter().withName("pvgqzcjrvxdjzlm"),
                    new ScriptExecutionParameter().withName("lxkvu")))
                .withFailureReason("hzovawjvzunlut")
                .withTimeout("nnprn")
                .withRetention("peilpjzuaejxdu")
                .withOutput(Arrays.asList("mv", "ekg", "wozuhkf", "bsjyofdx"))
                .withNamedOutputs(mapOf("touwaboekqv", "datasd"))))
            .withNextLink("igvpgylg");
        model = BinaryData.fromObject(model).toObject(ScriptExecutionsList.class);
        Assertions.assertEquals("sgwbnbbeld", model.value().get(0).scriptCmdletId());
        Assertions.assertEquals("zbaliourqha", model.value().get(0).parameters().get(0).name());
        Assertions.assertEquals("hashsfwxosow", model.value().get(0).hiddenParameters().get(0).name());
        Assertions.assertEquals("vbvmeu", model.value().get(0).failureReason());
        Assertions.assertEquals("civyhzceuo", model.value().get(0).timeout());
        Assertions.assertEquals("jrwjueiotwm", model.value().get(0).retention());
        Assertions.assertEquals("rjaw", model.value().get(0).output().get(0));
        Assertions.assertEquals("igvpgylg", model.nextLink());
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
