// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import java.util.Map;

/** Event data for Microsoft.Devices.DeviceTelemetry event. */
@Fluent
public final class IotHubDeviceTelemetryEventData extends DeviceTelemetryEventProperties {
    /** Creates an instance of IotHubDeviceTelemetryEventData class. */
    public IotHubDeviceTelemetryEventData() {}

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceTelemetryEventData setBody(Object body) {
        super.setBody(body);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceTelemetryEventData setProperties(Map<String, String> properties) {
        super.setProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceTelemetryEventData setSystemProperties(Map<String, String> systemProperties) {
        super.setSystemProperties(systemProperties);
        return this;
    }
}
