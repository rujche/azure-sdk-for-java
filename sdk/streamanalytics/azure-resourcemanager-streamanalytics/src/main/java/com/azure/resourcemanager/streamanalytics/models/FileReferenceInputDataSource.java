// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.FileReferenceInputDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a file input data source that contains reference data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("File")
@Fluent
public final class FileReferenceInputDataSource extends ReferenceInputDataSource {
    /*
     * The properties that are associated with a file input containing reference data. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private FileReferenceInputDataSourceProperties innerProperties;

    /**
     * Creates an instance of FileReferenceInputDataSource class.
     */
    public FileReferenceInputDataSource() {
    }

    /**
     * Get the innerProperties property: The properties that are associated with a file input containing reference
     * data. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    private FileReferenceInputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the path property: The path of the file.
     * 
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: The path of the file.
     * 
     * @param path the path value to set.
     * @return the FileReferenceInputDataSource object itself.
     */
    public FileReferenceInputDataSource withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileReferenceInputDataSourceProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
