// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.resourcemanager.confluent.fluent.models.InvitationRecordInner;

/**
 * An immutable client-side representation of InvitationRecord.
 */
public interface InvitationRecord {
    /**
     * Gets the kind property: Type of account.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the id property: Id of the invitation.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the metadata property: Metadata of the record.
     * 
     * @return the metadata value.
     */
    MetadataEntity metadata();

    /**
     * Gets the email property: Email of the user.
     * 
     * @return the email value.
     */
    String email();

    /**
     * Gets the authType property: Auth type of the user.
     * 
     * @return the authType value.
     */
    String authType();

    /**
     * Gets the status property: Status of the invitation.
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the acceptedAt property: Accepted date time of the invitation.
     * 
     * @return the acceptedAt value.
     */
    String acceptedAt();

    /**
     * Gets the expiresAt property: Expiration date time of the invitation.
     * 
     * @return the expiresAt value.
     */
    String expiresAt();

    /**
     * Gets the inner com.azure.resourcemanager.confluent.fluent.models.InvitationRecordInner object.
     * 
     * @return the inner object.
     */
    InvitationRecordInner innerModel();
}
