package com.mac.dubbo.order;

public class OrderServiceImpl implements IOrderServices{

    @Override
    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("request请求成功，输出信息为：" + request);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("200");
        response.setMemo("请求成功！");
        return response;
    }
}
