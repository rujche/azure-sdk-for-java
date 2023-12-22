// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthcareapis.fluent.FhirServicesClient;
import com.azure.resourcemanager.healthcareapis.fluent.models.FhirServiceInner;
import com.azure.resourcemanager.healthcareapis.models.FhirService;
import com.azure.resourcemanager.healthcareapis.models.FhirServices;

public final class FhirServicesImpl implements FhirServices {
    private static final ClientLogger LOGGER = new ClientLogger(FhirServicesImpl.class);

    private final FhirServicesClient innerClient;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    public FhirServicesImpl(FhirServicesClient innerClient,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FhirService> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<FhirServiceInner> inner = this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new FhirServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<FhirService> listByWorkspace(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<FhirServiceInner> inner
            = this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new FhirServiceImpl(inner1, this.manager()));
    }

    public Response<FhirService> getWithResponse(String resourceGroupName, String workspaceName, String fhirServiceName,
        Context context) {
        Response<FhirServiceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, workspaceName, fhirServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FhirServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FhirService get(String resourceGroupName, String workspaceName, String fhirServiceName) {
        FhirServiceInner inner = this.serviceClient().get(resourceGroupName, workspaceName, fhirServiceName);
        if (inner != null) {
            return new FhirServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String fhirServiceName, String workspaceName) {
        this.serviceClient().delete(resourceGroupName, fhirServiceName, workspaceName);
    }

    public void delete(String resourceGroupName, String fhirServiceName, String workspaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, fhirServiceName, workspaceName, context);
    }

    public FhirService getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String fhirServiceName = Utils.getValueFromIdByName(id, "fhirservices");
        if (fhirServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fhirservices'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, fhirServiceName, Context.NONE).getValue();
    }

    public Response<FhirService> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String fhirServiceName = Utils.getValueFromIdByName(id, "fhirservices");
        if (fhirServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fhirservices'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, fhirServiceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fhirServiceName = Utils.getValueFromIdByName(id, "fhirservices");
        if (fhirServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fhirservices'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.delete(resourceGroupName, fhirServiceName, workspaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fhirServiceName = Utils.getValueFromIdByName(id, "fhirservices");
        if (fhirServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fhirservices'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.delete(resourceGroupName, fhirServiceName, workspaceName, context);
    }

    private FhirServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }

    public FhirServiceImpl define(String name) {
        return new FhirServiceImpl(name, this.manager());
    }
}
