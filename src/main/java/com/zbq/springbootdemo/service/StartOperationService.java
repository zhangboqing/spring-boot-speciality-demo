package com.zbq.springbootdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhangboqing
 * @date 2019-11-03
 */
@Service
@Slf4j
public class StartOperationService {

    public String sayHello() {
        return "Hello StartOperationService!!!";
    }
}
