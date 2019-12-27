package com.zbq.springbootdemo.speciality.startOperation;

import com.zbq.springbootdemo.service.StartOperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2019-11-03
 */
@Component
@Slf4j
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
    @Autowired
    private StartOperationService startOperationService;

    @Override
    public void afterSingletonsInstantiated() {
        log.info(">>>>>>>>>>>>>> SmartInitializingSingleton:" + startOperationService.sayHello());
    }
}
