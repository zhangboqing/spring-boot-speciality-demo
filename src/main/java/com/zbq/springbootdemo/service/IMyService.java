package com.zbq.springbootdemo.service;

import com.zbq.springbootdemo.common.domain.Param1;

/**
 * @author zhangboqing
 * @date 2019-11-17
 */
public  interface  IMyService {

    String sayHello();

    String sayHelloByParam(Param1 param);

    String sayHelloForAnnotation();
}
