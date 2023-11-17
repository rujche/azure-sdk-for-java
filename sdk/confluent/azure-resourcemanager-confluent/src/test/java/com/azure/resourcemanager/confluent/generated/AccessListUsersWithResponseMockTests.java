// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.AccessListUsersSuccessResponse;
import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AccessListUsersWithResponseMockTests {
    @Test
    public void testListUsersWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"kind\":\"fpel\",\"metadata\":{\"first\":\"pv\",\"last\":\"r\",\"prev\":\"vu\",\"next\":\"raehtwdwrft\",\"total_size\":767551661},\"data\":[{\"kind\":\"cdl\",\"id\":\"shfwpracstwity\",\"metadata\":{\"self\":\"vxccedcp\",\"resource_name\":\"dyodnwzxltj\",\"created_at\":\"nhltiugcxn\",\"updated_at\":\"vwxqibyqunyo\",\"deleted_at\":\"wlmdjrkv\"},\"email\":\"bvfvpdbod\",\"full_name\":\"izsjqlhkrr\",\"auth_type\":\"deibqip\"},{\"kind\":\"ghvxndzwmkrefa\",\"id\":\"jorwkqnyhgbij\",\"metadata\":{\"self\":\"vfxzsjab\",\"resource_name\":\"systawfsdjp\",\"created_at\":\"vp\",\"updated_at\":\"xbkzbzkdvncj\",\"deleted_at\":\"udurgkakmokz\"},\"email\":\"jk\",\"full_name\":\"fhmouwq\",\"auth_type\":\"zrfze\"},{\"kind\":\"ebizikayuh\",\"id\":\"bjbsybb\",\"metadata\":{\"self\":\"vtldgmfpgvmpip\",\"resource_name\":\"ltha\",\"created_at\":\"x\",\"updated_at\":\"mwutwbdsre\",\"deleted_at\":\"drhneuyow\"},\"email\":\"d\",\"full_name\":\"t\",\"auth_type\":\"ib\"},{\"kind\":\"cgpik\",\"id\":\"imejzanl\",\"metadata\":{\"self\":\"iavrm\",\"resource_name\":\"onok\",\"created_at\":\"rjqc\",\"updated_at\":\"gzpfrla\",\"deleted_at\":\"zrnw\"},\"email\":\"indfpwpjyl\",\"full_name\":\"tlhflsjcdhszf\",\"auth_type\":\"fbgofeljagrqmqh\"}]}";

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

        ConfluentManager manager = ConfluentManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        AccessListUsersSuccessResponse response = manager.access()
            .listUsersWithResponse("rgzdwmsweyp", "w",
                new ListAccessRequestModel().withSearchFilters(
                    mapOf("ktt", "gicccnxqhuex", "dtclusiypb", "stvlzywemhzrnc", "ukyhejhzis", "fgytguslfeadcyg")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("fpel", response.kind());
        Assertions.assertEquals("pv", response.metadata().first());
        Assertions.assertEquals("r", response.metadata().last());
        Assertions.assertEquals("vu", response.metadata().prev());
        Assertions.assertEquals("raehtwdwrft", response.metadata().next());
        Assertions.assertEquals(767551661, response.metadata().totalSize());
        Assertions.assertEquals("cdl", response.data().get(0).kind());
        Assertions.assertEquals("shfwpracstwity", response.data().get(0).id());
        Assertions.assertEquals("vxccedcp", response.data().get(0).metadata().self());
        Assertions.assertEquals("dyodnwzxltj", response.data().get(0).metadata().resourceName());
        Assertions.assertEquals("nhltiugcxn", response.data().get(0).metadata().createdAt());
        Assertions.assertEquals("vwxqibyqunyo", response.data().get(0).metadata().updatedAt());
        Assertions.assertEquals("wlmdjrkv", response.data().get(0).metadata().deletedAt());
        Assertions.assertEquals("bvfvpdbod", response.data().get(0).email());
        Assertions.assertEquals("izsjqlhkrr", response.data().get(0).fullName());
        Assertions.assertEquals("deibqip", response.data().get(0).authType());
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
