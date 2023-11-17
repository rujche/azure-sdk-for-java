// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.resourcemanager.eventgrid.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import java.util.List;

/**
 * An immutable client-side representation of NetworkSecurityPerimeterConfiguration.
 */
public interface NetworkSecurityPerimeterConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the provisioningState property: Provisioning state to reflect configuration state and indicate status of nsp
     * profile configuration retrieval.
     * 
     * @return the provisioningState value.
     */
    NetworkSecurityPerimeterConfigProvisioningState provisioningState();

    /**
     * Gets the provisioningIssues property: Provisioning issues to reflect status when attempting to retrieve nsp
     * profile configuration.
     * 
     * @return the provisioningIssues value.
     */
    List<NetworkSecurityPerimeterConfigurationIssues> provisioningIssues();

    /**
     * Gets the networkSecurityPerimeter property: Perimeter info for nsp association.
     * 
     * @return the networkSecurityPerimeter value.
     */
    NetworkSecurityPerimeterInfo networkSecurityPerimeter();

    /**
     * Gets the resourceAssociation property: Nsp association name and access mode of association.
     * 
     * @return the resourceAssociation value.
     */
    ResourceAssociation resourceAssociation();

    /**
     * Gets the profile property: Nsp profile configuration, access rules and diagnostic settings.
     * 
     * @return the profile value.
     */
    NetworkSecurityPerimeterConfigurationProfile profile();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.NetworkSecurityPerimeterConfigurationInner
     * object.
     * 
     * @return the inner object.
     */
    NetworkSecurityPerimeterConfigurationInner innerModel();
}
