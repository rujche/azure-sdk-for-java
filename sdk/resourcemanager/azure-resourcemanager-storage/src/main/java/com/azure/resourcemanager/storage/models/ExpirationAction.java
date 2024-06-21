// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The SAS Expiration Action defines the action to be performed when sasPolicy.sasExpirationPeriod is violated. The
 * 'Log' action can be used for audit purposes and the 'Block' action can be used to block and deny the usage of SAS
 * tokens that do not adhere to the sas policy expiration period.
 */
public final class ExpirationAction extends ExpandableStringEnum<ExpirationAction> {
    /**
     * Static value Log for ExpirationAction.
     */
    public static final ExpirationAction LOG = fromString("Log");

    /**
     * Static value Block for ExpirationAction.
     */
    public static final ExpirationAction BLOCK = fromString("Block");

    /**
     * Creates a new instance of ExpirationAction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpirationAction() {
    }

    /**
     * Creates or finds a ExpirationAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExpirationAction.
     */
    @JsonCreator
    public static ExpirationAction fromString(String name) {
        return fromString(name, ExpirationAction.class);
    }

    /**
     * Gets known ExpirationAction values.
     * 
     * @return known ExpirationAction values.
     */
    public static Collection<ExpirationAction> values() {
        return values(ExpirationAction.class);
    }
}
