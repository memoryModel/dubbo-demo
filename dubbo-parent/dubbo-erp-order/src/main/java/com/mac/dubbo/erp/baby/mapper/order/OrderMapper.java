package com.mac.dubbo.erp.baby.mapper.order;

import com.mac.dubbo.erp.baby.model.order.Order;

public interface OrderMapper {

    /**
     * 根据员工号查询订单总金额
     * @param employeeId
     * @return
     */
    Order selectSumOrderByCustomerId(String employeeId);

    /**
     * 根据员工号查询订单个数
     * @param employeeId
     * @return
     */
    Order selectOrderCountByCustomerId(String employeeId);

    /**
     * 创建订单
     * @param order
     */
    void saveOrder(Order order);
}
