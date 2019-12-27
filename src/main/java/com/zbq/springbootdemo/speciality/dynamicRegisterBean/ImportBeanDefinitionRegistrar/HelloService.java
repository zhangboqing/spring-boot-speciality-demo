package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangboqing
 * @date 2019/12/13
 */
@Slf4j
@HelloAnnotation
public class HelloService {

    @Autowired
    private HelloService2 helloService2;

    public void sayHello() {
        helloService2.sayHello();
    }
}
