// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * SourceControl resource specific properties.
 */
@Fluent
public final class SourceControlProperties {
    /*
     * OAuth access token.
     */
    @JsonProperty(value = "token")
    private String token;

    /*
     * OAuth access token secret.
     */
    @JsonProperty(value = "tokenSecret")
    private String tokenSecret;

    /*
     * OAuth refresh token.
     */
    @JsonProperty(value = "refreshToken")
    private String refreshToken;

    /*
     * OAuth token expiration.
     */
    @JsonProperty(value = "expirationTime")
    private OffsetDateTime expirationTime;

    /**
     * Creates an instance of SourceControlProperties class.
     */
    public SourceControlProperties() {
    }

    /**
     * Get the token property: OAuth access token.
     * 
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: OAuth access token.
     * 
     * @param token the token value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the tokenSecret property: OAuth access token secret.
     * 
     * @return the tokenSecret value.
     */
    public String tokenSecret() {
        return this.tokenSecret;
    }

    /**
     * Set the tokenSecret property: OAuth access token secret.
     * 
     * @param tokenSecret the tokenSecret value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
        return this;
    }

    /**
     * Get the refreshToken property: OAuth refresh token.
     * 
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: OAuth refresh token.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the expirationTime property: OAuth token expiration.
     * 
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime property: OAuth token expiration.
     * 
     * @param expirationTime the expirationTime value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
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
