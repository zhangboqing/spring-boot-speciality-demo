package com.zbq.springbootdemo.service;

import com.zbq.springbootdemo.common.annotation.MyAnnotation;
import com.zbq.springbootdemo.common.domain.Param1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhangboqing
 * @date 2019-11-03
 */
@Service
@Slf4j
public class MyService implements IMyService {

    @Override
    public String sayHello() {
        log.info("====> invoke MyService.sayHello()");
//        privateGet();
//        publicGet();
        return "Hello Baby!!!";
    }

    @Override
    public String sayHelloByParam(Param1 param) {
        log.info("====> invoke MyService.sayHello(T param),param="+param);
        return "Hello Baby!!!";
    }

    @Override
    @MyAnnotation("噢耶注解值")
    public String sayHelloForAnnotation() {
        log.info("====> invoke MyService.sayHelloForAnnotation()");
        return "Hello Baby!!!";
    }

    private void privateGet() {
        log.info("====> invoke MyService.privateGet()");
    }

    public String publicGet() {
        log.info("====> invoke MyService.publicGet()");
        return "get";
    }

    public String sayHelloForThrowException() {
        log.info("====> invoke MyService.sayHello2()");
        int a = 1/0;
        return "Hello Baby!!!";
    }
}
