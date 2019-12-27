package com.zbq.springbootdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2019-11-16
 */
@Component
@Slf4j
public class MyOperationManager implements MyOperation {

    @Override
    public void operation() {
      log.info(("MyOperationManager.operation()"));
    }
}
