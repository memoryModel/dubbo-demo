package com.mac.dubbo.user;


import com.mac.dubbo.order.DoOrderRequest;
import com.mac.dubbo.order.DoOrderResponse;
import com.mac.dubbo.order.IOrderServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext
                content =
                new ClassPathXmlApplicationContext("order-consumer.xml");


        IOrderServices services = (IOrderServices) content.getBean("orderServices");
        DoOrderRequest request = new DoOrderRequest();
        request.setName("马百万");

        DoOrderResponse response = services.doOrder(request);

        System.out.println(response.getCode());
        System.out.println(response.getMemo());
        System.out.println(response.getData());

        System.out.println( "Hello World!" );
    }
}
