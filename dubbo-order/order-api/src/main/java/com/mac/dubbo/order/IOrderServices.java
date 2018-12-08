package com.mac.dubbo.order;

public interface IOrderServices {

    /**
     * 下单操作
     * @param request
     * @return
     */
    DoOrderResponse doOrder(DoOrderRequest request);
}
