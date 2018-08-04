package com.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class Customer {
    @Autowired
    JmsMessagingTemplate template;

    @JmsListener(destination = "test-queue")
    public void receiveQueue(Message<Person> message){
        //System.out.println(template.receiveAndConvert("test-queue",String.class));
        System.out.println(message.getPayload());
    }

    @JmsListener(destination = "test-topic")
    public void reciveTopic(Message<Person> message){
        System.out.println(message.getPayload());
    }

}
