// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * whether to update webhookKey.
 */
public final class UpdateWebhookKey extends ExpandableStringEnum<UpdateWebhookKey> {
    /**
     * Static value true for UpdateWebhookKey.
     */
    public static final UpdateWebhookKey TRUE = fromString("true");

    /**
     * Static value false for UpdateWebhookKey.
     */
    public static final UpdateWebhookKey FALSE = fromString("false");

    /**
     * Creates a new instance of UpdateWebhookKey value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UpdateWebhookKey() {
    }

    /**
     * Creates or finds a UpdateWebhookKey from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UpdateWebhookKey.
     */
    public static UpdateWebhookKey fromString(String name) {
        return fromString(name, UpdateWebhookKey.class);
    }

    /**
     * Gets known UpdateWebhookKey values.
     * 
     * @return known UpdateWebhookKey values.
     */
    public static Collection<UpdateWebhookKey> values() {
        return values(UpdateWebhookKey.class);
    }
}
