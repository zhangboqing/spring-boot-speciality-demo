package com.zbq.springbootdemo;

import com.zbq.springbootdemo.service.OneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    private OneService oneService;

    @Test
    void contextLoads() {
        oneService.run1();
    }

}
