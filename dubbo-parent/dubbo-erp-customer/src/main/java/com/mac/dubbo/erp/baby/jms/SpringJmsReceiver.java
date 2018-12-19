package com.mac.dubbo.erp.baby.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.io.IOException;

/**
 * 阻塞方式接收
 */
public class SpringJmsReceiver {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:conf/service-jms.xml");

        System.in.read();

        /*JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");

        String msg = (String) jmsTemplate.receiveAndConvert();

        System.out.println(msg);*/
    }
}
