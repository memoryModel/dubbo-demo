package com.mac.dubbo.erp.baby.service.customer;

import com.mac.dubbo.erp.baby.model.comm.MsgRequest;
import com.mac.dubbo.erp.baby.model.comm.MsgResponse;

public interface CustomerService {

    /**
     * 统计客户下单总金额
     * @param request
     * @return
     */
    MsgResponse selectCustomerSumOrderMoney(MsgRequest request);

    /**
     * 修改客户积分
     * @param request
     * @return
     */
    MsgResponse updateCustomerIntegralById(MsgRequest request);
}
