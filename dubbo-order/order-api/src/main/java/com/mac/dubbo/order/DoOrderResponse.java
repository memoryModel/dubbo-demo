package com.mac.dubbo.order;

import java.io.Serializable;
import java.util.Map;

public class DoOrderResponse implements Serializable {

    private static final long serialVersionUID = 2511808794826656001L;

    private String code;

    private String memo;

    private Map<String ,Object> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
