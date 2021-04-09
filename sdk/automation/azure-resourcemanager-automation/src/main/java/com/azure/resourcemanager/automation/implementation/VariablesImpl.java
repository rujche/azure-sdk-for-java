// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.VariablesClient;
import com.azure.resourcemanager.automation.fluent.models.VariableInner;
import com.azure.resourcemanager.automation.models.Variable;
import com.azure.resourcemanager.automation.models.Variables;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VariablesImpl implements Variables {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VariablesImpl.class);

    private final VariablesClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public VariablesImpl(
        VariablesClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String automationAccountName, String variableName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, variableName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String variableName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, automationAccountName, variableName, context);
    }

    public Variable get(String resourceGroupName, String automationAccountName, String variableName) {
        VariableInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, variableName);
        if (inner != null) {
            return new VariableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Variable> getWithResponse(
        String resourceGroupName, String automationAccountName, String variableName, Context context) {
        Response<VariableInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, variableName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VariableImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Variable> listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        PagedIterable<VariableInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new VariableImpl(inner1, this.manager()));
    }

    public PagedIterable<Variable> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, Context context) {
        PagedIterable<VariableInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, context);
        return Utils.mapPage(inner, inner1 -> new VariableImpl(inner1, this.manager()));
    }

    public Variable getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String variableName = Utils.getValueFromIdByName(id, "variables");
        if (variableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'variables'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, variableName, Context.NONE).getValue();
    }

    public Response<Variable> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String variableName = Utils.getValueFromIdByName(id, "variables");
        if (variableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'variables'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, variableName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String variableName = Utils.getValueFromIdByName(id, "variables");
        if (variableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'variables'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, variableName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String variableName = Utils.getValueFromIdByName(id, "variables");
        if (variableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'variables'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, variableName, context);
    }

    private VariablesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public VariableImpl define(String name) {
        return new VariableImpl(name, this.manager());
    }
}
