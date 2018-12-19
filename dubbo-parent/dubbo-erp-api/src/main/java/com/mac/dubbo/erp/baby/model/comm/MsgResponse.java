package com.mac.dubbo.erp.baby.model.comm;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 响应数据格式封装
 */
public class MsgResponse<T> implements Serializable {

    private static final long serialVersionUID = -4460489732452593982L;
    private Integer status;
    private String message;
    private Map<String,Object> data;

    public MsgResponse(){
        this.status = 200;
        this.message = "success";
        this.data = new HashMap<String, Object>();
    }
    public MsgResponse(Integer status, String message){
        this.status = status;
        this.message = message;
        this.data = new HashMap<String, Object>();
    }

    public MsgResponse(Integer status, String message, Map<String,Object> data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public MsgResponse(T o) {
        this.status = 200;
        this.message = "success";
    }

    public MsgResponse(Map<String,Object> data){
        this.status = 200;
        this.message = "success";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
