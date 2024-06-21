// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityReason;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReportsNestedResourceCheckNameAvailabilityWithResponseMockTests {
    @Test
    public void testNestedResourceCheckNameAvailabilityWithResponse() throws Exception {
        String responseStr = "{\"nameAvailable\":true,\"reason\":\"AlreadyExists\",\"message\":\"ukkjqnvbroyla\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppComplianceAutomationManager manager = AppComplianceAutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CheckNameAvailabilityResponse response = manager.reports()
            .nestedResourceCheckNameAvailabilityWithResponse("brjlnacgcckknhxk",
                new CheckNameAvailabilityRequest().withName("v").withType("nrzvuljraaer"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(true, response.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.ALREADY_EXISTS, response.reason());
        Assertions.assertEquals("ukkjqnvbroyla", response.message());
    }
}
