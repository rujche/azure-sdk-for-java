// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User credentials used for publishing activity.
 */
@Fluent
public final class UserInner extends ProxyOnlyResource {
    /*
     * User resource specific properties
     */
    @JsonProperty(value = "properties")
    private UserProperties innerProperties;

    /**
     * Creates an instance of UserInner class.
     */
    public UserInner() {
    }

    /**
     * Get the innerProperties property: User resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private UserProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the publishingUsername property: Username used for publishing.
     * 
     * @return the publishingUsername value.
     */
    public String publishingUsername() {
        return this.innerProperties() == null ? null : this.innerProperties().publishingUsername();
    }

    /**
     * Set the publishingUsername property: Username used for publishing.
     * 
     * @param publishingUsername the publishingUsername value to set.
     * @return the UserInner object itself.
     */
    public UserInner withPublishingUsername(String publishingUsername) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withPublishingUsername(publishingUsername);
        return this;
    }

    /**
     * Get the publishingPassword property: Password used for publishing.
     * 
     * @return the publishingPassword value.
     */
    public String publishingPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().publishingPassword();
    }

    /**
     * Set the publishingPassword property: Password used for publishing.
     * 
     * @param publishingPassword the publishingPassword value to set.
     * @return the UserInner object itself.
     */
    public UserInner withPublishingPassword(String publishingPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withPublishingPassword(publishingPassword);
        return this;
    }

    /**
     * Get the publishingPasswordHash property: Password hash used for publishing.
     * 
     * @return the publishingPasswordHash value.
     */
    public String publishingPasswordHash() {
        return this.innerProperties() == null ? null : this.innerProperties().publishingPasswordHash();
    }

    /**
     * Set the publishingPasswordHash property: Password hash used for publishing.
     * 
     * @param publishingPasswordHash the publishingPasswordHash value to set.
     * @return the UserInner object itself.
     */
    public UserInner withPublishingPasswordHash(String publishingPasswordHash) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withPublishingPasswordHash(publishingPasswordHash);
        return this;
    }

    /**
     * Get the publishingPasswordHashSalt property: Password hash salt used for publishing.
     * 
     * @return the publishingPasswordHashSalt value.
     */
    public String publishingPasswordHashSalt() {
        return this.innerProperties() == null ? null : this.innerProperties().publishingPasswordHashSalt();
    }

    /**
     * Set the publishingPasswordHashSalt property: Password hash salt used for publishing.
     * 
     * @param publishingPasswordHashSalt the publishingPasswordHashSalt value to set.
     * @return the UserInner object itself.
     */
    public UserInner withPublishingPasswordHashSalt(String publishingPasswordHashSalt) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withPublishingPasswordHashSalt(publishingPasswordHashSalt);
        return this;
    }

    /**
     * Get the scmUri property: Url of SCM site.
     * 
     * @return the scmUri value.
     */
    public String scmUri() {
        return this.innerProperties() == null ? null : this.innerProperties().scmUri();
    }

    /**
     * Set the scmUri property: Url of SCM site.
     * 
     * @param scmUri the scmUri value to set.
     * @return the UserInner object itself.
     */
    public UserInner withScmUri(String scmUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withScmUri(scmUri);
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
