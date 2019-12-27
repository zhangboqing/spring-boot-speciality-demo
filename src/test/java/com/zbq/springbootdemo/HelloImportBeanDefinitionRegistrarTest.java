package com.zbq.springbootdemo;

import com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhangboqing
 * @date 2019/12/13
 */
//@SpringBootTest(classes = {HelloConfiguration.class})
@SpringBootTest
// 指定配置类
//@ContextConfiguration(classes = {HelloConfiguration.class})
public class HelloImportBeanDefinitionRegistrarTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testHelloService() {
        helloService.sayHello();
    }
}
