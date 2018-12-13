package com.mac.dubbo.order;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        try {
            //Main.main(args);
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("order-provider.xml");
            context.start();
            System.out.println( "Hello World!" );
            System.in.read();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
