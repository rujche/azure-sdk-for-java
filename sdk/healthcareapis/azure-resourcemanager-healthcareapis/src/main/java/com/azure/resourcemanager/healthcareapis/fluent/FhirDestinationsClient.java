// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotFhirDestinationInner;

/**
 * An instance of this class provides access to all the operations defined in FhirDestinationsClient.
 */
public interface FhirDestinationsClient {
    /**
     * Lists all FHIR destinations for the given IoT Connector.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of IoT Connector FHIR destinations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IotFhirDestinationInner> listByIotConnector(String resourceGroupName, String workspaceName,
        String iotConnectorName);

    /**
     * Lists all FHIR destinations for the given IoT Connector.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of IoT Connector FHIR destinations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IotFhirDestinationInner> listByIotConnector(String resourceGroupName, String workspaceName,
        String iotConnectorName, Context context);
}
