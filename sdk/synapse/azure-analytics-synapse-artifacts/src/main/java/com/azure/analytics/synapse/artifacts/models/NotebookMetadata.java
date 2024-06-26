// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Notebook root-level metadata. */
@Fluent
public final class NotebookMetadata {
    /*
     * Kernel information.
     */
    @JsonProperty(value = "kernelspec")
    private NotebookKernelSpec kernelspec;

    /*
     * Language info.
     */
    @JsonProperty(value = "language_info")
    private NotebookLanguageInfo languageInfo;

    /*
     * Notebook root-level metadata.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of NotebookMetadata class. */
    public NotebookMetadata() {}

    /**
     * Get the kernelspec property: Kernel information.
     *
     * @return the kernelspec value.
     */
    public NotebookKernelSpec getKernelspec() {
        return this.kernelspec;
    }

    /**
     * Set the kernelspec property: Kernel information.
     *
     * @param kernelspec the kernelspec value to set.
     * @return the NotebookMetadata object itself.
     */
    public NotebookMetadata setKernelspec(NotebookKernelSpec kernelspec) {
        this.kernelspec = kernelspec;
        return this;
    }

    /**
     * Get the languageInfo property: Language info.
     *
     * @return the languageInfo value.
     */
    public NotebookLanguageInfo getLanguageInfo() {
        return this.languageInfo;
    }

    /**
     * Set the languageInfo property: Language info.
     *
     * @param languageInfo the languageInfo value to set.
     * @return the NotebookMetadata object itself.
     */
    public NotebookMetadata setLanguageInfo(NotebookLanguageInfo languageInfo) {
        this.languageInfo = languageInfo;
        return this;
    }

    /**
     * Get the additionalProperties property: Notebook root-level metadata.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Notebook root-level metadata.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the NotebookMetadata object itself.
     */
    public NotebookMetadata setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
