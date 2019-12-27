package com.zbq.springbootdemo;

import org.springframework.boot.context.config.DelegatingApplicationContextInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.GenericTypeResolver;

/**
 * @author zhangboqing
 * @date 2019-11-19
 */
public class ClassTest {

    public static void main(String[] args) {
//        System.out.println(SpringBootDemoApplication.class.getName());
//        System.out.println(SpringBootDemoApplication.class.getCanonicalName());
//        System.out.println(SpringBootDemoApplication.class.getSimpleName());
//        System.out.println(SpringBootDemoApplication.class.getTypeName());

        Class<?> requiredType = GenericTypeResolver.resolveTypeArgument(DelegatingApplicationContextInitializer.class,
                ApplicationContextInitializer.class);
        System.out.println(requiredType);
    }
}
