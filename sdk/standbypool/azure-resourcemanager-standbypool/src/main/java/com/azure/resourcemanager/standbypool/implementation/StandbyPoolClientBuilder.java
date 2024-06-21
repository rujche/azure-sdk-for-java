// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/**
 * A builder for creating a new instance of the StandbyPoolClientImpl type.
 */
@ServiceClientBuilder(serviceClients = { StandbyPoolClientImpl.class })
public final class StandbyPoolClientBuilder {
    /*
     * Server parameter
     */
    private String endpoint;

    /**
     * Sets Server parameter.
     * 
     * @param endpoint the endpoint value.
     * @return the StandbyPoolClientBuilder.
     */
    public StandbyPoolClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The ID of the target subscription. The value must be an UUID.
     */
    private String subscriptionId;

    /**
     * Sets The ID of the target subscription. The value must be an UUID.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the StandbyPoolClientBuilder.
     */
    public StandbyPoolClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the StandbyPoolClientBuilder.
     */
    public StandbyPoolClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the StandbyPoolClientBuilder.
     */
    public StandbyPoolClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The default poll interval for long-running operation
     */
    private Duration defaultPollInterval;

    /**
     * Sets The default poll interval for long-running operation.
     * 
     * @param defaultPollInterval the defaultPollInterval value.
     * @return the StandbyPoolClientBuilder.
     */
    public StandbyPoolClientBuilder defaultPollInterval(Duration defaultPollInterval) {
        this.defaultPollInterval = defaultPollInterval;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     * 
     * @param serializerAdapter the serializerAdapter value.
     * @return the StandbyPoolClientBuilder.
     */
    public StandbyPoolClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of StandbyPoolClientImpl with the provided parameters.
     * 
     * @return an instance of StandbyPoolClientImpl.
     */
    public StandbyPoolClientImpl buildClient() {
        AzureEnvironment localEnvironment = (environment != null) ? environment : AzureEnvironment.AZURE;
        HttpPipeline localPipeline = (pipeline != null)
            ? pipeline
            : new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build();
        Duration localDefaultPollInterval
            = (defaultPollInterval != null) ? defaultPollInterval : Duration.ofSeconds(30);
        SerializerAdapter localSerializerAdapter = (serializerAdapter != null)
            ? serializerAdapter
            : SerializerFactory.createDefaultManagementSerializerAdapter();
        StandbyPoolClientImpl client = new StandbyPoolClientImpl(localPipeline, localSerializerAdapter,
            localDefaultPollInterval, localEnvironment, this.endpoint, this.subscriptionId);
        return client;
    }
}
