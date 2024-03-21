// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of schema registry cluster spec.
 */
@Fluent
public final class SchemaRegistryClusterSpecEntity {
    /*
     * Name of the schema registry cluster
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Http endpoint of the cluster
     */
    @JsonProperty(value = "httpEndpoint")
    private String httpEndpoint;

    /*
     * Type of the cluster package Advanced, essentials
     */
    @JsonProperty(value = "package")
    private String packageProperty;

    /*
     * Region details of the schema registry cluster
     */
    @JsonProperty(value = "region")
    private SchemaRegistryClusterEnvironmentRegionEntity region;

    /*
     * Environment details of the schema registry cluster
     */
    @JsonProperty(value = "environment")
    private SchemaRegistryClusterEnvironmentRegionEntity environment;

    /*
     * The cloud service provider
     */
    @JsonProperty(value = "cloud")
    private String cloud;

    /**
     * Creates an instance of SchemaRegistryClusterSpecEntity class.
     */
    public SchemaRegistryClusterSpecEntity() {
    }

    /**
     * Get the name property: Name of the schema registry cluster.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the schema registry cluster.
     * 
     * @param name the name value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the httpEndpoint property: Http endpoint of the cluster.
     * 
     * @return the httpEndpoint value.
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * Set the httpEndpoint property: Http endpoint of the cluster.
     * 
     * @param httpEndpoint the httpEndpoint value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }

    /**
     * Get the packageProperty property: Type of the cluster package Advanced, essentials.
     * 
     * @return the packageProperty value.
     */
    public String packageProperty() {
        return this.packageProperty;
    }

    /**
     * Set the packageProperty property: Type of the cluster package Advanced, essentials.
     * 
     * @param packageProperty the packageProperty value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withPackageProperty(String packageProperty) {
        this.packageProperty = packageProperty;
        return this;
    }

    /**
     * Get the region property: Region details of the schema registry cluster.
     * 
     * @return the region value.
     */
    public SchemaRegistryClusterEnvironmentRegionEntity region() {
        return this.region;
    }

    /**
     * Set the region property: Region details of the schema registry cluster.
     * 
     * @param region the region value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withRegion(SchemaRegistryClusterEnvironmentRegionEntity region) {
        this.region = region;
        return this;
    }

    /**
     * Get the environment property: Environment details of the schema registry cluster.
     * 
     * @return the environment value.
     */
    public SchemaRegistryClusterEnvironmentRegionEntity environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Environment details of the schema registry cluster.
     * 
     * @param environment the environment value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withEnvironment(SchemaRegistryClusterEnvironmentRegionEntity environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the cloud property: The cloud service provider.
     * 
     * @return the cloud value.
     */
    public String cloud() {
        return this.cloud;
    }

    /**
     * Set the cloud property: The cloud service provider.
     * 
     * @param cloud the cloud value to set.
     * @return the SchemaRegistryClusterSpecEntity object itself.
     */
    public SchemaRegistryClusterSpecEntity withCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (region() != null) {
            region().validate();
        }
        if (environment() != null) {
            environment().validate();
        }
    }
}
