// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Databricks SparkPython activity properties.
 */
@Fluent
public final class DatabricksSparkPythonActivityTypeProperties {
    /*
     * The URI of the Python file to be executed. DBFS paths are supported. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "pythonFile", required = true)
    private Object pythonFile;

    /*
     * Command line parameters that will be passed to the Python file.
     */
    @JsonProperty(value = "parameters")
    private List<Object> parameters;

    /*
     * A list of libraries to be installed on the cluster that will execute the job.
     */
    @JsonProperty(value = "libraries")
    private List<Map<String, Object>> libraries;

    /**
     * Creates an instance of DatabricksSparkPythonActivityTypeProperties class.
     */
    public DatabricksSparkPythonActivityTypeProperties() {
    }

    /**
     * Get the pythonFile property: The URI of the Python file to be executed. DBFS paths are supported. Type: string
     * (or Expression with resultType string).
     * 
     * @return the pythonFile value.
     */
    public Object pythonFile() {
        return this.pythonFile;
    }

    /**
     * Set the pythonFile property: The URI of the Python file to be executed. DBFS paths are supported. Type: string
     * (or Expression with resultType string).
     * 
     * @param pythonFile the pythonFile value to set.
     * @return the DatabricksSparkPythonActivityTypeProperties object itself.
     */
    public DatabricksSparkPythonActivityTypeProperties withPythonFile(Object pythonFile) {
        this.pythonFile = pythonFile;
        return this;
    }

    /**
     * Get the parameters property: Command line parameters that will be passed to the Python file.
     * 
     * @return the parameters value.
     */
    public List<Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Command line parameters that will be passed to the Python file.
     * 
     * @param parameters the parameters value to set.
     * @return the DatabricksSparkPythonActivityTypeProperties object itself.
     */
    public DatabricksSparkPythonActivityTypeProperties withParameters(List<Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     * 
     * @return the libraries value.
     */
    public List<Map<String, Object>> libraries() {
        return this.libraries;
    }

    /**
     * Set the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     * 
     * @param libraries the libraries value to set.
     * @return the DatabricksSparkPythonActivityTypeProperties object itself.
     */
    public DatabricksSparkPythonActivityTypeProperties withLibraries(List<Map<String, Object>> libraries) {
        this.libraries = libraries;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pythonFile() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property pythonFile in model DatabricksSparkPythonActivityTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabricksSparkPythonActivityTypeProperties.class);
}
