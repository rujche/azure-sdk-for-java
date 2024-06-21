// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ChangeDataCapture;
import com.azure.resourcemanager.datafactory.models.ChangeDataCaptureFolder;
import com.azure.resourcemanager.datafactory.models.ConnectionType;
import com.azure.resourcemanager.datafactory.models.DataMapperMapping;
import com.azure.resourcemanager.datafactory.models.FrequencyType;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MapperAttributeMapping;
import com.azure.resourcemanager.datafactory.models.MapperAttributeMappings;
import com.azure.resourcemanager.datafactory.models.MapperConnection;
import com.azure.resourcemanager.datafactory.models.MapperConnectionReference;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperPolicy;
import com.azure.resourcemanager.datafactory.models.MapperPolicyRecurrence;
import com.azure.resourcemanager.datafactory.models.MapperSourceConnectionsInfo;
import com.azure.resourcemanager.datafactory.models.MapperTable;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import com.azure.resourcemanager.datafactory.models.MapperTargetConnectionsInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChangeDataCaptureTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChangeDataCapture model = BinaryData.fromString(
            "{\"folder\":{\"name\":\"ftkwq\"},\"description\":\"pmvssehaep\",\"sourceConnectionsInfo\":[{\"sourceEntities\":[{\"name\":\"tczhupeuknijd\",\"properties\":{\"schema\":[{}],\"dslConnectorProperties\":[{},{}]}},{\"name\":\"djfbocyv\",\"properties\":{\"schema\":[{},{},{},{}],\"dslConnectorProperties\":[{},{}]}},{\"name\":\"wikdmh\",\"properties\":{\"schema\":[{},{},{},{}],\"dslConnectorProperties\":[{},{},{}]}}],\"connection\":{\"linkedService\":{\"referenceName\":\"hgauacdixmxufrs\",\"parameters\":{\"kfnozoeoqbvj\":\"dataqg\",\"ay\":\"datavefgwbmqjchntas\",\"wyvf\":\"dataxbulpzealbmqkyo\"}},\"linkedServiceType\":\"btsuahxs\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{\"name\":\"rrscubiwsdrnp\",\"value\":\"datawodiffjxc\"},{\"name\":\"mmuabwi\",\"value\":\"datajogjonmc\"},{\"name\":\"foyzbamwineof\",\"value\":\"datakak\"},{\"name\":\"ldtve\",\"value\":\"dataoclzhz\"}]}}],\"targetConnectionsInfo\":[{\"targetEntities\":[{\"name\":\"xgvttxp\",\"properties\":{\"schema\":[{},{},{},{}],\"dslConnectorProperties\":[{}]}},{\"name\":\"mrdixtreki\",\"properties\":{\"schema\":[{},{}],\"dslConnectorProperties\":[{}]}},{\"name\":\"ruffgllukk\",\"properties\":{\"schema\":[{},{}],\"dslConnectorProperties\":[{},{}]}},{\"name\":\"pqhvmblcouqehbhb\",\"properties\":{\"schema\":[{},{},{}],\"dslConnectorProperties\":[{},{}]}}],\"connection\":{\"linkedService\":{\"referenceName\":\"an\",\"parameters\":{\"xldykalsygaolnjp\":\"datapmbltoormkfql\",\"mr\":\"datanbmjksibjgsjjxxa\",\"yqegx\":\"dataad\",\"inbmh\":\"dataiv\"}},\"linkedServiceType\":\"jijkgqxnhmbke\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{\"name\":\"aan\",\"value\":\"datagiycwkdtaawxwfek\"},{\"name\":\"mrrqmbzmqkratb\",\"value\":\"datawbjsidbirkf\"},{\"name\":\"sokdgoge\",\"value\":\"datajymrhbg\"},{\"name\":\"ozkyewnfnzh\",\"value\":\"dataqo\"}]},\"dataMapperMappings\":[{\"targetEntityName\":\"jkutycyarnr\",\"sourceEntityName\":\"hguabzoghktdp\",\"sourceConnectionReference\":{\"connectionName\":\"hcoeocnhzq\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{},{},{}]},\"sourceDenormalizeInfo\":\"datafyjzptwr\"},{\"targetEntityName\":\"h\",\"sourceEntityName\":\"qinfszpyglqd\",\"sourceConnectionReference\":{\"connectionName\":\"jzralc\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{},{}]},\"sourceDenormalizeInfo\":\"datasjoqcjenkyhfqzvs\"},{\"targetEntityName\":\"fxjelg\",\"sourceEntityName\":\"pzqjhhhq\",\"sourceConnectionReference\":{\"connectionName\":\"yvca\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{},{},{},{}]},\"sourceDenormalizeInfo\":\"datas\"},{\"targetEntityName\":\"usjszlbscm\",\"sourceEntityName\":\"zijiufehgmv\",\"sourceConnectionReference\":{\"connectionName\":\"wyvq\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{},{},{}]},\"sourceDenormalizeInfo\":\"dataiylylyfw\"}],\"relationships\":[\"datatgqztwhghmup\",\"dataxyjtcdxabbujf\"]},{\"targetEntities\":[{\"name\":\"nbbklqpxzucafed\",\"properties\":{\"schema\":[{},{},{}],\"dslConnectorProperties\":[{}]}},{\"name\":\"fwxudgnhg\",\"properties\":{\"schema\":[{},{}],\"dslConnectorProperties\":[{},{},{}]}}],\"connection\":{\"linkedService\":{\"referenceName\":\"nbwgpbemeluclv\",\"parameters\":{\"hqfaqnvz\":\"dataukyrdnqodxahh\",\"emchgavsczuej\":\"dataqgyi\"}},\"linkedServiceType\":\"xptlghwzho\",\"type\":\"linkedservicetype\",\"isInlineDataset\":true,\"commonDslConnectorProperties\":[{\"name\":\"liuhqawmoaiancz\",\"value\":\"dataodrrslblxyd\"}]},\"dataMapperMappings\":[{\"targetEntityName\":\"vvbxiwkgfbqljnq\",\"sourceEntityName\":\"ychocokulehu\",\"sourceConnectionReference\":{\"connectionName\":\"rqffaweyurk\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{}]},\"sourceDenormalizeInfo\":\"dataav\"},{\"targetEntityName\":\"qdbrxmrgc\",\"sourceEntityName\":\"apx\",\"sourceConnectionReference\":{\"connectionName\":\"fjjkbajb\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{},{},{}]},\"sourceDenormalizeInfo\":\"datasioycblevpmcl\"}],\"relationships\":[\"dataxkyxlzgs\",\"datagkzz\"]},{\"targetEntities\":[{\"name\":\"hbzffovwmbjlzqs\",\"properties\":{\"schema\":[{},{}],\"dslConnectorProperties\":[{},{}]}},{\"name\":\"napfdqwowftpt\",\"properties\":{\"schema\":[{}],\"dslConnectorProperties\":[{},{},{}]}}],\"connection\":{\"linkedService\":{\"referenceName\":\"h\",\"parameters\":{\"hvyeldotj\":\"dataqyhleseyq\"}},\"linkedServiceType\":\"kwiswskukjtas\",\"type\":\"linkedservicetype\",\"isInlineDataset\":true,\"commonDslConnectorProperties\":[{\"name\":\"xkdtxfkndlqvtwkn\",\"value\":\"datammbugtywatmqaq\"},{\"name\":\"eatgroeshoy\",\"value\":\"datacbyfqxkf\"},{\"name\":\"ytehqpuvjmvqmt\",\"value\":\"datackygroejnndljdju\"}]},\"dataMapperMappings\":[{\"targetEntityName\":\"req\",\"sourceEntityName\":\"kceysfaqegplw\",\"sourceConnectionReference\":{\"connectionName\":\"hwddkvbxgkq\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{},{},{}]},\"sourceDenormalizeInfo\":\"datadacarvvlfnty\"}],\"relationships\":[\"dataoiwenazerohzrsq\"]}],\"policy\":{\"mode\":\"sxkdnwqapfgsdpc\",\"recurrence\":{\"frequency\":\"Minute\",\"interval\":1226216524}},\"allowVNetOverride\":false,\"status\":\"uuipldq\"}")
            .toObject(ChangeDataCapture.class);
        Assertions.assertEquals("ftkwq", model.folder().name());
        Assertions.assertEquals("pmvssehaep", model.description());
        Assertions.assertEquals("tczhupeuknijd", model.sourceConnectionsInfo().get(0).sourceEntities().get(0).name());
        Assertions.assertEquals("hgauacdixmxufrs",
            model.sourceConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("btsuahxs", model.sourceConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            model.sourceConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false, model.sourceConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("rrscubiwsdrnp",
            model.sourceConnectionsInfo().get(0).connection().commonDslConnectorProperties().get(0).name());
        Assertions.assertEquals("xgvttxp", model.targetConnectionsInfo().get(0).targetEntities().get(0).name());
        Assertions.assertEquals("an",
            model.targetConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("jijkgqxnhmbke", model.targetConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            model.targetConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false, model.targetConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("aan",
            model.targetConnectionsInfo().get(0).connection().commonDslConnectorProperties().get(0).name());
        Assertions.assertEquals("jkutycyarnr",
            model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).targetEntityName());
        Assertions.assertEquals("hguabzoghktdp",
            model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).sourceEntityName());
        Assertions.assertEquals("hcoeocnhzq",
            model.targetConnectionsInfo()
                .get(0)
                .dataMapperMappings()
                .get(0)
                .sourceConnectionReference()
                .connectionName());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).sourceConnectionReference().type());
        Assertions.assertEquals("sxkdnwqapfgsdpc", model.policy().mode());
        Assertions.assertEquals(FrequencyType.MINUTE, model.policy().recurrence().frequency());
        Assertions.assertEquals(1226216524, model.policy().recurrence().interval());
        Assertions.assertEquals(false, model.allowVNetOverride());
        Assertions.assertEquals("uuipldq", model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChangeDataCapture model
            = new ChangeDataCapture().withFolder(new ChangeDataCaptureFolder().withName("ftkwq"))
                .withDescription("pmvssehaep")
                .withSourceConnectionsInfo(
                    Arrays.asList(new MapperSourceConnectionsInfo()
                        .withSourceEntities(Arrays.asList(
                            new MapperTable().withName("tczhupeuknijd")
                                .withSchema(Arrays.asList(new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties(),
                                    new MapperDslConnectorProperties())),
                            new MapperTable().withName("djfbocyv")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema(),
                                    new MapperTableSchema(), new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties(),
                                    new MapperDslConnectorProperties())),
                            new MapperTable().withName("wikdmh")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema(),
                                    new MapperTableSchema(), new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties(),
                                    new MapperDslConnectorProperties(), new MapperDslConnectorProperties()))))
                        .withConnection(new MapperConnection()
                            .withLinkedService(new LinkedServiceReference().withReferenceName("hgauacdixmxufrs")
                                .withParameters(mapOf("kfnozoeoqbvj", "dataqg", "ay", "datavefgwbmqjchntas", "wyvf",
                                    "dataxbulpzealbmqkyo")))
                            .withLinkedServiceType("btsuahxs")
                            .withType(ConnectionType.LINKEDSERVICETYPE)
                            .withIsInlineDataset(false)
                            .withCommonDslConnectorProperties(Arrays.asList(
                                new MapperDslConnectorProperties().withName("rrscubiwsdrnp").withValue("datawodiffjxc"),
                                new MapperDslConnectorProperties().withName("mmuabwi").withValue("datajogjonmc"),
                                new MapperDslConnectorProperties().withName("foyzbamwineof")
                                    .withValue("datakak"),
                                new MapperDslConnectorProperties().withName("ldtve").withValue("dataoclzhz"))))))
                .withTargetConnectionsInfo(Arrays.asList(
                    new MapperTargetConnectionsInfo()
                        .withTargetEntities(Arrays.asList(
                            new MapperTable().withName("xgvttxp")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema(),
                                    new MapperTableSchema(), new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties())),
                            new MapperTable().withName("mrdixtreki")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties())),
                            new MapperTable().withName("ruffgllukk")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays
                                    .asList(new MapperDslConnectorProperties(), new MapperDslConnectorProperties())),
                            new MapperTable().withName("pqhvmblcouqehbhb")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema(),
                                    new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties(),
                                    new MapperDslConnectorProperties()))))
                        .withConnection(new MapperConnection()
                            .withLinkedService(new LinkedServiceReference().withReferenceName("an")
                                .withParameters(mapOf("xldykalsygaolnjp", "datapmbltoormkfql", "mr",
                                    "datanbmjksibjgsjjxxa", "yqegx", "dataad", "inbmh", "dataiv")))
                            .withLinkedServiceType("jijkgqxnhmbke")
                            .withType(ConnectionType.LINKEDSERVICETYPE)
                            .withIsInlineDataset(false)
                            .withCommonDslConnectorProperties(Arrays.asList(
                                new MapperDslConnectorProperties().withName("aan").withValue("datagiycwkdtaawxwfek"),
                                new MapperDslConnectorProperties().withName("mrrqmbzmqkratb")
                                    .withValue("datawbjsidbirkf"),
                                new MapperDslConnectorProperties().withName("sokdgoge")
                                    .withValue("datajymrhbg"),
                                new MapperDslConnectorProperties().withName("ozkyewnfnzh").withValue("dataqo"))))
                        .withDataMapperMappings(Arrays.asList(
                            new DataMapperMapping().withTargetEntityName("jkutycyarnr")
                                .withSourceEntityName("hguabzoghktdp")
                                .withSourceConnectionReference(
                                    new MapperConnectionReference().withConnectionName("hcoeocnhzq")
                                        .withType(ConnectionType.LINKEDSERVICETYPE))
                                .withAttributeMappingInfo(new MapperAttributeMappings().withAttributeMappings(
                                    Arrays.asList(new MapperAttributeMapping(), new MapperAttributeMapping(),
                                        new MapperAttributeMapping())))
                                .withSourceDenormalizeInfo("datafyjzptwr"),
                            new DataMapperMapping().withTargetEntityName("h")
                                .withSourceEntityName("qinfszpyglqd")
                                .withSourceConnectionReference(
                                    new MapperConnectionReference().withConnectionName("jzralc")
                                        .withType(ConnectionType.LINKEDSERVICETYPE))
                                .withAttributeMappingInfo(new MapperAttributeMappings()
                                    .withAttributeMappings(
                                        Arrays.asList(new MapperAttributeMapping(), new MapperAttributeMapping())))
                                .withSourceDenormalizeInfo("datasjoqcjenkyhfqzvs"),
                            new DataMapperMapping().withTargetEntityName("fxjelg")
                                .withSourceEntityName("pzqjhhhq")
                                .withSourceConnectionReference(
                                    new MapperConnectionReference().withConnectionName("yvca")
                                        .withType(ConnectionType.LINKEDSERVICETYPE))
                                .withAttributeMappingInfo(new MapperAttributeMappings().withAttributeMappings(Arrays
                                    .asList(new MapperAttributeMapping(), new MapperAttributeMapping(),
                                        new MapperAttributeMapping(), new MapperAttributeMapping())))
                                .withSourceDenormalizeInfo("datas"),
                            new DataMapperMapping().withTargetEntityName("usjszlbscm")
                                .withSourceEntityName("zijiufehgmv")
                                .withSourceConnectionReference(
                                    new MapperConnectionReference().withConnectionName("wyvq")
                                        .withType(ConnectionType.LINKEDSERVICETYPE))
                                .withAttributeMappingInfo(
                                    new MapperAttributeMappings()
                                        .withAttributeMappings(Arrays.asList(new MapperAttributeMapping(),
                                            new MapperAttributeMapping(), new MapperAttributeMapping())))
                                .withSourceDenormalizeInfo("dataiylylyfw")))
                        .withRelationships(Arrays.asList("datatgqztwhghmup", "dataxyjtcdxabbujf")),
                    new MapperTargetConnectionsInfo()
                        .withTargetEntities(Arrays.asList(
                            new MapperTable()
                                .withName("nbbklqpxzucafed")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema(),
                                    new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties())),
                            new MapperTable().withName("fwxudgnhg")
                                .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema()))
                                .withDslConnectorProperties(Arrays
                                    .asList(
                                        new MapperDslConnectorProperties(), new MapperDslConnectorProperties(),
                                        new MapperDslConnectorProperties()))))
                        .withConnection(new MapperConnection()
                            .withLinkedService(new LinkedServiceReference().withReferenceName("nbwgpbemeluclv")
                                .withParameters(mapOf("hqfaqnvz", "dataukyrdnqodxahh", "emchgavsczuej", "dataqgyi")))
                            .withLinkedServiceType("xptlghwzho")
                            .withType(ConnectionType.LINKEDSERVICETYPE)
                            .withIsInlineDataset(true)
                            .withCommonDslConnectorProperties(
                                Arrays.asList(new MapperDslConnectorProperties().withName("liuhqawmoaiancz")
                                    .withValue("dataodrrslblxyd"))))
                        .withDataMapperMappings(
                            Arrays.asList(
                                new DataMapperMapping().withTargetEntityName("vvbxiwkgfbqljnq")
                                    .withSourceEntityName("ychocokulehu")
                                    .withSourceConnectionReference(
                                        new MapperConnectionReference().withConnectionName("rqffaweyurk")
                                            .withType(ConnectionType.LINKEDSERVICETYPE))
                                    .withAttributeMappingInfo(new MapperAttributeMappings()
                                        .withAttributeMappings(Arrays.asList(new MapperAttributeMapping())))
                                    .withSourceDenormalizeInfo("dataav"),
                                new DataMapperMapping().withTargetEntityName("qdbrxmrgc")
                                    .withSourceEntityName("apx")
                                    .withSourceConnectionReference(
                                        new MapperConnectionReference().withConnectionName("fjjkbajb")
                                            .withType(ConnectionType.LINKEDSERVICETYPE))
                                    .withAttributeMappingInfo(new MapperAttributeMappings()
                                        .withAttributeMappings(Arrays.asList(new MapperAttributeMapping(),
                                            new MapperAttributeMapping(), new MapperAttributeMapping())))
                                    .withSourceDenormalizeInfo("datasioycblevpmcl")))
                        .withRelationships(Arrays.asList("dataxkyxlzgs", "datagkzz")),
                    new MapperTargetConnectionsInfo()
                        .withTargetEntities(
                            Arrays.asList(
                                new MapperTable().withName("hbzffovwmbjlzqs")
                                    .withSchema(Arrays.asList(new MapperTableSchema(), new MapperTableSchema()))
                                    .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties(),
                                        new MapperDslConnectorProperties())),
                                new MapperTable()
                                    .withName("napfdqwowftpt")
                                    .withSchema(Arrays.asList(new MapperTableSchema()))
                                    .withDslConnectorProperties(Arrays.asList(new MapperDslConnectorProperties(),
                                        new MapperDslConnectorProperties(), new MapperDslConnectorProperties()))))
                        .withConnection(new MapperConnection()
                            .withLinkedService(new LinkedServiceReference().withReferenceName("h")
                                .withParameters(mapOf("hvyeldotj", "dataqyhleseyq")))
                            .withLinkedServiceType("kwiswskukjtas")
                            .withType(ConnectionType.LINKEDSERVICETYPE)
                            .withIsInlineDataset(true)
                            .withCommonDslConnectorProperties(Arrays.asList(
                                new MapperDslConnectorProperties().withName("xkdtxfkndlqvtwkn")
                                    .withValue("datammbugtywatmqaq"),
                                new MapperDslConnectorProperties().withName("eatgroeshoy").withValue("datacbyfqxkf"),
                                new MapperDslConnectorProperties()
                                    .withName("ytehqpuvjmvqmt")
                                    .withValue("datackygroejnndljdju"))))
                        .withDataMapperMappings(Arrays.asList(new DataMapperMapping().withTargetEntityName("req")
                            .withSourceEntityName("kceysfaqegplw")
                            .withSourceConnectionReference(
                                new MapperConnectionReference().withConnectionName("hwddkvbxgkq")
                                    .withType(ConnectionType.LINKEDSERVICETYPE))
                            .withAttributeMappingInfo(new MapperAttributeMappings()
                                .withAttributeMappings(Arrays.asList(new MapperAttributeMapping(),
                                    new MapperAttributeMapping(), new MapperAttributeMapping())))
                            .withSourceDenormalizeInfo("datadacarvvlfnty")))
                        .withRelationships(Arrays.asList("dataoiwenazerohzrsq"))))
                .withPolicy(new MapperPolicy().withMode("sxkdnwqapfgsdpc")
                    .withRecurrence(
                        new MapperPolicyRecurrence().withFrequency(FrequencyType.MINUTE).withInterval(1226216524)))
                .withAllowVNetOverride(false)
                .withStatus("uuipldq");
        model = BinaryData.fromObject(model).toObject(ChangeDataCapture.class);
        Assertions.assertEquals("ftkwq", model.folder().name());
        Assertions.assertEquals("pmvssehaep", model.description());
        Assertions.assertEquals("tczhupeuknijd", model.sourceConnectionsInfo().get(0).sourceEntities().get(0).name());
        Assertions.assertEquals("hgauacdixmxufrs",
            model.sourceConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("btsuahxs", model.sourceConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            model.sourceConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false, model.sourceConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("rrscubiwsdrnp",
            model.sourceConnectionsInfo().get(0).connection().commonDslConnectorProperties().get(0).name());
        Assertions.assertEquals("xgvttxp", model.targetConnectionsInfo().get(0).targetEntities().get(0).name());
        Assertions.assertEquals("an",
            model.targetConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("jijkgqxnhmbke", model.targetConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            model.targetConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false, model.targetConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("aan",
            model.targetConnectionsInfo().get(0).connection().commonDslConnectorProperties().get(0).name());
        Assertions.assertEquals("jkutycyarnr",
            model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).targetEntityName());
        Assertions.assertEquals("hguabzoghktdp",
            model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).sourceEntityName());
        Assertions.assertEquals("hcoeocnhzq",
            model.targetConnectionsInfo()
                .get(0)
                .dataMapperMappings()
                .get(0)
                .sourceConnectionReference()
                .connectionName());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).sourceConnectionReference().type());
        Assertions.assertEquals("sxkdnwqapfgsdpc", model.policy().mode());
        Assertions.assertEquals(FrequencyType.MINUTE, model.policy().recurrence().frequency());
        Assertions.assertEquals(1226216524, model.policy().recurrence().interval());
        Assertions.assertEquals(false, model.allowVNetOverride());
        Assertions.assertEquals("uuipldq", model.status());
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
