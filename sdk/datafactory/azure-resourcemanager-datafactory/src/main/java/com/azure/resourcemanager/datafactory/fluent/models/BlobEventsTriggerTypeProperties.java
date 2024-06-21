// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.BlobEventTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Blob Events Trigger properties.
 */
@Fluent
public final class BlobEventsTriggerTypeProperties {
    /*
     * The blob path must begin with the pattern provided for trigger to fire. For example, '/records/blobs/december/'
     * will only fire the trigger for blobs in the december folder under the records container. At least one of these
     * must be provided: blobPathBeginsWith, blobPathEndsWith.
     */
    @JsonProperty(value = "blobPathBeginsWith")
    private String blobPathBeginsWith;

    /*
     * The blob path must end with the pattern provided for trigger to fire. For example, 'december/boxes.csv' will only
     * fire the trigger for blobs named boxes in a december folder. At least one of these must be provided:
     * blobPathBeginsWith, blobPathEndsWith.
     */
    @JsonProperty(value = "blobPathEndsWith")
    private String blobPathEndsWith;

    /*
     * If set to true, blobs with zero bytes will be ignored.
     */
    @JsonProperty(value = "ignoreEmptyBlobs")
    private Boolean ignoreEmptyBlobs;

    /*
     * The type of events that cause this trigger to fire.
     */
    @JsonProperty(value = "events", required = true)
    private List<BlobEventTypes> events;

    /*
     * The ARM resource ID of the Storage Account.
     */
    @JsonProperty(value = "scope", required = true)
    private String scope;

    /**
     * Creates an instance of BlobEventsTriggerTypeProperties class.
     */
    public BlobEventsTriggerTypeProperties() {
    }

    /**
     * Get the blobPathBeginsWith property: The blob path must begin with the pattern provided for trigger to fire. For
     * example, '/records/blobs/december/' will only fire the trigger for blobs in the december folder under the records
     * container. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
     * @return the blobPathBeginsWith value.
     */
    public String blobPathBeginsWith() {
        return this.blobPathBeginsWith;
    }

    /**
     * Set the blobPathBeginsWith property: The blob path must begin with the pattern provided for trigger to fire. For
     * example, '/records/blobs/december/' will only fire the trigger for blobs in the december folder under the records
     * container. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
     * @param blobPathBeginsWith the blobPathBeginsWith value to set.
     * @return the BlobEventsTriggerTypeProperties object itself.
     */
    public BlobEventsTriggerTypeProperties withBlobPathBeginsWith(String blobPathBeginsWith) {
        this.blobPathBeginsWith = blobPathBeginsWith;
        return this;
    }

    /**
     * Get the blobPathEndsWith property: The blob path must end with the pattern provided for trigger to fire. For
     * example, 'december/boxes.csv' will only fire the trigger for blobs named boxes in a december folder. At least one
     * of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
     * @return the blobPathEndsWith value.
     */
    public String blobPathEndsWith() {
        return this.blobPathEndsWith;
    }

    /**
     * Set the blobPathEndsWith property: The blob path must end with the pattern provided for trigger to fire. For
     * example, 'december/boxes.csv' will only fire the trigger for blobs named boxes in a december folder. At least one
     * of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
     * @param blobPathEndsWith the blobPathEndsWith value to set.
     * @return the BlobEventsTriggerTypeProperties object itself.
     */
    public BlobEventsTriggerTypeProperties withBlobPathEndsWith(String blobPathEndsWith) {
        this.blobPathEndsWith = blobPathEndsWith;
        return this;
    }

    /**
     * Get the ignoreEmptyBlobs property: If set to true, blobs with zero bytes will be ignored.
     * 
     * @return the ignoreEmptyBlobs value.
     */
    public Boolean ignoreEmptyBlobs() {
        return this.ignoreEmptyBlobs;
    }

    /**
     * Set the ignoreEmptyBlobs property: If set to true, blobs with zero bytes will be ignored.
     * 
     * @param ignoreEmptyBlobs the ignoreEmptyBlobs value to set.
     * @return the BlobEventsTriggerTypeProperties object itself.
     */
    public BlobEventsTriggerTypeProperties withIgnoreEmptyBlobs(Boolean ignoreEmptyBlobs) {
        this.ignoreEmptyBlobs = ignoreEmptyBlobs;
        return this;
    }

    /**
     * Get the events property: The type of events that cause this trigger to fire.
     * 
     * @return the events value.
     */
    public List<BlobEventTypes> events() {
        return this.events;
    }

    /**
     * Set the events property: The type of events that cause this trigger to fire.
     * 
     * @param events the events value to set.
     * @return the BlobEventsTriggerTypeProperties object itself.
     */
    public BlobEventsTriggerTypeProperties withEvents(List<BlobEventTypes> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the scope property: The ARM resource ID of the Storage Account.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The ARM resource ID of the Storage Account.
     * 
     * @param scope the scope value to set.
     * @return the BlobEventsTriggerTypeProperties object itself.
     */
    public BlobEventsTriggerTypeProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (events() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property events in model BlobEventsTriggerTypeProperties"));
        }
        if (scope() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property scope in model BlobEventsTriggerTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobEventsTriggerTypeProperties.class);
}
