// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.AuthenticationType;
import com.azure.resourcemanager.mobilenetwork.models.BillingSku;
import com.azure.resourcemanager.mobilenetwork.models.CoreNetworkType;
import com.azure.resourcemanager.mobilenetwork.models.DesiredInstallationState;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlane;
import com.azure.resourcemanager.mobilenetwork.models.PlatformType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PacketCoreControlPlanesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleted\",\"installation\":{\"desiredState\":\"Installed\",\"state\":\"Updating\",\"reinstallRequired\":\"NotRequired\",\"reasons\":[\"UserPlaneAccessVirtualIpv4AddressesHasChanged\",\"UserPlaneAccessInterfaceHasChanged\"],\"operation\":{\"id\":\"m\"}},\"sites\":[{\"id\":\"f\"},{\"id\":\"lfmu\"},{\"id\":\"apckccrrvw\"},{\"id\":\"yoxoy\"}],\"platform\":{\"type\":\"3P-AZURE-STACK-HCI\",\"azureStackEdgeDevice\":{\"id\":\"phaimmoi\"},\"azureStackEdgeDevices\":[{\"id\":\"boshbragapyyrmfs\"},{\"id\":\"bpav\"}],\"azureStackHciCluster\":{\"id\":\"pfppd\"},\"connectedCluster\":{\"id\":\"nupgahxku\"},\"customLocation\":{\"id\":\"sjcaacfdmmcpugm\"}},\"coreNetworkTechnology\":\"5GC\",\"version\":\"pvufhbze\",\"installedVersion\":\"whoqhnlbqnbldxe\",\"rollbackVersion\":\"lgsc\",\"controlPlaneAccessInterface\":{\"name\":\"ri\",\"ipv4Address\":\"rsrrmoucsofldp\",\"ipv4Subnet\":\"iyfc\",\"ipv4Gateway\":\"beolh\"},\"controlPlaneAccessVirtualIpv4Addresses\":[\"vbmxuqibsx\",\"kcudfbsfarfsiowl\",\"jxnqp\",\"wgfstmhqykizm\"],\"sku\":\"G2\",\"ueMtu\":930902009,\"localDiagnosticsAccess\":{\"authenticationType\":\"Password\",\"httpsServerCertificate\":{\"certificateUrl\":\"fcluqvo\",\"provisioning\":{\"state\":\"NotProvisioned\",\"reason\":\"im\"}}},\"diagnosticsUpload\":{\"storageAccountContainerUrl\":\"vwg\"},\"eventHub\":{\"id\":\"wpbmzgwesydsxwef\",\"reportingInterval\":799767919},\"signaling\":{\"nasReroute\":{\"macroMmeGroupId\":1456843419}},\"interopSettings\":\"datapwndyqlea\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"hlowkx\":{\"principalId\":\"ac27ebc1-d10f-4d58-a29b-db568d53c45c\",\"clientId\":\"762b8217-0501-42d4-9ecb-13152373f1ba\"},\"br\":{\"principalId\":\"6b8d85a4-7927-4662-8133-9fabb93a94d3\",\"clientId\":\"ab790f53-4860-4509-92c0-8028300e5ffb\"},\"mzsyzfhotl\":{\"principalId\":\"924dcd90-ed35-4071-b3a3-9ecf42cfe02c\",\"clientId\":\"aa69bca4-16ec-41b3-9ee1-7562a833e71a\"},\"cyychunsjlp\":{\"principalId\":\"4612a64e-10da-4180-acbe-28f0b4d7a4b0\",\"clientId\":\"4efb5923-42b6-4033-8ead-a506433de7cf\"}}},\"location\":\"twszhvvuic\",\"tags\":{\"dpyflubhv\":\"trrmhwrb\",\"lw\":\"glrocuy\",\"ooclutnp\":\"hmem\",\"ujxsglhsr\":\"memczjkmmyk\"},\"id\":\"rye\",\"name\":\"ylmbkzudni\",\"type\":\"rfih\"}]}";

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

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PacketCoreControlPlane> response =
            manager.packetCoreControlPlanes().listByResourceGroup("zb", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("twszhvvuic", response.iterator().next().location());
        Assertions.assertEquals("trrmhwrb", response.iterator().next().tags().get("dpyflubhv"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions
            .assertEquals(DesiredInstallationState.INSTALLED, response.iterator().next().installation().desiredState());
        Assertions.assertEquals("f", response.iterator().next().sites().get(0).id());
        Assertions.assertEquals(PlatformType.THREE_P_AZURE_STACK_HCI, response.iterator().next().platform().type());
        Assertions.assertEquals("phaimmoi", response.iterator().next().platform().azureStackEdgeDevice().id());
        Assertions.assertEquals("pfppd", response.iterator().next().platform().azureStackHciCluster().id());
        Assertions.assertEquals("nupgahxku", response.iterator().next().platform().connectedCluster().id());
        Assertions.assertEquals("sjcaacfdmmcpugm", response.iterator().next().platform().customLocation().id());
        Assertions.assertEquals(CoreNetworkType.FIVE_GC, response.iterator().next().coreNetworkTechnology());
        Assertions.assertEquals("pvufhbze", response.iterator().next().version());
        Assertions.assertEquals("ri", response.iterator().next().controlPlaneAccessInterface().name());
        Assertions
            .assertEquals("rsrrmoucsofldp", response.iterator().next().controlPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("iyfc", response.iterator().next().controlPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("beolh", response.iterator().next().controlPlaneAccessInterface().ipv4Gateway());
        Assertions
            .assertEquals("vbmxuqibsx", response.iterator().next().controlPlaneAccessVirtualIpv4Addresses().get(0));
        Assertions.assertEquals(BillingSku.G2, response.iterator().next().sku());
        Assertions.assertEquals(930902009, response.iterator().next().ueMtu());
        Assertions
            .assertEquals(
                AuthenticationType.PASSWORD, response.iterator().next().localDiagnosticsAccess().authenticationType());
        Assertions
            .assertEquals(
                "fcluqvo",
                response.iterator().next().localDiagnosticsAccess().httpsServerCertificate().certificateUrl());
        Assertions.assertEquals("vwg", response.iterator().next().diagnosticsUpload().storageAccountContainerUrl());
        Assertions.assertEquals("wpbmzgwesydsxwef", response.iterator().next().eventHub().id());
        Assertions.assertEquals(799767919, response.iterator().next().eventHub().reportingInterval());
        Assertions.assertEquals(1456843419, response.iterator().next().signaling().nasReroute().macroMmeGroupId());
    }
}
