// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Attaches queue selectors to a job when the RouterRule is resolved.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ruleEngine")
@Immutable
public final class RuleEngineQueueSelectorAttachmentInternal extends QueueSelectorAttachmentInternal {

    /*
     * A RouterRule that resolves a collection of queue selectors to attach.
     */
    @Generated
    @JsonProperty(value = "rule")
    private RouterRuleInternal rule;

    /**
     * Creates an instance of RuleEngineQueueSelectorAttachmentInternal class.
     *
     * @param rule the rule value to set.
     */
    @Generated
    @JsonCreator
    public RuleEngineQueueSelectorAttachmentInternal(@JsonProperty(value = "rule") RouterRuleInternal rule) {
        this.rule = rule;
    }

    /**
     * Get the rule property: A RouterRule that resolves a collection of queue selectors to attach.
     *
     * @return the rule value.
     */
    @Generated
    public RouterRuleInternal getRule() {
        return this.rule;
    }
}
