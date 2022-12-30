// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.fluent.models.VaultCertificateResponseInner;
import com.azure.resourcemanager.recoveryservices.models.CertificateRequest;

/** An instance of this class provides access to all the operations defined in VaultCertificatesClient. */
public interface VaultCertificatesClient {
    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param certificateRequest Input parameters for uploading the vault certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate corresponding to a vault that can be used by clients to register themselves with the vault
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VaultCertificateResponseInner> createWithResponse(
        String resourceGroupName,
        String vaultName,
        String certificateName,
        CertificateRequest certificateRequest,
        Context context);

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param certificateRequest Input parameters for uploading the vault certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate corresponding to a vault that can be used by clients to register themselves with the vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VaultCertificateResponseInner create(
        String resourceGroupName, String vaultName, String certificateName, CertificateRequest certificateRequest);
}
