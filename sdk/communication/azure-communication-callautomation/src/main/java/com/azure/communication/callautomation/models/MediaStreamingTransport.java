// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines values for MediaStreamingTransportType. */
public final class MediaStreamingTransport extends ExpandableStringEnum<MediaStreamingTransport> {
    /** Static value websocket for MediaStreamingTransportType. */
    public static final MediaStreamingTransport WEBSOCKET = fromString("websocket");

    /**
     * Creates or finds a MediaStreamingTransportType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MediaStreamingTransportType.
     */
    public static MediaStreamingTransport fromString(String name) {
        return fromString(name, MediaStreamingTransport.class);
    }

    /** @return known MediaStreamingTransportType values. */
    public static Collection<MediaStreamingTransport> values() {
        return values(MediaStreamingTransport.class);
    }
}
