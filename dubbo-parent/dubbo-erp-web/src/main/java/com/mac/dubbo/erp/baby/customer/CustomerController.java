package com.mac.dubbo.erp.baby.customer;

import com.mac.dubbo.erp.baby.model.comm.MsgRequest;
import com.mac.dubbo.erp.baby.model.comm.MsgResponse;
import com.mac.dubbo.erp.baby.model.customer.Customer;
import com.mac.dubbo.erp.baby.model.order.Order;
import com.mac.dubbo.erp.baby.service.customer.CustomerService;
import com.mac.dubbo.erp.baby.service.order.OrderService;
import com.mac.dubbo.erp.baby.util.SnowFlake;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CustomerController {

    public static ClassPathXmlApplicationContext
            content = new ClassPathXmlApplicationContext("order-consumer.xml");

    /**
     * 创建客户假数据
     * @return
     */
    public static Customer setCustomer() {
        Customer customer = new Customer();
        customer.setId("561603");
        customer.setIntegral(56);
        return customer;
    }

    /**
     * 创建订单假数据
     * @return
     */
    public static Order setOrder() {
        SnowFlake snowFlake = new SnowFlake(2, 3);
        Order order = new Order();
        order.setId(snowFlake.nextId());
        order.setMoney(new BigDecimal(89.99));
        order.setCustomerId("561603");
        order.setOrderNo(snowFlake.nextId());
        return order;
    }

    public static boolean customerCreateOrder() {

        CustomerService customerService = (CustomerService) content.getBean("customerService");

        OrderService orderService = (OrderService) content.getBean("orderService");

        Customer customer = setCustomer();

        MsgResponse customerResponse = customerService.updateCustomerIntegralById(new MsgRequest(customer));

        // 更新客户积分失败
        if (customerResponse.getStatus() != 200) return false;

        Order order = setOrder();

        MsgResponse orderResponse = orderService.saveOrder(new MsgRequest(order));

        // 添加订单失败
        if (orderResponse.getStatus() != 200) return false;

        return true;
    }

    public static void main(String[] args) {
        boolean result = customerCreateOrder();
        System.out.println("客户下单结果输出结果为："+result);
    }

}
