package com.mac.dubbo.erp.baby.model.customer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Customer implements Serializable {

    private static final long serialVersionUID = 7725707351632578064L;

    /**
     * 客户id
     */
    private String id;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 客户性别
     */
    private Integer sex;

    /**
     * 客户年龄
     */
    private Integer age;

    /**
     * 客户生日
     */
    private Date birth;

    /**
     * 客户积分
     */
    private Integer integral;

    /**
     * 订单总个数
     */
    private Integer orderCount;

    /**
     * 订单总金额
     */
    private BigDecimal orderMoneySum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}
