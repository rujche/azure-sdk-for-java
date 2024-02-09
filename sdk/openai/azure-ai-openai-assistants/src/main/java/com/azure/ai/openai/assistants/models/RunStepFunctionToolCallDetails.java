// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The detailed information about the function called by the model.
 */
@Immutable
public final class RunStepFunctionToolCallDetails {

    /*
     * The name of the function.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The arguments that the model requires are provided to the named function.
     */
    @Generated
    @JsonProperty(value = "arguments")
    private String arguments;

    /*
     * The output of the function, only populated for function calls that have already have had their outputs
     * submitted.
     */
    @Generated
    @JsonProperty(value = "output")
    private String output;

    /**
     * Creates an instance of RunStepFunctionToolCallDetails class.
     *
     * @param name the name value to set.
     * @param arguments the arguments value to set.
     * @param output the output value to set.
     */
    @Generated
    @JsonCreator
    private RunStepFunctionToolCallDetails(@JsonProperty(value = "name") String name,
        @JsonProperty(value = "arguments") String arguments, @JsonProperty(value = "output") String output) {
        this.name = name;
        this.arguments = arguments;
        this.output = output;
    }

    /**
     * Get the name property: The name of the function.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the arguments property: The arguments that the model requires are provided to the named function.
     *
     * @return the arguments value.
     */
    @Generated
    public String getArguments() {
        return this.arguments;
    }

    /**
     * Get the output property: The output of the function, only populated for function calls that have already have
     * had their outputs submitted.
     *
     * @return the output value.
     */
    @Generated
    public String getOutput() {
        return this.output;
    }
}
