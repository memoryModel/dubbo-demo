package com.mac.dubbo.erp.baby.jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JmsSender {

    public static void main(String[] args) {
        ActiveMQConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory("tcp://172.16.93.101:61616");
        Connection connection = null;

        try {
            // 创建连接
            connection = connectionFactory.createConnection();
            connection.start();

            // 设置消息发送方的持久化消息为异步方式
            connectionFactory.setUseAsyncSend(true);

            Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);

            // 创建队列（如果队列已经存在则不会创建，first-queue是队列名称）
            // destination表示目的地
            Destination destination = session.createQueue("first-queue");
            // 创建消息发送者
            MessageProducer producer = session.createProducer(destination);

            TextMessage textMessage = session.createTextMessage("hello girl, My name is 马称");
            producer.send(textMessage);
            textMessage.setJMSDeliveryMode(DeliveryMode.PERSISTENT);

            session.commit();
            session.close();
        }
        catch (JMSException e) {
            e.printStackTrace();
        }
        finally {
            if (null != connection) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
