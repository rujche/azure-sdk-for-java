// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.integration.tests.servicebus.jms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ActiveProfiles;

import java.util.concurrent.Exchanger;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Disabled("Auth by workload identity is not supported now. Track issue: https://github.com/Azure/azure-sdk-for-java/issues/40897")
@ActiveProfiles("servicebus-jms-passwordless")
public class ServiceBusJmsPasswordlessIT {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceBusJmsPasswordlessIT.class);
    private static final String DATA = "service bus jms passwordless test";
    private static final String QUEUE_NAME = "passwordless_que001";
    private final Exchanger<String> EXCHANGER = new Exchanger<>();

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    @Timeout(70)
    void testServiceBusJmsOperation() throws InterruptedException {
        LOGGER.info("ServiceBusJmsPasswordlessIT begin.");
        jmsTemplate.convertAndSend(QUEUE_NAME, DATA);
        LOGGER.info("Send message: {}", DATA);
        String msg = EXCHANGER.exchange(null);
        Assertions.assertEquals(DATA, msg);
        LOGGER.info("ServiceBusJmsPasswordlessIT end.");
    }

    @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    void receiveQueueMessage(String message) throws InterruptedException {
        LOGGER.info("Received message from queue: {}", message);
        EXCHANGER.exchange(message);
    }
}
