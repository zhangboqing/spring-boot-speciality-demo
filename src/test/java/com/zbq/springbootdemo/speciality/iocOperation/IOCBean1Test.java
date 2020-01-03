package com.zbq.springbootdemo.speciality.iocOperation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zhangboqing
 * @Date 2020-01-03
 */
@SpringBootTest
class IOCBean1Test {


    @Autowired
    private A iocBean1;

    @Test
    void say() {
        iocBean1.say();
    }
}