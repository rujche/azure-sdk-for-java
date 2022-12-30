// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ArtifactManifestProperties;
import com.azure.containers.containerregistry.models.ArtifactTagOrder;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;
import com.azure.core.util.Context;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.TestUtils.DIGEST_UNKNOWN;
import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.LATEST_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.PAGESIZE_2;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_ENDPOINT;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_ENDPOINT_PLAYBACK;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_NAME;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_NAME_PLAYBACK;
import static com.azure.containers.containerregistry.TestUtils.TAG_UNKNOWN;
import static com.azure.containers.containerregistry.TestUtils.V1_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V2_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V3_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V4_TAG_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistryArtifactAsyncIntegrationTests extends ContainerRegistryClientsTestBase {
    private RegistryArtifactAsync asyncClient;
    private RegistryArtifact client;

    @BeforeEach
    void beforeEach() {
        TestUtils.importImage(
            getTestMode(),
            HELLO_WORLD_REPOSITORY_NAME,
            Arrays.asList(
                LATEST_TAG_NAME,
                V1_TAG_NAME,
                V2_TAG_NAME,
                V3_TAG_NAME,
                V4_TAG_NAME));
    }

    private String getDigest(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient)
            .buildClient()
            .getArtifact(HELLO_WORLD_REPOSITORY_NAME, LATEST_TAG_NAME).getManifestProperties().getDigest();
    }

    private RegistryArtifactAsync getRegistryArtifactAsyncClient(HttpClient httpClient, String digest) {
        return getContainerRegistryBuilder(httpClient)
            .buildAsyncClient()
            .getArtifact(HELLO_WORLD_REPOSITORY_NAME, digest);
    }

    private RegistryArtifact getRegistryArtifactClient(HttpClient httpClient, String digest) {
        return getContainerRegistryBuilder(httpClient)
            .buildClient()
            .getArtifact(HELLO_WORLD_REPOSITORY_NAME, digest);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    @Disabled
    public void getMultiArchitectureImagePropertiesWithResponse(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        Mono<Response<ArtifactManifestProperties>> safeTestRegistyArtifacts = asyncClient.getManifestPropertiesWithResponse()
            .flatMap(res -> {
                validateManifestProperties(res, true, false);
                return Mono.just(res);
            }).flatMap(res -> getRegistryArtifactAsyncClient(httpClient, res.getValue().getDigest()).getManifestPropertiesWithResponse())
            .flatMap(res -> {
                validateManifestProperties(res, true, false);
                return Mono.just(getChildArtifactDigest(res.getValue().getRelatedArtifacts()));
            }).flatMap(res -> getRegistryArtifactAsyncClient(httpClient, res).getManifestPropertiesWithResponse());

        StepVerifier.create(safeTestRegistyArtifacts)
            .assertNext(res -> validateManifestProperties(res, false, true))
            .verifyComplete();

        StepVerifier.create(asyncClient.getManifestProperties())
            .assertNext(res -> validateManifestProperties(res, true, false))
            .verifyComplete();

        validateManifestProperties(client.getManifestPropertiesWithResponse(Context.NONE), true, false);
        validateManifestProperties(client.getManifestProperties(), true, false);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getMultiArchitectureImagePropertiesWithResponseThrows(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, DIGEST_UNKNOWN);
        client = getRegistryArtifactClient(httpClient, DIGEST_UNKNOWN);

        StepVerifier.create(asyncClient.getManifestPropertiesWithResponse())
            .verifyError(ResourceNotFoundException.class);

        StepVerifier.create(asyncClient.getManifestProperties())
            .verifyError(ResourceNotFoundException.class);

        assertThrows(ResourceNotFoundException.class, () -> client.getManifestProperties());
        assertThrows(ResourceNotFoundException.class, () -> client.getManifestPropertiesWithResponse(Context.NONE));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listTagProperties(HttpClient httpClient) {
        String digest = getDigest(httpClient);

        asyncClient = getRegistryArtifactAsyncClient(httpClient, digest);
        client = getRegistryArtifactClient(httpClient, digest);
        StepVerifier.create(asyncClient.listTagProperties())
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(tags -> {
                validateListTags(tags);
                return true;
            })
            .verifyComplete();
        validateListTags(client.listTagProperties().stream().collect(Collectors.toList()));

        // Now do the same via tag.
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);
        StepVerifier.create(asyncClient.listTagProperties())
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(tags -> {
                validateListTags(tags);
                return true;
            })
            .verifyComplete();
        validateListTags(client.listTagProperties().stream().collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listTagPropertiesWithPageSize(HttpClient httpClient) {

        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.listTagProperties().byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> validateListTags(pagedResList, false))
            .verifyComplete();

        validateListTags(client.listTagProperties().streamByPage().collect(Collectors.toList()), false);
    }


    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listTagPropertiesWithInvalidPageSize(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.listTagProperties().byPage(-1))
            .verifyError(IllegalArgumentException.class);

        assertThrows(IllegalArgumentException.class, () -> client.listTagProperties().streamByPage(-1).collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listTagPropertiesWithPageSizeAndOrderBy(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.listTagProperties(ArtifactTagOrder.LAST_UPDATED_ON_ASCENDING).byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> validateListTags(pagedResList, true))
            .verifyComplete();

        validateListTags(client.listTagProperties(ArtifactTagOrder.LAST_UPDATED_ON_ASCENDING, Context.NONE).streamByPage(PAGESIZE_2).collect(Collectors.toList()), true);
        validateListTags(client.listTagProperties(ArtifactTagOrder.LAST_UPDATED_ON_ASCENDING).streamByPage(PAGESIZE_2).collect(Collectors.toList()), true);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listTagPropertiesWithPageSizeNoOrderBy(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.listTagProperties(ArtifactTagOrder.NONE).byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> validateListTags(pagedResList, false))
            .verifyComplete();

        validateListTags(client.listTagProperties(ArtifactTagOrder.NONE, Context.NONE).streamByPage(PAGESIZE_2).collect(Collectors.toList()), false);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getTagProperties(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.getTagPropertiesWithResponse(V1_TAG_NAME))
            .assertNext(res -> validateTagProperties(res, V1_TAG_NAME))
            .verifyComplete();

        StepVerifier.create(asyncClient.getTagProperties(LATEST_TAG_NAME))
            .assertNext(res -> validateTagProperties(res, LATEST_TAG_NAME))
            .verifyComplete();

        validateTagProperties(client.getTagProperties(V1_TAG_NAME), V1_TAG_NAME);
        validateTagProperties(client.getTagPropertiesWithResponse(LATEST_TAG_NAME, Context.NONE), LATEST_TAG_NAME);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getTagPropertiesWithResponseThrows(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.getTagPropertiesWithResponse(TAG_UNKNOWN))
            .verifyError(ResourceNotFoundException.class);

        StepVerifier.create(asyncClient.getTagProperties(TAG_UNKNOWN))
            .verifyError(ResourceNotFoundException.class);

        assertThrows(ResourceNotFoundException.class, () -> client.getTagProperties(TAG_UNKNOWN));
        assertThrows(ResourceNotFoundException.class, () -> client.getTagPropertiesWithResponse(TAG_UNKNOWN, Context.NONE));

        assertThrows(NullPointerException.class, () -> client.getTagProperties(null));
        assertThrows(NullPointerException.class, () -> client.getTagPropertiesWithResponse(null, Context.NONE));
        assertThrows(IllegalArgumentException.class, () -> client.getTagProperties(""));
        assertThrows(IllegalArgumentException.class, () -> client.getTagPropertiesWithResponse("", Context.NONE));

        StepVerifier.create(asyncClient.getTagPropertiesWithResponse(""))
            .verifyError(IllegalArgumentException.class);

        StepVerifier.create(asyncClient.getTagProperties(""))
            .verifyError(IllegalArgumentException.class);

        StepVerifier.create(asyncClient.getTagPropertiesWithResponse(null))
            .verifyError(NullPointerException.class);

        StepVerifier.create(asyncClient.getTagProperties(null))
            .verifyError(NullPointerException.class);

    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void convenienceMethods(HttpClient httpClient) {
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);

        String registryEndpoint = REGISTRY_ENDPOINT;
        String registryName = REGISTRY_NAME;
        if (getTestMode() == TestMode.PLAYBACK) {
            registryEndpoint = REGISTRY_ENDPOINT_PLAYBACK;
            registryName = REGISTRY_NAME_PLAYBACK;
        }

        assertEquals(HELLO_WORLD_REPOSITORY_NAME, asyncClient.getRepositoryName());
        assertEquals(HELLO_WORLD_REPOSITORY_NAME, client.getRepositoryName());

        assertTrue(asyncClient.getFullyQualifiedReference().startsWith(registryName));
        assertTrue(asyncClient.getFullyQualifiedReference().endsWith(LATEST_TAG_NAME));
        assertTrue(client.getFullyQualifiedReference().startsWith(registryName));
        assertTrue(client.getFullyQualifiedReference().endsWith(LATEST_TAG_NAME));

        assertEquals(registryEndpoint, asyncClient.getRegistryEndpoint());
        assertEquals(registryEndpoint, client.getRegistryEndpoint());
    }
}

