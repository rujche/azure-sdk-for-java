// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.AddDataFlowToDebugSessionResponse;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackage;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackageDebugSettings;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugResource;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import com.azure.resourcemanager.datafactory.models.DataFlowSourceSetting;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.Dataset;
import com.azure.resourcemanager.datafactory.models.DatasetDebugResource;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.LinkedServiceDebugResource;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DataFlowDebugSessionsAddDataFlowWithResponseMockTests {
    @Test
    public void testAddDataFlowWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr = "{\"jobVersion\":\"dryeucl\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DataFactoryManager manager = DataFactoryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        AddDataFlowToDebugSessionResponse response = manager.dataFlowDebugSessions()
            .addDataFlowWithResponse("fhyiaxezpwhczqjo", "vypsgughwo",
                new DataFlowDebugPackage().withSessionId("wzpxlx")
                    .withDataFlow(new DataFlowDebugResource().withName("zu")
                        .withProperties(new DataFlow().withDescription("hkabeo")
                            .withAnnotations(Arrays.asList("datao", "datatckmtqn"))
                            .withFolder(new DataFlowFolder().withName("rqcxhwvzdvujmuk"))))
                    .withDataFlows(Arrays.asList(
                        new DataFlowDebugResource().withName("lupsobqpd").withProperties(
                            new DataFlow().withDescription("qdda").withAnnotations(Arrays.asList("datansaecdcvhxwegd"))
                                .withFolder(new DataFlowFolder().withName("yphv"))),
                        new DataFlowDebugResource().withName("fexkbmodbpc")
                            .withProperties(new DataFlow().withDescription("pwpmyftvejxm")
                                .withAnnotations(Arrays.asList("datanahhpnbvzdf", "dataxjbzwvnxwdu", "datawdvbnpyed"))
                                .withFolder(new DataFlowFolder().withName("rtdaqlitoimta"))),
                        new DataFlowDebugResource().withName("o")
                            .withProperties(new DataFlow().withDescription("yhhzcjzgij")
                                .withAnnotations(Arrays.asList("datalloejshfcuzzu", "datacibvrfkxiixnxx", "datavyizya"))
                                .withFolder(new DataFlowFolder().withName("egijdejscrjc")))))
                    .withDatasets(
                        Arrays
                            .asList(
                                new DatasetDebugResource().withName("fosrwzhmlklocyjp")
                                    .withProperties(new Dataset().withDescription("hcbanzkwaat")
                                        .withStructure("datarbaaqt").withSchema("datawzmdencqym")
                                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("qnli")
                                            .withParameters(mapOf("dm", "dataav", "qej", "datactkwxzrkcvbfeuc",
                                                "cjkhexxn", "datazhteti")))
                                        .withParameters(
                                            mapOf("ekonm", new ParameterSpecification().withType(ParameterType.STRING),
                                                "riqfrrxbssvrh", new ParameterSpecification()
                                                    .withType(ParameterType.FLOAT),
                                                "hszm", new ParameterSpecification().withType(ParameterType.OBJECT),
                                                "f", new ParameterSpecification().withType(ParameterType.FLOAT)))
                                        .withAnnotations(Arrays.asList("datasmicjkiz", "dataqdawmrkryixbbhj"))
                                        .withFolder(new DatasetFolder().withName("lzdjzh"))
                                        .withAdditionalProperties(mapOf("type", "Dataset")))))
                    .withLinkedServices(
                        Arrays
                            .asList(
                                new LinkedServiceDebugResource()
                                    .withName(
                                        "envhlpuobhaomao")
                                    .withProperties(new LinkedService()
                                        .withConnectVia(
                                            new IntegrationRuntimeReference().withReferenceName("vxo").withParameters(
                                                mapOf("mfkiop", "datafkvdmjjiqjvufi", "vc", "datakhbfnhspogx")))
                                        .withDescription("ycrwnay")
                                        .withParameters(mapOf("lfcfeyhnynkmp",
                                            new ParameterSpecification().withType(ParameterType.BOOL), "nvnxsa",
                                            new ParameterSpecification().withType(ParameterType.INT)))
                                        .withAnnotations(Arrays.asList("dataouilbjccjor", "datavr", "datadfgdvifo"))
                                        .withAdditionalProperties(mapOf("type", "LinkedService"))),
                                new LinkedServiceDebugResource().withName("tvp").withProperties(new LinkedService()
                                    .withConnectVia(new IntegrationRuntimeReference().withReferenceName("mwjsvuziog")
                                        .withParameters(mapOf("xswfytnvcjhjrwn", "dataim")))
                                    .withDescription("tgc")
                                    .withParameters(
                                        mapOf("drhxfgswyafd", new ParameterSpecification().withType(ParameterType.INT)))
                                    .withAnnotations(Arrays.asList("datayirjbfwrqivi", "datazoqgutrx"))
                                    .withAdditionalProperties(mapOf("type", "LinkedService")))))
                    .withStaging(new DataFlowStagingInfo()
                        .withLinkedService(new LinkedServiceReference().withReferenceName("iga")
                            .withParameters(mapOf("wmxmdjezhutc", "datajnrlfdqpaf")))
                        .withFolderPath("dataqdchmxr"))
                    .withDebugSettings(new DataFlowDebugPackageDebugSettings()
                        .withSourceSettings(Arrays.asList(
                            new DataFlowSourceSetting().withSourceName("h").withRowLimit(1045259897)
                                .withAdditionalProperties(mapOf()),
                            new DataFlowSourceSetting().withSourceName("ctqnm").withRowLimit(519045355)
                                .withAdditionalProperties(mapOf())))
                        .withParameters(
                            mapOf("v", "datav", "yubxexyydibfqrtp", "dataomjm", "mxlnt", "datapplzieovudvpyba"))
                        .withDatasetParameters("datapbln"))
                    .withAdditionalProperties(mapOf()),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("dryeucl", response.jobVersion());
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
