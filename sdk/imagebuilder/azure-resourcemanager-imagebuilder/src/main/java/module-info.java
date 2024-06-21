// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.imagebuilder {
    requires transitive com.azure.core.management;
    exports com.azure.resourcemanager.imagebuilder;
    exports com.azure.resourcemanager.imagebuilder.fluent;
    exports com.azure.resourcemanager.imagebuilder.fluent.models;
    exports com.azure.resourcemanager.imagebuilder.models;
    opens com.azure.resourcemanager.imagebuilder.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.imagebuilder.models to com.azure.core, com.fasterxml.jackson.databind;
}