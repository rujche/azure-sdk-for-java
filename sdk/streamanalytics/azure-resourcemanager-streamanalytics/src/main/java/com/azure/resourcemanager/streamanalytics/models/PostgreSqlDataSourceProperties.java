// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that are associated with an Azure SQL database data source.
 */
@Fluent
public class PostgreSqlDataSourceProperties {
    /*
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "server")
    private String server;

    /*
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "database")
    private String database;

    /*
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "table")
    private String table;

    /*
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "user")
    private String user;

    /*
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Max Writer count, currently only 1(single writer) and 0(based on query partition) are available. Optional on PUT
     * requests.
     */
    @JsonProperty(value = "maxWriterCount")
    private Float maxWriterCount;

    /*
     * Authentication Mode.
     */
    @JsonProperty(value = "authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * Creates an instance of PostgreSqlDataSourceProperties class.
     */
    public PostgreSqlDataSourceProperties() {
    }

    /**
     * Get the server property: The name of the SQL server containing the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the server value.
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the server property: The name of the SQL server containing the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param server the server value to set.
     * @return the PostgreSqlDataSourceProperties object itself.
     */
    public PostgreSqlDataSourceProperties withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the database property: The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the database value.
     */
    public String database() {
        return this.database;
    }

    /**
     * Set the database property: The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     * @param database the database value to set.
     * @return the PostgreSqlDataSourceProperties object itself.
     */
    public PostgreSqlDataSourceProperties withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the table property: The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @param table the table value to set.
     * @return the PostgreSqlDataSourceProperties object itself.
     */
    public PostgreSqlDataSourceProperties withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the user property: The user name that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the user value.
     */
    public String user() {
        return this.user;
    }

    /**
     * Set the user property: The user name that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param user the user value to set.
     * @return the PostgreSqlDataSourceProperties object itself.
     */
    public PostgreSqlDataSourceProperties withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the password property: The password that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param password the password value to set.
     * @return the PostgreSqlDataSourceProperties object itself.
     */
    public PostgreSqlDataSourceProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the maxWriterCount property: Max Writer count, currently only 1(single writer) and 0(based on query
     * partition) are available. Optional on PUT requests.
     * 
     * @return the maxWriterCount value.
     */
    public Float maxWriterCount() {
        return this.maxWriterCount;
    }

    /**
     * Set the maxWriterCount property: Max Writer count, currently only 1(single writer) and 0(based on query
     * partition) are available. Optional on PUT requests.
     * 
     * @param maxWriterCount the maxWriterCount value to set.
     * @return the PostgreSqlDataSourceProperties object itself.
     */
    public PostgreSqlDataSourceProperties withMaxWriterCount(Float maxWriterCount) {
        this.maxWriterCount = maxWriterCount;
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     * 
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     * 
     * @param authenticationMode the authenticationMode value to set.
     * @return the PostgreSqlDataSourceProperties object itself.
     */
    public PostgreSqlDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
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
