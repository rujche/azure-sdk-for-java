// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * VM-Host placement policy properties.
 */
@Fluent
public final class VmHostPlacementPolicyProperties extends PlacementPolicyProperties {
    /*
     * Placement Policy type
     */
    private PlacementPolicyType type = PlacementPolicyType.VM_HOST;

    /*
     * Virtual machine members list
     */
    private List<String> vmMembers;

    /*
     * Host members list
     */
    private List<String> hostMembers;

    /*
     * placement policy affinity type
     */
    private AffinityType affinityType;

    /*
     * vm-host placement policy affinity strength (should/must)
     */
    private AffinityStrength affinityStrength;

    /*
     * placement policy azure hybrid benefit opt-in type
     */
    private AzureHybridBenefitType azureHybridBenefitType;

    /*
     * The provisioning state
     */
    private PlacementPolicyProvisioningState provisioningState;

    /**
     * Creates an instance of VmHostPlacementPolicyProperties class.
     */
    public VmHostPlacementPolicyProperties() {
    }

    /**
     * Get the type property: Placement Policy type.
     * 
     * @return the type value.
     */
    @Override
    public PlacementPolicyType type() {
        return this.type;
    }

    /**
     * Get the vmMembers property: Virtual machine members list.
     * 
     * @return the vmMembers value.
     */
    public List<String> vmMembers() {
        return this.vmMembers;
    }

    /**
     * Set the vmMembers property: Virtual machine members list.
     * 
     * @param vmMembers the vmMembers value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withVmMembers(List<String> vmMembers) {
        this.vmMembers = vmMembers;
        return this;
    }

    /**
     * Get the hostMembers property: Host members list.
     * 
     * @return the hostMembers value.
     */
    public List<String> hostMembers() {
        return this.hostMembers;
    }

    /**
     * Set the hostMembers property: Host members list.
     * 
     * @param hostMembers the hostMembers value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withHostMembers(List<String> hostMembers) {
        this.hostMembers = hostMembers;
        return this;
    }

    /**
     * Get the affinityType property: placement policy affinity type.
     * 
     * @return the affinityType value.
     */
    public AffinityType affinityType() {
        return this.affinityType;
    }

    /**
     * Set the affinityType property: placement policy affinity type.
     * 
     * @param affinityType the affinityType value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withAffinityType(AffinityType affinityType) {
        this.affinityType = affinityType;
        return this;
    }

    /**
     * Get the affinityStrength property: vm-host placement policy affinity strength (should/must).
     * 
     * @return the affinityStrength value.
     */
    public AffinityStrength affinityStrength() {
        return this.affinityStrength;
    }

    /**
     * Set the affinityStrength property: vm-host placement policy affinity strength (should/must).
     * 
     * @param affinityStrength the affinityStrength value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withAffinityStrength(AffinityStrength affinityStrength) {
        this.affinityStrength = affinityStrength;
        return this;
    }

    /**
     * Get the azureHybridBenefitType property: placement policy azure hybrid benefit opt-in type.
     * 
     * @return the azureHybridBenefitType value.
     */
    public AzureHybridBenefitType azureHybridBenefitType() {
        return this.azureHybridBenefitType;
    }

    /**
     * Set the azureHybridBenefitType property: placement policy azure hybrid benefit opt-in type.
     * 
     * @param azureHybridBenefitType the azureHybridBenefitType value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withAzureHybridBenefitType(AzureHybridBenefitType azureHybridBenefitType) {
        this.azureHybridBenefitType = azureHybridBenefitType;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    @Override
    public PlacementPolicyProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VmHostPlacementPolicyProperties withState(PlacementPolicyState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VmHostPlacementPolicyProperties withDisplayName(String displayName) {
        super.withDisplayName(displayName);
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
        if (vmMembers() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property vmMembers in model VmHostPlacementPolicyProperties"));
        }
        if (hostMembers() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property hostMembers in model VmHostPlacementPolicyProperties"));
        }
        if (affinityType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property affinityType in model VmHostPlacementPolicyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VmHostPlacementPolicyProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("state", state() == null ? null : state().toString());
        jsonWriter.writeStringField("displayName", displayName());
        jsonWriter.writeArrayField("vmMembers", this.vmMembers, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("hostMembers", this.hostMembers, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("affinityType", this.affinityType == null ? null : this.affinityType.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("affinityStrength",
            this.affinityStrength == null ? null : this.affinityStrength.toString());
        jsonWriter.writeStringField("azureHybridBenefitType",
            this.azureHybridBenefitType == null ? null : this.azureHybridBenefitType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VmHostPlacementPolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VmHostPlacementPolicyProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VmHostPlacementPolicyProperties.
     */
    public static VmHostPlacementPolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VmHostPlacementPolicyProperties deserializedVmHostPlacementPolicyProperties
                = new VmHostPlacementPolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("state".equals(fieldName)) {
                    deserializedVmHostPlacementPolicyProperties
                        .withState(PlacementPolicyState.fromString(reader.getString()));
                } else if ("displayName".equals(fieldName)) {
                    deserializedVmHostPlacementPolicyProperties.withDisplayName(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVmHostPlacementPolicyProperties.provisioningState
                        = PlacementPolicyProvisioningState.fromString(reader.getString());
                } else if ("vmMembers".equals(fieldName)) {
                    List<String> vmMembers = reader.readArray(reader1 -> reader1.getString());
                    deserializedVmHostPlacementPolicyProperties.vmMembers = vmMembers;
                } else if ("hostMembers".equals(fieldName)) {
                    List<String> hostMembers = reader.readArray(reader1 -> reader1.getString());
                    deserializedVmHostPlacementPolicyProperties.hostMembers = hostMembers;
                } else if ("affinityType".equals(fieldName)) {
                    deserializedVmHostPlacementPolicyProperties.affinityType
                        = AffinityType.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedVmHostPlacementPolicyProperties.type
                        = PlacementPolicyType.fromString(reader.getString());
                } else if ("affinityStrength".equals(fieldName)) {
                    deserializedVmHostPlacementPolicyProperties.affinityStrength
                        = AffinityStrength.fromString(reader.getString());
                } else if ("azureHybridBenefitType".equals(fieldName)) {
                    deserializedVmHostPlacementPolicyProperties.azureHybridBenefitType
                        = AzureHybridBenefitType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVmHostPlacementPolicyProperties;
        });
    }
}
