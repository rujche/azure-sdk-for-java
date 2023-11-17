// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.ai.documentintelligence.models.CopyAuthorization;
import com.azure.ai.documentintelligence.models.DocumentClassifierDetails;
import com.azure.ai.documentintelligence.models.DocumentModelDetails;
import com.azure.ai.documentintelligence.models.ResourceDetails;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.HttpClient;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.models.BodilessMatcher;
import com.azure.core.test.utils.MockTokenCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.time.Duration;
import java.util.Collections;
import java.util.function.Consumer;

import static com.azure.ai.documentintelligence.TestUtils.INVALID_KEY;
import static com.azure.ai.documentintelligence.TestUtils.getTestProxySanitizers;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DocumentAdministrationClientTestBase extends TestProxyTestBase {
    Duration durationTestMode;

    /**
     * Use duration of nearly zero value for PLAYBACK test mode, otherwise, use default duration value for LIVE mode.
     */
    @Override
    protected void beforeTest() {
        durationTestMode = interceptorManager.isPlaybackMode()
            ? TestUtils.ONE_NANO_DURATION : TestUtils.DEFAULT_POLL_INTERVAL;
    }

    DocumentIntelligenceAdministrationClientBuilder getModelAdminClientBuilder(HttpClient httpClient,
                                                                               DocumentIntelligenceServiceVersion serviceVersion,
                                                                               boolean useKeyCredential) {
        String endpoint = getEndpoint();
        DocumentIntelligenceAdministrationClientBuilder builder = new DocumentIntelligenceAdministrationClientBuilder()
            .endpoint(endpoint)
            .httpClient(interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient)
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .serviceVersion(serviceVersion);

        if (useKeyCredential) {
            if (interceptorManager.isPlaybackMode()) {
                builder.credential(new AzureKeyCredential(INVALID_KEY));
                setMatchers();
            } else if (interceptorManager.isRecordMode()) {
                builder.credential(new AzureKeyCredential(TestUtils.AZURE_FORM_RECOGNIZER_API_KEY_CONFIGURATION));
                builder.addPolicy(interceptorManager.getRecordPolicy());
            } else if (interceptorManager.isLiveMode()) {
                builder.credential(new AzureKeyCredential(TestUtils.AZURE_FORM_RECOGNIZER_API_KEY_CONFIGURATION));
            }
        } else {
            if (interceptorManager.isPlaybackMode()) {
                builder.credential(new MockTokenCredential());
                setMatchers();
            } else if (interceptorManager.isRecordMode()) {
                builder.credential(new DefaultAzureCredentialBuilder().build());
                builder.addPolicy(interceptorManager.getRecordPolicy());
            } else if (interceptorManager.isLiveMode()) {
                builder.credential(new DefaultAzureCredentialBuilder().build());
            }
        }
        if (!interceptorManager.isLiveMode()) {
            interceptorManager.addSanitizers(getTestProxySanitizers());
        }
        return builder;
    }
    private void setMatchers() {
        interceptorManager.addMatchers(Collections.singletonList(new BodilessMatcher()));
    }

    static void validateCopyAuthorizationResult(CopyAuthorization actualResult) {
        assertNotNull(actualResult.getTargetModelId());
        assertNotNull(actualResult.getExpirationDateTime());
        assertNotNull(actualResult.getTargetResourceRegion());
        assertNotNull(actualResult.getTargetResourceId());
        assertNotNull(actualResult.getTargetResourceId());
    }

    static void validateResourceInfo(ResourceDetails actualResourceDetails) {
        assertNotNull(actualResourceDetails.getCustomDocumentModels().getLimit());
        assertNotNull(actualResourceDetails.getCustomNeuralDocumentModelBuilds().getQuota());
    }

    void validateDocumentModelData(DocumentModelDetails actualCustomModel) {
        assertNotNull(actualCustomModel.getCreatedDateTime());
        assertNotNull(actualCustomModel.getModelId());

        actualCustomModel.getDocTypes().forEach((s, docTypeInfo) -> assertNotNull(docTypeInfo.getFieldSchema()));
    }

    void validateClassifierModelData(DocumentClassifierDetails documentClassifierDetails) {
        assertNotNull(documentClassifierDetails.getCreatedDateTime());
        assertNotNull(documentClassifierDetails.getClassifierId());
    }

    void buildModelRunner(Consumer<String> testRunner) {
        TestUtils.getTrainingDataContainerHelper(testRunner, interceptorManager.isPlaybackMode());
    }

    void multipageTrainingRunner(Consumer<String> testRunner) {
        TestUtils.getMultipageTrainingContainerHelper(testRunner, interceptorManager.isPlaybackMode());
    }

    void beginClassifierRunner(Consumer<String> testRunner) {
        TestUtils.getClassifierTrainingDataContainerHelper(testRunner, interceptorManager.isPlaybackMode());
    }

    void selectionMarkTrainingRunner(Consumer<String> testRunner) {
        TestUtils.getSelectionMarkTrainingContainerHelper(testRunner, interceptorManager.isPlaybackMode());
    }

    private String getEndpoint() {
        return interceptorManager.isPlaybackMode()
            ? "https://localhost:8080"
            : TestUtils.AZURE_FORM_RECOGNIZER_ENDPOINT_CONFIGURATION;
    }

}
