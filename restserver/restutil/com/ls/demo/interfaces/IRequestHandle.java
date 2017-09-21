package com.ls.demo.interfaces;

import com.ls.demo.beans.RequestInfo;
import com.ls.demo.beans.RestInfo;

/**
 * 处理网络请求接口
 *
 * @author liushuang 2017/9/21
 */
public interface IRequestHandle {
    Object handle(RestInfo restInfo, RequestInfo request);
}
