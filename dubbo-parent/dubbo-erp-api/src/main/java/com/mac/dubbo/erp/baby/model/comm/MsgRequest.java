package com.mac.dubbo.erp.baby.model.comm;

import java.io.Serializable;

public class MsgRequest <T> implements Serializable {
    private static final long serialVersionUID = -6959736189253497555L;

    /**
     * 内容
     */
    private T target;

    public MsgRequest(){}

    public MsgRequest(T o) {
        this.target = o;
    }

    public T getTarget() {
        return target;
    }

    public void setTarget(T target) {
        this.target = target;
    }
}
