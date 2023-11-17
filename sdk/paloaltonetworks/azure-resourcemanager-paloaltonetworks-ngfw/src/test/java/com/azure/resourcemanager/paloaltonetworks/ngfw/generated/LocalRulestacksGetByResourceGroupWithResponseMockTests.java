// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ManagedIdentityType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LocalRulestacksGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"panEtag\":\"jiitnspxlzdesygr\",\"panLocation\":\"waiufanra\",\"scope\":\"GLOBAL\",\"associatedSubscriptions\":[\"qfrojsydgrhyd\",\"ygywe\"],\"description\":\"kiecafygzm\",\"defaultMode\":\"NONE\",\"minAppIdVersion\":\"vdsmaklixq\",\"provisioningState\":\"Creating\",\"securityServices\":{\"vulnerabilityProfile\":\"xalybxawoijpo\",\"antiSpywareProfile\":\"blxpkkwjdjodq\",\"antiVirusProfile\":\"kincnremeh\",\"urlFilteringProfile\":\"izhceumoqodkadp\",\"fileBlockingProfile\":\"ibngqladyw\",\"dnsSubscription\":\"whydt\",\"outboundUnTrustCertificate\":\"vvadswzs\",\"outboundTrustCertificate\":\"yemlowuowhlxln\"}},\"identity\":{\"tenantId\":\"mouvbl\",\"principalId\":\"okzkltr\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"dxlwyojbfqz\":{\"clientId\":\"vrfmvlihcvjd\",\"principalId\":\"crjidhftukv\"},\"valqjrhuzgfxo\":{\"clientId\":\"fnjyix\",\"principalId\":\"fratqxmbjroumzz\"}}},\"location\":\"tpusllywp\",\"tags\":{\"pdbollg\":\"otz\",\"owsocnequygdjbo\":\"yfqiuasig\",\"evadrmmwiu\":\"grmtqjk\",\"kxiidisczskoswo\":\"wvcmj\"},\"id\":\"iqazugamxzkr\",\"name\":\"coiisbamnppcce\",\"type\":\"u\"}";

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

        PaloAltoNetworksNgfwManager manager = PaloAltoNetworksNgfwManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LocalRulestackResource response = manager.localRulestacks()
            .getByResourceGroupWithResponse("yxey", "uqi", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("tpusllywp", response.location());
        Assertions.assertEquals("otz", response.tags().get("pdbollg"));
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("vrfmvlihcvjd",
            response.identity().userAssignedIdentities().get("dxlwyojbfqz").clientId());
        Assertions.assertEquals("crjidhftukv",
            response.identity().userAssignedIdentities().get("dxlwyojbfqz").principalId());
        Assertions.assertEquals("jiitnspxlzdesygr", response.panEtag());
        Assertions.assertEquals("waiufanra", response.panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, response.scope());
        Assertions.assertEquals("qfrojsydgrhyd", response.associatedSubscriptions().get(0));
        Assertions.assertEquals("kiecafygzm", response.description());
        Assertions.assertEquals(DefaultMode.NONE, response.defaultMode());
        Assertions.assertEquals("vdsmaklixq", response.minAppIdVersion());
        Assertions.assertEquals("xalybxawoijpo", response.securityServices().vulnerabilityProfile());
        Assertions.assertEquals("blxpkkwjdjodq", response.securityServices().antiSpywareProfile());
        Assertions.assertEquals("kincnremeh", response.securityServices().antiVirusProfile());
        Assertions.assertEquals("izhceumoqodkadp", response.securityServices().urlFilteringProfile());
        Assertions.assertEquals("ibngqladyw", response.securityServices().fileBlockingProfile());
        Assertions.assertEquals("whydt", response.securityServices().dnsSubscription());
        Assertions.assertEquals("vvadswzs", response.securityServices().outboundUnTrustCertificate());
        Assertions.assertEquals("yemlowuowhlxln", response.securityServices().outboundTrustCertificate());
    }
}
