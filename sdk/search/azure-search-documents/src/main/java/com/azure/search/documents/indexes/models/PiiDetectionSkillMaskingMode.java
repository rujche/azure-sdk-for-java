// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** A string indicating what maskingMode to use to mask the personal information detected in the input text. */
public final class PiiDetectionSkillMaskingMode extends ExpandableStringEnum<PiiDetectionSkillMaskingMode> {
    /** Static value none for PiiDetectionSkillMaskingMode. */
    public static final PiiDetectionSkillMaskingMode NONE = fromString("none");

    /** Static value replace for PiiDetectionSkillMaskingMode. */
    public static final PiiDetectionSkillMaskingMode REPLACE = fromString("replace");

    /**
     * Creates or finds a PiiDetectionSkillMaskingMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PiiDetectionSkillMaskingMode.
     */
    @JsonCreator
    public static PiiDetectionSkillMaskingMode fromString(String name) {
        return fromString(name, PiiDetectionSkillMaskingMode.class);
    }

    /**
     * Gets known PiiDetectionSkillMaskingMode values.
     *
     * @return known PiiDetectionSkillMaskingMode values.
     */
    public static Collection<PiiDetectionSkillMaskingMode> values() {
        return values(PiiDetectionSkillMaskingMode.class);
    }
}
