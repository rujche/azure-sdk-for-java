// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.implementation;

import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ScopingQuestionsInner;
import com.azure.resourcemanager.appcomplianceautomation.models.ScopingQuestion;
import com.azure.resourcemanager.appcomplianceautomation.models.ScopingQuestions;
import java.util.Collections;
import java.util.List;

public final class ScopingQuestionsImpl implements ScopingQuestions {
    private ScopingQuestionsInner innerObject;

    private final com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager;

    ScopingQuestionsImpl(ScopingQuestionsInner innerObject,
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ScopingQuestion> questions() {
        List<ScopingQuestion> inner = this.innerModel().questions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ScopingQuestionsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager() {
        return this.serviceManager;
    }
}
