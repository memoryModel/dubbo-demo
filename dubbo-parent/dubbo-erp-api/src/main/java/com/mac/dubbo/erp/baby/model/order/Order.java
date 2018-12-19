package com.mac.dubbo.erp.baby.model.order;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable {

    private static final long serialVersionUID = -7351806969148810987L;
    /**
     * 主键ID
     */
    private String id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单金额
     */
    private BigDecimal money;

    /**
     * 客户Id
     */
    private String customerId;

    /**
     * 订单总个数
     */
    private Integer orderCount;

    /**
     * 订单总金额
     */
    private BigDecimal orderMoneySum;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getOrderMoneySum() {
        return orderMoneySum;
    }

    public void setOrderMoneySum(BigDecimal orderMoneySum) {
        this.orderMoneySum = orderMoneySum;
    }
}
