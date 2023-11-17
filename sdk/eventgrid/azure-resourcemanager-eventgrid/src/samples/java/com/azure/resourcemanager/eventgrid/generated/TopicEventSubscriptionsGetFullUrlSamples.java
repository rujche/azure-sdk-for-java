// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for TopicEventSubscriptions GetFullUrl.
 */
public final class TopicEventSubscriptionsGetFullUrlSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * TopicEventSubscriptions_GetFullUrl.json
     */
    /**
     * Sample code: TopicEventSubscriptions_GetFullUrl.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void topicEventSubscriptionsGetFullUrl(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topicEventSubscriptions().getFullUrlWithResponse("examplerg", "exampleTopic1", "examplesubscription1",
            com.azure.core.util.Context.NONE);
    }
}
