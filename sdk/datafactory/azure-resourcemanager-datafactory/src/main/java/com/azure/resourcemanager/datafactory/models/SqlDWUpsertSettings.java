// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sql DW upsert option settings.
 */
@Fluent
public final class SqlDWUpsertSettings {
    /*
     * Schema name for interim table. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "interimSchemaName")
    private Object interimSchemaName;

    /*
     * Key column names for unique row identification. Type: array of strings (or Expression with resultType array of
     * strings).
     */
    @JsonProperty(value = "keys")
    private Object keys;

    /**
     * Creates an instance of SqlDWUpsertSettings class.
     */
    public SqlDWUpsertSettings() {
    }

    /**
     * Get the interimSchemaName property: Schema name for interim table. Type: string (or Expression with resultType
     * string).
     * 
     * @return the interimSchemaName value.
     */
    public Object interimSchemaName() {
        return this.interimSchemaName;
    }

    /**
     * Set the interimSchemaName property: Schema name for interim table. Type: string (or Expression with resultType
     * string).
     * 
     * @param interimSchemaName the interimSchemaName value to set.
     * @return the SqlDWUpsertSettings object itself.
     */
    public SqlDWUpsertSettings withInterimSchemaName(Object interimSchemaName) {
        this.interimSchemaName = interimSchemaName;
        return this;
    }

    /**
     * Get the keys property: Key column names for unique row identification. Type: array of strings (or Expression with
     * resultType array of strings).
     * 
     * @return the keys value.
     */
    public Object keys() {
        return this.keys;
    }

    /**
     * Set the keys property: Key column names for unique row identification. Type: array of strings (or Expression with
     * resultType array of strings).
     * 
     * @param keys the keys value to set.
     * @return the SqlDWUpsertSettings object itself.
     */
    public SqlDWUpsertSettings withKeys(Object keys) {
        this.keys = keys;
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
