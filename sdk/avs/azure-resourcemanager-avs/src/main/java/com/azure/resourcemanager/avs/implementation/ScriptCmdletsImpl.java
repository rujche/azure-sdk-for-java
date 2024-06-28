// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.ScriptCmdletsClient;
import com.azure.resourcemanager.avs.fluent.models.ScriptCmdletInner;
import com.azure.resourcemanager.avs.models.ScriptCmdlet;
import com.azure.resourcemanager.avs.models.ScriptCmdlets;

public final class ScriptCmdletsImpl implements ScriptCmdlets {
    private static final ClientLogger LOGGER = new ClientLogger(ScriptCmdletsImpl.class);

    private final ScriptCmdletsClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public ScriptCmdletsImpl(ScriptCmdletsClient innerClient, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ScriptCmdlet> list(String resourceGroupName, String privateCloudName,
        String scriptPackageName) {
        PagedIterable<ScriptCmdletInner> inner
            = this.serviceClient().list(resourceGroupName, privateCloudName, scriptPackageName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ScriptCmdletImpl(inner1, this.manager()));
    }

    public PagedIterable<ScriptCmdlet> list(String resourceGroupName, String privateCloudName, String scriptPackageName,
        Context context) {
        PagedIterable<ScriptCmdletInner> inner
            = this.serviceClient().list(resourceGroupName, privateCloudName, scriptPackageName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ScriptCmdletImpl(inner1, this.manager()));
    }

    public Response<ScriptCmdlet> getWithResponse(String resourceGroupName, String privateCloudName,
        String scriptPackageName, String scriptCmdletName, Context context) {
        Response<ScriptCmdletInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, privateCloudName, scriptPackageName, scriptCmdletName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ScriptCmdletImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ScriptCmdlet get(String resourceGroupName, String privateCloudName, String scriptPackageName,
        String scriptCmdletName) {
        ScriptCmdletInner inner
            = this.serviceClient().get(resourceGroupName, privateCloudName, scriptPackageName, scriptCmdletName);
        if (inner != null) {
            return new ScriptCmdletImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ScriptCmdletsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }
}
