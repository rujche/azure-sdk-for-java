// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.generated;

import com.azure.resourcemanager.voiceservices.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.voiceservices.models.CommunicationsPlatform;
import com.azure.resourcemanager.voiceservices.models.Connectivity;
import com.azure.resourcemanager.voiceservices.models.E911Type;
import com.azure.resourcemanager.voiceservices.models.PrimaryRegionProperties;
import com.azure.resourcemanager.voiceservices.models.ServiceRegionProperties;
import com.azure.resourcemanager.voiceservices.models.TeamsCodecs;
import java.util.Arrays;

/** Samples for CommunicationsGateways CreateOrUpdate. */
public final class CommunicationsGatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/voiceservices/resource-manager/Microsoft.VoiceServices/stable/2023-01-31/examples/CommunicationsGateways_CreateOrUpdate.json
     */
    /**
     * Sample code: CreateCommunicationsGatewayResource.
     *
     * @param manager Entry point to VoiceservicesManager.
     */
    public static void createCommunicationsGatewayResource(
        com.azure.resourcemanager.voiceservices.VoiceservicesManager manager) {
        manager
            .communicationsGateways()
            .define("myname")
            .withRegion("useast")
            .withExistingResourceGroup("testrg")
            .withServiceLocations(
                Arrays
                    .asList(
                        new ServiceRegionProperties()
                            .withName("useast")
                            .withPrimaryRegionProperties(
                                new PrimaryRegionProperties()
                                    .withOperatorAddresses(Arrays.asList("198.51.100.1"))
                                    .withAllowedSignalingSourceAddressPrefixes(Arrays.asList("10.1.1.0/24"))
                                    .withAllowedMediaSourceAddressPrefixes(Arrays.asList("10.1.2.0/24"))),
                        new ServiceRegionProperties()
                            .withName("useast2")
                            .withPrimaryRegionProperties(
                                new PrimaryRegionProperties()
                                    .withOperatorAddresses(Arrays.asList("198.51.100.2"))
                                    .withAllowedSignalingSourceAddressPrefixes(Arrays.asList("10.2.1.0/24"))
                                    .withAllowedMediaSourceAddressPrefixes(Arrays.asList("10.2.2.0/24")))))
            .withConnectivity(Connectivity.PUBLIC_ADDRESS)
            .withCodecs(Arrays.asList(TeamsCodecs.PCMA))
            .withE911Type(E911Type.STANDARD)
            .withPlatforms(Arrays.asList(CommunicationsPlatform.OPERATOR_CONNECT))
            .withAutoGeneratedDomainNameLabelScope(AutoGeneratedDomainNameLabelScope.NO_REUSE)
            .withTeamsVoicemailPilotNumber("1234567890")
            .create();
    }
}
