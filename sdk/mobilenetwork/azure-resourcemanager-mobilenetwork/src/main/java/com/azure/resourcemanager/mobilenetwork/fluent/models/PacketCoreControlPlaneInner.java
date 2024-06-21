// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.BillingSku;
import com.azure.resourcemanager.mobilenetwork.models.CoreNetworkType;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsUploadConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.EventHubConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.HomeNetworkPrivateKeysProvisioning;
import com.azure.resourcemanager.mobilenetwork.models.Installation;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.LocalDiagnosticsAccessConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mobilenetwork.models.PlatformConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.SignalingConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.SiteResourceId;
import com.azure.resourcemanager.mobilenetwork.models.UserConsentConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Packet core control plane resource.
 */
@Fluent
public final class PacketCoreControlPlaneInner extends Resource {
    /*
     * Packet core control plane Properties.
     */
    @JsonProperty(value = "properties", required = true)
    private PacketCoreControlPlanePropertiesFormat innerProperties = new PacketCoreControlPlanePropertiesFormat();

    /*
     * The identity used to retrieve the ingress certificate from Azure key vault.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of PacketCoreControlPlaneInner class.
     */
    public PacketCoreControlPlaneInner() {
    }

    /**
     * Get the innerProperties property: Packet core control plane Properties.
     * 
     * @return the innerProperties value.
     */
    private PacketCoreControlPlanePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity used to retrieve the ingress certificate from Azure key vault.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity used to retrieve the ingress certificate from Azure key vault.
     * 
     * @param identity the identity value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCoreControlPlaneInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCoreControlPlaneInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet core control plane resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the installation property: The installation state of the packet core control plane resource.
     * 
     * @return the installation value.
     */
    public Installation installation() {
        return this.innerProperties() == null ? null : this.innerProperties().installation();
    }

    /**
     * Set the installation property: The installation state of the packet core control plane resource.
     * 
     * @param installation the installation value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withInstallation(Installation installation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withInstallation(installation);
        return this;
    }

    /**
     * Get the sites property: Site(s) under which this packet core control plane should be deployed. The sites must be
     * in the same location as the packet core control plane.
     * 
     * @return the sites value.
     */
    public List<SiteResourceId> sites() {
        return this.innerProperties() == null ? null : this.innerProperties().sites();
    }

    /**
     * Set the sites property: Site(s) under which this packet core control plane should be deployed. The sites must be
     * in the same location as the packet core control plane.
     * 
     * @param sites the sites value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withSites(List<SiteResourceId> sites) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withSites(sites);
        return this;
    }

    /**
     * Get the platform property: The platform where the packet core is deployed.
     * 
     * @return the platform value.
     */
    public PlatformConfiguration platform() {
        return this.innerProperties() == null ? null : this.innerProperties().platform();
    }

    /**
     * Set the platform property: The platform where the packet core is deployed.
     * 
     * @param platform the platform value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withPlatform(PlatformConfiguration platform) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withPlatform(platform);
        return this;
    }

    /**
     * Get the coreNetworkTechnology property: The core network technology generation (5G core or EPC / 4G core).
     * 
     * @return the coreNetworkTechnology value.
     */
    public CoreNetworkType coreNetworkTechnology() {
        return this.innerProperties() == null ? null : this.innerProperties().coreNetworkTechnology();
    }

    /**
     * Set the coreNetworkTechnology property: The core network technology generation (5G core or EPC / 4G core).
     * 
     * @param coreNetworkTechnology the coreNetworkTechnology value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withCoreNetworkTechnology(CoreNetworkType coreNetworkTechnology) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withCoreNetworkTechnology(coreNetworkTechnology);
        return this;
    }

    /**
     * Get the version property: The desired version of the packet core software.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: The desired version of the packet core software.
     * 
     * @param version the version value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withVersion(version);
        return this;
    }

    /**
     * Get the installedVersion property: The currently installed version of the packet core software.
     * 
     * @return the installedVersion value.
     */
    public String installedVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().installedVersion();
    }

    /**
     * Get the rollbackVersion property: The previous version of the packet core software that was deployed. Used when
     * performing the rollback action.
     * 
     * @return the rollbackVersion value.
     */
    public String rollbackVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().rollbackVersion();
    }

    /**
     * Get the controlPlaneAccessInterface property: The control plane interface on the access network. For 5G networks,
     * this is the N2 interface. For 4G networks, this is the S1-MME interface.
     * 
     * @return the controlPlaneAccessInterface value.
     */
    public InterfaceProperties controlPlaneAccessInterface() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneAccessInterface();
    }

    /**
     * Set the controlPlaneAccessInterface property: The control plane interface on the access network. For 5G networks,
     * this is the N2 interface. For 4G networks, this is the S1-MME interface.
     * 
     * @param controlPlaneAccessInterface the controlPlaneAccessInterface value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner
        withControlPlaneAccessInterface(InterfaceProperties controlPlaneAccessInterface) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withControlPlaneAccessInterface(controlPlaneAccessInterface);
        return this;
    }

    /**
     * Get the controlPlaneAccessVirtualIpv4Addresses property: The virtual IP address(es) for the control plane on the
     * access network in a High Availability (HA) system. In an HA deployment the access network router should be
     * configured to anycast traffic for this address to the control plane access interfaces on the active and standby
     * nodes. In non-HA system this list should be omitted or empty.
     * 
     * @return the controlPlaneAccessVirtualIpv4Addresses value.
     */
    public List<String> controlPlaneAccessVirtualIpv4Addresses() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneAccessVirtualIpv4Addresses();
    }

    /**
     * Set the controlPlaneAccessVirtualIpv4Addresses property: The virtual IP address(es) for the control plane on the
     * access network in a High Availability (HA) system. In an HA deployment the access network router should be
     * configured to anycast traffic for this address to the control plane access interfaces on the active and standby
     * nodes. In non-HA system this list should be omitted or empty.
     * 
     * @param controlPlaneAccessVirtualIpv4Addresses the controlPlaneAccessVirtualIpv4Addresses value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner
        withControlPlaneAccessVirtualIpv4Addresses(List<String> controlPlaneAccessVirtualIpv4Addresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withControlPlaneAccessVirtualIpv4Addresses(controlPlaneAccessVirtualIpv4Addresses);
        return this;
    }

    /**
     * Get the sku property: The SKU defining the throughput and SIM allowances for this packet core control plane
     * deployment.
     * 
     * @return the sku value.
     */
    public BillingSku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The SKU defining the throughput and SIM allowances for this packet core control plane
     * deployment.
     * 
     * @param sku the sku value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withSku(BillingSku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the ueMtu property: The MTU (in bytes) signaled to the UE. The same MTU is set on the user plane data links
     * for all data networks. The MTU set on the user plane access link is calculated to be 60 bytes greater than this
     * value to allow for GTP encapsulation.
     * 
     * @return the ueMtu value.
     */
    public Integer ueMtu() {
        return this.innerProperties() == null ? null : this.innerProperties().ueMtu();
    }

    /**
     * Set the ueMtu property: The MTU (in bytes) signaled to the UE. The same MTU is set on the user plane data links
     * for all data networks. The MTU set on the user plane access link is calculated to be 60 bytes greater than this
     * value to allow for GTP encapsulation.
     * 
     * @param ueMtu the ueMtu value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withUeMtu(Integer ueMtu) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withUeMtu(ueMtu);
        return this;
    }

    /**
     * Get the localDiagnosticsAccess property: The kubernetes ingress configuration to control access to packet core
     * diagnostics over local APIs.
     * 
     * @return the localDiagnosticsAccess value.
     */
    public LocalDiagnosticsAccessConfiguration localDiagnosticsAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().localDiagnosticsAccess();
    }

    /**
     * Set the localDiagnosticsAccess property: The kubernetes ingress configuration to control access to packet core
     * diagnostics over local APIs.
     * 
     * @param localDiagnosticsAccess the localDiagnosticsAccess value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner
        withLocalDiagnosticsAccess(LocalDiagnosticsAccessConfiguration localDiagnosticsAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withLocalDiagnosticsAccess(localDiagnosticsAccess);
        return this;
    }

    /**
     * Get the diagnosticsUpload property: Configuration for uploading packet core diagnostics.
     * 
     * @return the diagnosticsUpload value.
     */
    public DiagnosticsUploadConfiguration diagnosticsUpload() {
        return this.innerProperties() == null ? null : this.innerProperties().diagnosticsUpload();
    }

    /**
     * Set the diagnosticsUpload property: Configuration for uploading packet core diagnostics.
     * 
     * @param diagnosticsUpload the diagnosticsUpload value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withDiagnosticsUpload(DiagnosticsUploadConfiguration diagnosticsUpload) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withDiagnosticsUpload(diagnosticsUpload);
        return this;
    }

    /**
     * Get the eventHub property: Configuration for sending packet core events to an Azure Event Hub.
     * 
     * @return the eventHub value.
     */
    public EventHubConfiguration eventHub() {
        return this.innerProperties() == null ? null : this.innerProperties().eventHub();
    }

    /**
     * Set the eventHub property: Configuration for sending packet core events to an Azure Event Hub.
     * 
     * @param eventHub the eventHub value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withEventHub(EventHubConfiguration eventHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withEventHub(eventHub);
        return this;
    }

    /**
     * Get the signaling property: Signaling configuration for the packet core.
     * 
     * @return the signaling value.
     */
    public SignalingConfiguration signaling() {
        return this.innerProperties() == null ? null : this.innerProperties().signaling();
    }

    /**
     * Set the signaling property: Signaling configuration for the packet core.
     * 
     * @param signaling the signaling value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withSignaling(SignalingConfiguration signaling) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withSignaling(signaling);
        return this;
    }

    /**
     * Get the interopSettings property: Settings to allow interoperability with third party components e.g. RANs and
     * UEs.
     * 
     * @return the interopSettings value.
     */
    public Object interopSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().interopSettings();
    }

    /**
     * Set the interopSettings property: Settings to allow interoperability with third party components e.g. RANs and
     * UEs.
     * 
     * @param interopSettings the interopSettings value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withInteropSettings(Object interopSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withInteropSettings(interopSettings);
        return this;
    }

    /**
     * Get the homeNetworkPrivateKeysProvisioning property: The provisioning state of the secret containing private keys
     * and keyIds for SUPI concealment.
     * 
     * @return the homeNetworkPrivateKeysProvisioning value.
     */
    public HomeNetworkPrivateKeysProvisioning homeNetworkPrivateKeysProvisioning() {
        return this.innerProperties() == null ? null : this.innerProperties().homeNetworkPrivateKeysProvisioning();
    }

    /**
     * Get the userConsent property: The user consent configuration for the packet core.
     * 
     * @return the userConsent value.
     */
    public UserConsentConfiguration userConsent() {
        return this.innerProperties() == null ? null : this.innerProperties().userConsent();
    }

    /**
     * Set the userConsent property: The user consent configuration for the packet core.
     * 
     * @param userConsent the userConsent value to set.
     * @return the PacketCoreControlPlaneInner object itself.
     */
    public PacketCoreControlPlaneInner withUserConsent(UserConsentConfiguration userConsent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlanePropertiesFormat();
        }
        this.innerProperties().withUserConsent(userConsent);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model PacketCoreControlPlaneInner"));
        } else {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreControlPlaneInner.class);
}
