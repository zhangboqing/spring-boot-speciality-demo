package com.zbq.springbootdemo.speciality.startOperation;

import com.zbq.springbootdemo.common.domain.Param1;
import com.zbq.springbootdemo.service.IMyService;
import com.zbq.springbootdemo.service.StartOperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2019-11-03
 */
@Component
@Slf4j
public class MyApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private StartOperationService startOperationService;
    @Autowired
    private IMyService myService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        log.info(">>>>>>>>>>>>>> ApplicationListener:" + myService.sayHello());
//        ((MyOperation)myService).operation();
        log.info(">>>>>>>>>>>>>> ApplicationListener:" + myService.sayHelloByParam(Param1.builder().name("212").build()));
//        log.info(">>>>>>>>>>>>>> ApplicationListener:" + myService.sayHelloByParam(Arrays.asList(1)));
//        log.info(">>>>>>>>>>>>>> ApplicationListener:" + myService.sayHelloForAnnotation());
//        log.info(">>>>>>>>>>>>>> ApplicationListener:" + myService.sayHelloForThrowException());
        log.info(">>>>>>>>>>>>>> ApplicationListener:" + startOperationService.sayHello());
    }
}
