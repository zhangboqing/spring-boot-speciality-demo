package com.zbq.springbootdemo.common.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @author zhangboqing
 * @date 2019-11-15
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
public @interface MyAnnotation {

    @AliasFor("location")
    String value() default "";

    @AliasFor("value")
    String location() default "";

    @AliasFor(annotation = ComponentScan.class,attribute = "basePackages")
    String[] basePackages() default {};
}
