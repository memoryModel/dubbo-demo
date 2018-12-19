package com.mac.dubbo.erp.baby.mapper.customer;

import com.mac.dubbo.erp.baby.model.customer.Customer;

public interface CustomerMapper {

    /**
     * 统计客户全部订单金额
     * @param customerId
     * @return
     */
    Customer selectCustomerSumOrderMoney(String customerId);

    /**
     * 修改客户积分
     * @param customer
     */
    void updateCustomerIntegralById(Customer customer);
}
