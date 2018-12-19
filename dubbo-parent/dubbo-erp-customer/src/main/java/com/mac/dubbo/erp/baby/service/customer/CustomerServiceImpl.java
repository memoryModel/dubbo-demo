package com.mac.dubbo.erp.baby.service.customer;

import com.mac.dubbo.erp.baby.mapper.customer.CustomerMapper;
import com.mac.dubbo.erp.baby.model.comm.MsgRequest;
import com.mac.dubbo.erp.baby.model.comm.MsgResponse;
import com.mac.dubbo.erp.baby.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
        System.out.println("init service");
    }

    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 统计客户全部订单金额
     * @param request
     * @return
     */
    @Override
    public MsgResponse selectCustomerSumOrderMoney(MsgRequest request) {

        Customer customer = customerMapper.selectCustomerSumOrderMoney(request.getTarget().toString());

        return new MsgResponse(customer);
    }

    /**
     * 修改客户积分
     * @param request
     * @return
     */
    @Override
    public MsgResponse updateCustomerIntegralById(MsgRequest request) {
        MsgResponse response = new MsgResponse();
        Map<String, Object> map = new HashMap<>();
        try {
            Customer customer = (Customer) request.getTarget();
            customerMapper.updateCustomerIntegralById(customer);
            map.put("result", "success");
            response.setStatus(200);
        }
        catch (Exception e) {
            e.printStackTrace();
            map.put("result", "fail");
            response.setStatus(500);
        } finally {
            response.setData(map);
            return response;
        }
    }
}
