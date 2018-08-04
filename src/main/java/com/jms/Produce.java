package com.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;

@Service
public class Produce {

    @Autowired
    private JmsMessagingTemplate template;

    public void sendQueue() throws JMSException {
        for (int i = 1; i< 100;i++)
        template.convertAndSend("test-queue", new Person("name" + i, i));
    }

    public void sendTopic() throws JMSException, InterruptedException {
        for (int i = 1; i< 100;i++)
        template.convertAndSend("test-topic", new Person("name" + i,i));
    }
}
