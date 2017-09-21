package com.ls.demo.beans;

/**
 * 包装服务器信息类，目前只有host，其他自己配置即可。
 *
 * @author liushuang 2017/9/21
 */
public class RestInfo {
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
