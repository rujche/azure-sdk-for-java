// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.voiceservices.fluent.TestLinesClient;
import com.azure.resourcemanager.voiceservices.fluent.models.TestLineInner;
import com.azure.resourcemanager.voiceservices.models.TestLine;
import com.azure.resourcemanager.voiceservices.models.TestLines;

public final class TestLinesImpl implements TestLines {
    private static final ClientLogger LOGGER = new ClientLogger(TestLinesImpl.class);

    private final TestLinesClient innerClient;

    private final com.azure.resourcemanager.voiceservices.VoiceservicesManager serviceManager;

    public TestLinesImpl(
        TestLinesClient innerClient, com.azure.resourcemanager.voiceservices.VoiceservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TestLine> listByCommunicationsGateway(
        String resourceGroupName, String communicationsGatewayName) {
        PagedIterable<TestLineInner> inner =
            this.serviceClient().listByCommunicationsGateway(resourceGroupName, communicationsGatewayName);
        return Utils.mapPage(inner, inner1 -> new TestLineImpl(inner1, this.manager()));
    }

    public PagedIterable<TestLine> listByCommunicationsGateway(
        String resourceGroupName, String communicationsGatewayName, Context context) {
        PagedIterable<TestLineInner> inner =
            this.serviceClient().listByCommunicationsGateway(resourceGroupName, communicationsGatewayName, context);
        return Utils.mapPage(inner, inner1 -> new TestLineImpl(inner1, this.manager()));
    }

    public Response<TestLine> getWithResponse(
        String resourceGroupName, String communicationsGatewayName, String testLineName, Context context) {
        Response<TestLineInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, communicationsGatewayName, testLineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TestLineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TestLine get(String resourceGroupName, String communicationsGatewayName, String testLineName) {
        TestLineInner inner = this.serviceClient().get(resourceGroupName, communicationsGatewayName, testLineName);
        if (inner != null) {
            return new TestLineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String communicationsGatewayName, String testLineName) {
        this.serviceClient().delete(resourceGroupName, communicationsGatewayName, testLineName);
    }

    public void delete(
        String resourceGroupName, String communicationsGatewayName, String testLineName, Context context) {
        this.serviceClient().delete(resourceGroupName, communicationsGatewayName, testLineName, context);
    }

    public TestLine getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String communicationsGatewayName = Utils.getValueFromIdByName(id, "communicationsGateways");
        if (communicationsGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'communicationsGateways'.",
                                id)));
        }
        String testLineName = Utils.getValueFromIdByName(id, "testLines");
        if (testLineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'testLines'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, communicationsGatewayName, testLineName, Context.NONE)
            .getValue();
    }

    public Response<TestLine> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String communicationsGatewayName = Utils.getValueFromIdByName(id, "communicationsGateways");
        if (communicationsGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'communicationsGateways'.",
                                id)));
        }
        String testLineName = Utils.getValueFromIdByName(id, "testLines");
        if (testLineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'testLines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, communicationsGatewayName, testLineName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String communicationsGatewayName = Utils.getValueFromIdByName(id, "communicationsGateways");
        if (communicationsGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'communicationsGateways'.",
                                id)));
        }
        String testLineName = Utils.getValueFromIdByName(id, "testLines");
        if (testLineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'testLines'.", id)));
        }
        this.delete(resourceGroupName, communicationsGatewayName, testLineName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String communicationsGatewayName = Utils.getValueFromIdByName(id, "communicationsGateways");
        if (communicationsGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'communicationsGateways'.",
                                id)));
        }
        String testLineName = Utils.getValueFromIdByName(id, "testLines");
        if (testLineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'testLines'.", id)));
        }
        this.delete(resourceGroupName, communicationsGatewayName, testLineName, context);
    }

    private TestLinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.voiceservices.VoiceservicesManager manager() {
        return this.serviceManager;
    }

    public TestLineImpl define(String name) {
        return new TestLineImpl(name, this.manager());
    }
}
