package com.zbq.springbootdemo.speciality.startOperation;

import com.zbq.springbootdemo.service.StartOperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2019-11-07
 */
@Component
@Slf4j
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private StartOperationService startOperationService;

    @Override
    public void run(String... args) throws Exception {
        log.info(">>>>>>>>>>>>>> CommandLineRunner:" + startOperationService.sayHello());
    }
}
