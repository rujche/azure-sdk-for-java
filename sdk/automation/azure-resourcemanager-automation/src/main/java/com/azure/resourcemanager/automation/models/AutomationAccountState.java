// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gets status of account. */
public final class AutomationAccountState extends ExpandableStringEnum<AutomationAccountState> {
    /** Static value Ok for AutomationAccountState. */
    public static final AutomationAccountState OK = fromString("Ok");

    /** Static value Unavailable for AutomationAccountState. */
    public static final AutomationAccountState UNAVAILABLE = fromString("Unavailable");

    /** Static value Suspended for AutomationAccountState. */
    public static final AutomationAccountState SUSPENDED = fromString("Suspended");

    /**
     * Creates or finds a AutomationAccountState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutomationAccountState.
     */
    @JsonCreator
    public static AutomationAccountState fromString(String name) {
        return fromString(name, AutomationAccountState.class);
    }

    /**
     * Gets known AutomationAccountState values.
     *
     * @return known AutomationAccountState values.
     */
    public static Collection<AutomationAccountState> values() {
        return values(AutomationAccountState.class);
    }
}
