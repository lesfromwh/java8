package com.ls.demo.beans;

import java.util.LinkedHashMap;

/**
 * 请求信息包装类
 *
 * @author liushuang 2017/9/21
 */
public class RequestInfo {

    private String url;

    private Class<?> returnType;

    private LinkedHashMap<String, String> params;

    public LinkedHashMap<String, String> getParams() {
        return params;
    }

    public void setParams(LinkedHashMap<String, String> params) {
        this.params = params;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Class<?> getReturnType() {
        return returnType;
    }

    public void setReturnType(Class<?> returnType) {
        this.returnType = returnType;
    }
}
