// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.NaptConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Data network properties. */
@Fluent
public final class AttachedDataNetworkPropertiesFormat {
    /*
     * The provisioning state of the attached data network resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The user plane interface on the data network. For 5G networks, this is the N6 interface. For 4G networks, this
     * is the SGi interface.
     */
    @JsonProperty(value = "userPlaneDataInterface", required = true)
    private InterfaceProperties userPlaneDataInterface;

    /*
     * The DNS servers to signal to UEs to use for this attached data network. This configuration is mandatory - if you
     * don't want DNS servers, you must provide an empty array.
     */
    @JsonProperty(value = "dnsAddresses", required = true)
    private List<String> dnsAddresses;

    /*
     * The network address and port translation (NAPT) configuration.
     * If this is not specified, the attached data network will use a default NAPT configuration with NAPT enabled.
     */
    @JsonProperty(value = "naptConfiguration")
    private NaptConfiguration naptConfiguration;

    /*
     * The user equipment (UE) address pool prefixes for the attached data network from which the packet core instance
     * will dynamically assign IP addresses to UEs.
     * The packet core instance assigns an IP address to a UE when the UE sets up a PDU session.
     * You must define at least one of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix. If you
     * define both, they must be of the same size.
     */
    @JsonProperty(value = "userEquipmentAddressPoolPrefix")
    private List<String> userEquipmentAddressPoolPrefix;

    /*
     * The user equipment (UE) address pool prefixes for the attached data network from which the packet core instance
     * will assign static IP addresses to UEs.
     * The packet core instance assigns an IP address to a UE when the UE sets up a PDU session. The static IP address
     * for a specific UE is set in StaticIPConfiguration on the corresponding SIM resource.
     * At least one of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both
     * are defined, they must be of the same size.
     */
    @JsonProperty(value = "userEquipmentStaticAddressPoolPrefix")
    private List<String> userEquipmentStaticAddressPoolPrefix;

    /** Creates an instance of AttachedDataNetworkPropertiesFormat class. */
    public AttachedDataNetworkPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the attached data network resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the userPlaneDataInterface property: The user plane interface on the data network. For 5G networks, this is
     * the N6 interface. For 4G networks, this is the SGi interface.
     *
     * @return the userPlaneDataInterface value.
     */
    public InterfaceProperties userPlaneDataInterface() {
        return this.userPlaneDataInterface;
    }

    /**
     * Set the userPlaneDataInterface property: The user plane interface on the data network. For 5G networks, this is
     * the N6 interface. For 4G networks, this is the SGi interface.
     *
     * @param userPlaneDataInterface the userPlaneDataInterface value to set.
     * @return the AttachedDataNetworkPropertiesFormat object itself.
     */
    public AttachedDataNetworkPropertiesFormat withUserPlaneDataInterface(InterfaceProperties userPlaneDataInterface) {
        this.userPlaneDataInterface = userPlaneDataInterface;
        return this;
    }

    /**
     * Get the dnsAddresses property: The DNS servers to signal to UEs to use for this attached data network. This
     * configuration is mandatory - if you don't want DNS servers, you must provide an empty array.
     *
     * @return the dnsAddresses value.
     */
    public List<String> dnsAddresses() {
        return this.dnsAddresses;
    }

    /**
     * Set the dnsAddresses property: The DNS servers to signal to UEs to use for this attached data network. This
     * configuration is mandatory - if you don't want DNS servers, you must provide an empty array.
     *
     * @param dnsAddresses the dnsAddresses value to set.
     * @return the AttachedDataNetworkPropertiesFormat object itself.
     */
    public AttachedDataNetworkPropertiesFormat withDnsAddresses(List<String> dnsAddresses) {
        this.dnsAddresses = dnsAddresses;
        return this;
    }

    /**
     * Get the naptConfiguration property: The network address and port translation (NAPT) configuration. If this is not
     * specified, the attached data network will use a default NAPT configuration with NAPT enabled.
     *
     * @return the naptConfiguration value.
     */
    public NaptConfiguration naptConfiguration() {
        return this.naptConfiguration;
    }

    /**
     * Set the naptConfiguration property: The network address and port translation (NAPT) configuration. If this is not
     * specified, the attached data network will use a default NAPT configuration with NAPT enabled.
     *
     * @param naptConfiguration the naptConfiguration value to set.
     * @return the AttachedDataNetworkPropertiesFormat object itself.
     */
    public AttachedDataNetworkPropertiesFormat withNaptConfiguration(NaptConfiguration naptConfiguration) {
        this.naptConfiguration = naptConfiguration;
        return this;
    }

    /**
     * Get the userEquipmentAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the attached
     * data network from which the packet core instance will dynamically assign IP addresses to UEs. The packet core
     * instance assigns an IP address to a UE when the UE sets up a PDU session. You must define at least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix. If you define both, they must be of the
     * same size.
     *
     * @return the userEquipmentAddressPoolPrefix value.
     */
    public List<String> userEquipmentAddressPoolPrefix() {
        return this.userEquipmentAddressPoolPrefix;
    }

    /**
     * Set the userEquipmentAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the attached
     * data network from which the packet core instance will dynamically assign IP addresses to UEs. The packet core
     * instance assigns an IP address to a UE when the UE sets up a PDU session. You must define at least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix. If you define both, they must be of the
     * same size.
     *
     * @param userEquipmentAddressPoolPrefix the userEquipmentAddressPoolPrefix value to set.
     * @return the AttachedDataNetworkPropertiesFormat object itself.
     */
    public AttachedDataNetworkPropertiesFormat withUserEquipmentAddressPoolPrefix(
        List<String> userEquipmentAddressPoolPrefix) {
        this.userEquipmentAddressPoolPrefix = userEquipmentAddressPoolPrefix;
        return this;
    }

    /**
     * Get the userEquipmentStaticAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the
     * attached data network from which the packet core instance will assign static IP addresses to UEs. The packet core
     * instance assigns an IP address to a UE when the UE sets up a PDU session. The static IP address for a specific UE
     * is set in StaticIPConfiguration on the corresponding SIM resource. At least one of userEquipmentAddressPoolPrefix
     * and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined, they must be of the same size.
     *
     * @return the userEquipmentStaticAddressPoolPrefix value.
     */
    public List<String> userEquipmentStaticAddressPoolPrefix() {
        return this.userEquipmentStaticAddressPoolPrefix;
    }

    /**
     * Set the userEquipmentStaticAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the
     * attached data network from which the packet core instance will assign static IP addresses to UEs. The packet core
     * instance assigns an IP address to a UE when the UE sets up a PDU session. The static IP address for a specific UE
     * is set in StaticIPConfiguration on the corresponding SIM resource. At least one of userEquipmentAddressPoolPrefix
     * and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined, they must be of the same size.
     *
     * @param userEquipmentStaticAddressPoolPrefix the userEquipmentStaticAddressPoolPrefix value to set.
     * @return the AttachedDataNetworkPropertiesFormat object itself.
     */
    public AttachedDataNetworkPropertiesFormat withUserEquipmentStaticAddressPoolPrefix(
        List<String> userEquipmentStaticAddressPoolPrefix) {
        this.userEquipmentStaticAddressPoolPrefix = userEquipmentStaticAddressPoolPrefix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userPlaneDataInterface() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property userPlaneDataInterface in model"
                            + " AttachedDataNetworkPropertiesFormat"));
        } else {
            userPlaneDataInterface().validate();
        }
        if (dnsAddresses() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dnsAddresses in model AttachedDataNetworkPropertiesFormat"));
        }
        if (naptConfiguration() != null) {
            naptConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AttachedDataNetworkPropertiesFormat.class);
}
