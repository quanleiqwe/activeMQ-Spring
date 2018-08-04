package com.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

@Configuration
public class JmsConfig {

    @Bean
    public ConnectionFactory getConnectionFactory(){
        ConnectionFactory factory = new  ActiveMQConnectionFactory("tcp://localhost:61616");
        ((ActiveMQConnectionFactory) factory).setTrustAllPackages(true);
        return factory;
    }

    @Bean()
    public Queue getQueue(){
        return new ActiveMQQueue("test-queue");
    }

    @Bean
    public Topic getTopic(){
        return new ActiveMQTopic("test-topic");
    }
}
