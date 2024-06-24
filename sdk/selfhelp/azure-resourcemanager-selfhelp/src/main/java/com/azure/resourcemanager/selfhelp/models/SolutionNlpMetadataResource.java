// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.selfhelp.fluent.models.NlpSolutions;
import java.io.IOException;
import java.util.List;

/**
 * Nlp Metadata resource.
 */
@Fluent
public final class SolutionNlpMetadataResource extends ProxyResource {
    /*
     * Solution metadata Resource properties.
     */
    private NlpSolutions innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of SolutionNlpMetadataResource class.
     */
    public SolutionNlpMetadataResource() {
    }

    /**
     * Get the innerProperties property: Solution metadata Resource properties.
     * 
     * @return the innerProperties value.
     */
    private NlpSolutions innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the problemTitle property: Title of the problem classification.
     * 
     * @return the problemTitle value.
     */
    public String problemTitle() {
        return this.innerProperties() == null ? null : this.innerProperties().problemTitle();
    }

    /**
     * Set the problemTitle property: Title of the problem classification.
     * 
     * @param problemTitle the problemTitle value to set.
     * @return the SolutionNlpMetadataResource object itself.
     */
    public SolutionNlpMetadataResource withProblemTitle(String problemTitle) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NlpSolutions();
        }
        this.innerProperties().withProblemTitle(problemTitle);
        return this;
    }

    /**
     * Get the problemDescription property: Description of the problem classification.
     * 
     * @return the problemDescription value.
     */
    public String problemDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().problemDescription();
    }

    /**
     * Set the problemDescription property: Description of the problem classification.
     * 
     * @param problemDescription the problemDescription value to set.
     * @return the SolutionNlpMetadataResource object itself.
     */
    public SolutionNlpMetadataResource withProblemDescription(String problemDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NlpSolutions();
        }
        this.innerProperties().withProblemDescription(problemDescription);
        return this;
    }

    /**
     * Get the serviceId property: Id of the service
     * (https://learn.microsoft.com/en-us/rest/api/support/services?view=rest-support-2020-04-01) that may be used to
     * create a support ticket.
     * 
     * @return the serviceId value.
     */
    public String serviceId() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceId();
    }

    /**
     * Set the serviceId property: Id of the service
     * (https://learn.microsoft.com/en-us/rest/api/support/services?view=rest-support-2020-04-01) that may be used to
     * create a support ticket.
     * 
     * @param serviceId the serviceId value to set.
     * @return the SolutionNlpMetadataResource object itself.
     */
    public SolutionNlpMetadataResource withServiceId(String serviceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NlpSolutions();
        }
        this.innerProperties().withServiceId(serviceId);
        return this;
    }

    /**
     * Get the problemClassificationId property: Id of the ProblemClassification
     * (https://learn.microsoft.com/en-us/rest/api/support/problem-classifications?view=rest-support-2020-04-01) that
     * may be used to create a support ticket.
     * 
     * @return the problemClassificationId value.
     */
    public String problemClassificationId() {
        return this.innerProperties() == null ? null : this.innerProperties().problemClassificationId();
    }

    /**
     * Set the problemClassificationId property: Id of the ProblemClassification
     * (https://learn.microsoft.com/en-us/rest/api/support/problem-classifications?view=rest-support-2020-04-01) that
     * may be used to create a support ticket.
     * 
     * @param problemClassificationId the problemClassificationId value to set.
     * @return the SolutionNlpMetadataResource object itself.
     */
    public SolutionNlpMetadataResource withProblemClassificationId(String problemClassificationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NlpSolutions();
        }
        this.innerProperties().withProblemClassificationId(problemClassificationId);
        return this;
    }

    /**
     * Get the solutions property: The list of solution metadata.
     * 
     * @return the solutions value.
     */
    public List<SolutionMetadataProperties> solutions() {
        return this.innerProperties() == null ? null : this.innerProperties().solutions();
    }

    /**
     * Set the solutions property: The list of solution metadata.
     * 
     * @param solutions the solutions value to set.
     * @return the SolutionNlpMetadataResource object itself.
     */
    public SolutionNlpMetadataResource withSolutions(List<SolutionMetadataProperties> solutions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NlpSolutions();
        }
        this.innerProperties().withSolutions(solutions);
        return this;
    }

    /**
     * Get the relatedServices property: The set of services that are most likely related to the request. If
     * relatedServices is included in the response then solutions may not be discovered until the client calls a second
     * time specifying one of the service Ids in the relatedServices object.
     * 
     * @return the relatedServices value.
     */
    public List<ClassificationService> relatedServices() {
        return this.innerProperties() == null ? null : this.innerProperties().relatedServices();
    }

    /**
     * Set the relatedServices property: The set of services that are most likely related to the request. If
     * relatedServices is included in the response then solutions may not be discovered until the client calls a second
     * time specifying one of the service Ids in the relatedServices object.
     * 
     * @param relatedServices the relatedServices value to set.
     * @return the SolutionNlpMetadataResource object itself.
     */
    public SolutionNlpMetadataResource withRelatedServices(List<ClassificationService> relatedServices) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NlpSolutions();
        }
        this.innerProperties().withRelatedServices(relatedServices);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SolutionNlpMetadataResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SolutionNlpMetadataResource if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SolutionNlpMetadataResource.
     */
    public static SolutionNlpMetadataResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SolutionNlpMetadataResource deserializedSolutionNlpMetadataResource = new SolutionNlpMetadataResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSolutionNlpMetadataResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSolutionNlpMetadataResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSolutionNlpMetadataResource.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSolutionNlpMetadataResource.innerProperties = NlpSolutions.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSolutionNlpMetadataResource.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSolutionNlpMetadataResource;
        });
    }
}
