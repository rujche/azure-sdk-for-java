// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.storagemover.StorageMoverManager;
import com.azure.resourcemanager.storagemover.models.JobRunResourceId;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JobDefinitionsStartJobWithResponseMockTests {
    @Test
    public void testStartJobWithResponse() throws Exception {
        String responseStr = "{\"jobRunResourceId\":\"wacf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StorageMoverManager manager = StorageMoverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        JobRunResourceId response = manager.jobDefinitions()
            .startJobWithResponse("zx", "lvithhqzonosgg", "hcohfwdsjnk", "ljuti", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
