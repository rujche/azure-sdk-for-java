// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/** Identifies the type of phonetic encoder to use with a PhoneticTokenFilter. */
public enum PhoneticEncoder {
    /** Enum value metaphone. */
    METAPHONE("metaphone"),

    /** Enum value doubleMetaphone. */
    DOUBLE_METAPHONE("doubleMetaphone"),

    /** Enum value soundex. */
    SOUNDEX("soundex"),

    /** Enum value refinedSoundex. */
    REFINED_SOUNDEX("refinedSoundex"),

    /** Enum value caverphone1. */
    CAVERPHONE1("caverphone1"),

    /** Enum value caverphone2. */
    CAVERPHONE2("caverphone2"),

    /** Enum value cologne. */
    COLOGNE("cologne"),

    /** Enum value nysiis. */
    NYSIIS("nysiis"),

    /** Enum value koelnerPhonetik. */
    KOELNER_PHONETIK("koelnerPhonetik"),

    /** Enum value haasePhonetik. */
    HAASE_PHONETIK("haasePhonetik"),

    /** Enum value beiderMorse. */
    BEIDER_MORSE("beiderMorse");

    /** The actual serialized value for a PhoneticEncoder instance. */
    private final String value;

    PhoneticEncoder(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PhoneticEncoder instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PhoneticEncoder object, or null if unable to parse.
     */
    public static PhoneticEncoder fromString(String value) {
        if (value == null) {
            return null;
        }
        PhoneticEncoder[] items = PhoneticEncoder.values();
        for (PhoneticEncoder item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
