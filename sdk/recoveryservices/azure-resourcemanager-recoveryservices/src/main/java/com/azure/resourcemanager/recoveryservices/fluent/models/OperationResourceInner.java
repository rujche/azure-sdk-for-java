// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Operation Resource. */
@Fluent
public final class OperationResourceInner {
    /*
     * End time of the operation
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Required if status == failed or status == canceled. This is the OData v4 error format, used by the RPC and will
     * go into the v2.2 Azure REST API guidelines.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /*
     * It should match what is used to GET the operation result
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * It must match the last segment of the "id" field, and will typically be a GUID / system generated value
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The status of the operation. (InProgress/Success/Failed/Cancelled)
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Start time of the operation
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /** Creates an instance of OperationResourceInner class. */
    public OperationResourceInner() {
    }

    /**
     * Get the endTime property: End time of the operation.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the operation.
     *
     * @param endTime the endTime value to set.
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the error property: Required if status == failed or status == canceled. This is the OData v4 error format,
     * used by the RPC and will go into the v2.2 Azure REST API guidelines.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Required if status == failed or status == canceled. This is the OData v4 error format,
     * used by the RPC and will go into the v2.2 Azure REST API guidelines.
     *
     * @param error the error value to set.
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the id property: It should match what is used to GET the operation result.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: It should match what is used to GET the operation result.
     *
     * @param id the id value to set.
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: It must match the last segment of the "id" field, and will typically be a GUID / system
     * generated value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: It must match the last segment of the "id" field, and will typically be a GUID / system
     * generated value.
     *
     * @param name the name value to set.
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: The status of the operation. (InProgress/Success/Failed/Cancelled).
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation. (InProgress/Success/Failed/Cancelled).
     *
     * @param status the status value to set.
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startTime property: Start time of the operation.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the operation.
     *
     * @param startTime the startTime value to set.
     * @return the OperationResourceInner object itself.
     */
    public OperationResourceInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
