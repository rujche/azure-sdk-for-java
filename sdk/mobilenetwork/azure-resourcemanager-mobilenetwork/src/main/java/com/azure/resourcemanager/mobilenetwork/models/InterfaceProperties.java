// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Interface properties.
 */
@Fluent
public final class InterfaceProperties {
    /*
     * The logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The IPv4 address.
     */
    @JsonProperty(value = "ipv4Address")
    private String ipv4Address;

    /*
     * The IPv4 subnet.
     */
    @JsonProperty(value = "ipv4Subnet")
    private String ipv4Subnet;

    /*
     * The default IPv4 gateway (router).
     */
    @JsonProperty(value = "ipv4Gateway")
    private String ipv4Gateway;

    /*
     * VLAN identifier of the network interface. Example: 501.
     */
    @JsonProperty(value = "vlanId")
    private Integer vlanId;

    /*
     * The list of IPv4 addresses, for a multi-node system.
     */
    @JsonProperty(value = "ipv4AddressList")
    private List<String> ipv4AddressList;

    /*
     * The IPv4 addresses of the endpoints to send BFD probes to.
     */
    @JsonProperty(value = "bfdIpv4Endpoints")
    private List<String> bfdIpv4Endpoints;

    /**
     * Creates an instance of InterfaceProperties class.
     */
    public InterfaceProperties() {
    }

    /**
     * Get the name property: The logical name for this interface. This should match one of the interfaces configured on
     * your Azure Stack Edge device.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The logical name for this interface. This should match one of the interfaces configured on
     * your Azure Stack Edge device.
     * 
     * @param name the name value to set.
     * @return the InterfaceProperties object itself.
     */
    public InterfaceProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ipv4Address property: The IPv4 address.
     * 
     * @return the ipv4Address value.
     */
    public String ipv4Address() {
        return this.ipv4Address;
    }

    /**
     * Set the ipv4Address property: The IPv4 address.
     * 
     * @param ipv4Address the ipv4Address value to set.
     * @return the InterfaceProperties object itself.
     */
    public InterfaceProperties withIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
    }

    /**
     * Get the ipv4Subnet property: The IPv4 subnet.
     * 
     * @return the ipv4Subnet value.
     */
    public String ipv4Subnet() {
        return this.ipv4Subnet;
    }

    /**
     * Set the ipv4Subnet property: The IPv4 subnet.
     * 
     * @param ipv4Subnet the ipv4Subnet value to set.
     * @return the InterfaceProperties object itself.
     */
    public InterfaceProperties withIpv4Subnet(String ipv4Subnet) {
        this.ipv4Subnet = ipv4Subnet;
        return this;
    }

    /**
     * Get the ipv4Gateway property: The default IPv4 gateway (router).
     * 
     * @return the ipv4Gateway value.
     */
    public String ipv4Gateway() {
        return this.ipv4Gateway;
    }

    /**
     * Set the ipv4Gateway property: The default IPv4 gateway (router).
     * 
     * @param ipv4Gateway the ipv4Gateway value to set.
     * @return the InterfaceProperties object itself.
     */
    public InterfaceProperties withIpv4Gateway(String ipv4Gateway) {
        this.ipv4Gateway = ipv4Gateway;
        return this;
    }

    /**
     * Get the vlanId property: VLAN identifier of the network interface. Example: 501.
     * 
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: VLAN identifier of the network interface. Example: 501.
     * 
     * @param vlanId the vlanId value to set.
     * @return the InterfaceProperties object itself.
     */
    public InterfaceProperties withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the ipv4AddressList property: The list of IPv4 addresses, for a multi-node system.
     * 
     * @return the ipv4AddressList value.
     */
    public List<String> ipv4AddressList() {
        return this.ipv4AddressList;
    }

    /**
     * Set the ipv4AddressList property: The list of IPv4 addresses, for a multi-node system.
     * 
     * @param ipv4AddressList the ipv4AddressList value to set.
     * @return the InterfaceProperties object itself.
     */
    public InterfaceProperties withIpv4AddressList(List<String> ipv4AddressList) {
        this.ipv4AddressList = ipv4AddressList;
        return this;
    }

    /**
     * Get the bfdIpv4Endpoints property: The IPv4 addresses of the endpoints to send BFD probes to.
     * 
     * @return the bfdIpv4Endpoints value.
     */
    public List<String> bfdIpv4Endpoints() {
        return this.bfdIpv4Endpoints;
    }

    /**
     * Set the bfdIpv4Endpoints property: The IPv4 addresses of the endpoints to send BFD probes to.
     * 
     * @param bfdIpv4Endpoints the bfdIpv4Endpoints value to set.
     * @return the InterfaceProperties object itself.
     */
    public InterfaceProperties withBfdIpv4Endpoints(List<String> bfdIpv4Endpoints) {
        this.bfdIpv4Endpoints = bfdIpv4Endpoints;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
