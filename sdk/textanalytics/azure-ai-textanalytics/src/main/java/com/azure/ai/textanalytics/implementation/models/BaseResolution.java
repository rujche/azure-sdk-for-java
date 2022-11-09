// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The abstract base class for entity resolutions. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "resolutionKind",
        defaultImpl = BaseResolution.class)
@JsonTypeName("BaseResolution")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AgeResolution", value = AgeResolution.class),
    @JsonSubTypes.Type(name = "VolumeResolution", value = VolumeResolution.class),
    @JsonSubTypes.Type(name = "SpeedResolution", value = SpeedResolution.class),
    @JsonSubTypes.Type(name = "AreaResolution", value = AreaResolution.class),
    @JsonSubTypes.Type(name = "LengthResolution", value = LengthResolution.class),
    @JsonSubTypes.Type(name = "InformationResolution", value = InformationResolution.class),
    @JsonSubTypes.Type(name = "TemperatureResolution", value = TemperatureResolution.class),
    @JsonSubTypes.Type(name = "WeightResolution", value = WeightResolution.class),
    @JsonSubTypes.Type(name = "CurrencyResolution", value = CurrencyResolution.class),
    @JsonSubTypes.Type(name = "BooleanResolution", value = BooleanResolution.class),
    @JsonSubTypes.Type(name = "DateTimeResolution", value = DateTimeResolution.class),
    @JsonSubTypes.Type(name = "NumberResolution", value = NumberResolution.class),
    @JsonSubTypes.Type(name = "OrdinalResolution", value = OrdinalResolution.class),
    @JsonSubTypes.Type(name = "TemporalSpanResolution", value = TemporalSpanResolution.class),
    @JsonSubTypes.Type(name = "NumericRangeResolution", value = NumericRangeResolution.class)
})
@Immutable
public class BaseResolution {}
