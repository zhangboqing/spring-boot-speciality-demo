package com.zbq.springbootdemo.speciality.startOperation;

import com.zbq.springbootdemo.service.StartOperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2019-11-07
 */
@Component
@Slf4j
public class MyApplicationRunner implements ApplicationRunner {
    @Autowired
    private StartOperationService startOperationService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info(">>>>>>>>>>>>>> ApplicationRunner:" + startOperationService.sayHello());
    }
}
