package com.zbq.springbootdemo.speciality.startOperation;

import com.zbq.springbootdemo.service.StartOperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;

/**
 * @author zhangboqing
 * @date 2019-11-03
 */
//@Component
@Slf4j
public class MySmartLifecycle implements SmartLifecycle {

    @Autowired
    private StartOperationService startOperationService;

    @Override
    public void start() {
        log.info(">>>>>>>>>>>>>> SmartLifecycle:" + startOperationService.sayHello());
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return true;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}
