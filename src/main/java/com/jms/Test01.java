package com.jms;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.JMSException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Test01 {

    @Autowired
    private Produce produce;

    @Autowired
    private Customer customer;

    @Test
    public void testSendQueue() throws JMSException {
        produce.sendQueue();
    }

    @Test
    public void testSendTopic() throws JMSException, InterruptedException {
        produce.sendTopic();
    }
}
