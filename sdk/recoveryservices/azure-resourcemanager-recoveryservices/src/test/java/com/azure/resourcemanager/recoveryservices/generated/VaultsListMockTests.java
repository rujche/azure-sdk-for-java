// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.models.InfrastructureEncryptionState;
import com.azure.resourcemanager.recoveryservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.recoveryservices.models.ResourceIdentityType;
import com.azure.resourcemanager.recoveryservices.models.SkuName;
import com.azure.resourcemanager.recoveryservices.models.Vault;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VaultsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"identity\":{\"principalId\":\"qjhhkxbpv\",\"tenantId\":\"mjh\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"u\",\"upgradeDetails\":{\"operationId\":\"krtswbxqz\",\"startTimeUtc\":\"2021-10-26T13:42:02Z\",\"lastUpdatedTimeUtc\":\"2021-01-16T06:43:01Z\",\"endTimeUtc\":\"2021-04-01T03:47:56Z\",\"status\":\"Unknown\",\"message\":\"dxxiv\",\"triggerType\":\"ForcedUpgrade\",\"upgradedResourceId\":\"cqaqtdoqmcbx\",\"previousResourceId\":\"vxysl\"},\"privateEndpointConnections\":[],\"privateEndpointStateForBackup\":\"Enabled\",\"privateEndpointStateForSiteRecovery\":\"None\",\"encryption\":{\"infrastructureEncryption\":\"Enabled\"},\"moveDetails\":{\"operationId\":\"mpew\",\"startTimeUtc\":\"2021-04-28T11:36:58Z\",\"completionTimeUtc\":\"2021-08-04T10:31:47Z\",\"sourceResourceId\":\"vrnsvshqjohxc\",\"targetResourceId\":\"bfovasrruvwbhsq\"},\"moveState\":\"CriticalFailure\",\"backupStorageVersion\":\"V1\",\"publicNetworkAccess\":\"Enabled\",\"monitoringSettings\":{},\"redundancySettings\":{\"standardTierStorageRedundancy\":\"GeoRedundant\",\"crossRegionRestore\":\"Enabled\"},\"securitySettings\":{}},\"sku\":{\"name\":\"Standard\",\"tier\":\"fdtwssotft\",\"family\":\"jzbexilzznfq\",\"size\":\"vwpm\",\"capacity\":\"aruoujmkcjhwqyt\"},\"etag\":\"bnw\",\"location\":\"ewgdrjervn\",\"tags\":{\"hin\":\"qp\",\"nzdndslgna\":\"oygmift\"},\"id\":\"qig\",\"name\":\"nduhavhqlkthum\",\"type\":\"qolbgyc\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        RecoveryServicesManager manager =
            RecoveryServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Vault> response = manager.vaults().list(Context.NONE);

        Assertions.assertEquals("ewgdrjervn", response.iterator().next().location());
        Assertions.assertEquals("qp", response.iterator().next().tags().get("hin"));
        Assertions.assertEquals(ResourceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions
            .assertEquals(
                InfrastructureEncryptionState.ENABLED,
                response.iterator().next().properties().encryption().infrastructureEncryption());
        Assertions
            .assertEquals(PublicNetworkAccess.ENABLED, response.iterator().next().properties().publicNetworkAccess());
        Assertions.assertEquals(SkuName.STANDARD, response.iterator().next().sku().name());
        Assertions.assertEquals("fdtwssotft", response.iterator().next().sku().tier());
        Assertions.assertEquals("jzbexilzznfq", response.iterator().next().sku().family());
        Assertions.assertEquals("vwpm", response.iterator().next().sku().size());
        Assertions.assertEquals("aruoujmkcjhwqyt", response.iterator().next().sku().capacity());
        Assertions.assertEquals("bnw", response.iterator().next().etag());
    }
}
