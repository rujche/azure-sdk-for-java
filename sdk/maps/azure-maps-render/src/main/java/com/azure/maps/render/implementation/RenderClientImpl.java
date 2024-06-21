// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the RenderClient type.
 */
public final class RenderClientImpl {
    /**
     * Specifies which account is intended for usage in conjunction with the Microsoft Entra ID security model. It
     * represents a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management plane
     * Account API. To use Microsoft Entra ID security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     */
    private final String clientId;

    /**
     * Gets Specifies which account is intended for usage in conjunction with the Microsoft Entra ID security model. It
     * represents a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management plane
     * Account API. To use Microsoft Entra ID security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     * 
     * @return the clientId value.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * server parameter.
     */
    private final String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The RendersImpl object to access its operations.
     */
    private final RendersImpl renders;

    /**
     * Gets the RendersImpl object to access its operations.
     * 
     * @return the RendersImpl object.
     */
    public RendersImpl getRenders() {
        return this.renders;
    }

    /**
     * Initializes an instance of RenderClient client.
     * 
     * @param clientId Specifies which account is intended for usage in conjunction with the Microsoft Entra ID security
     * model. It represents a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management
     * plane Account API. To use Microsoft Entra ID security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    RenderClientImpl(String clientId, String host, String apiVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), clientId, host, apiVersion);
    }

    /**
     * Initializes an instance of RenderClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param clientId Specifies which account is intended for usage in conjunction with the Microsoft Entra ID security
     * model. It represents a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management
     * plane Account API. To use Microsoft Entra ID security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    RenderClientImpl(HttpPipeline httpPipeline, String clientId, String host, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), clientId, host, apiVersion);
    }

    /**
     * Initializes an instance of RenderClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param clientId Specifies which account is intended for usage in conjunction with the Microsoft Entra ID security
     * model. It represents a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management
     * plane Account API. To use Microsoft Entra ID security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    RenderClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String clientId, String host,
        String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.clientId = clientId;
        this.host = host;
        this.apiVersion = apiVersion;
        this.renders = new RendersImpl(this);
    }
}
