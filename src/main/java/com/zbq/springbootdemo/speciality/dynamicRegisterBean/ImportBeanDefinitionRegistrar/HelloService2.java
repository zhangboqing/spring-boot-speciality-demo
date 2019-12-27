package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangboqing
 * @date 2019/12/13
 */
@Slf4j
@HelloAnnotation
public class HelloService2 {
    public void sayHello() {
      log.info("Hello2!!!");
    }
}
