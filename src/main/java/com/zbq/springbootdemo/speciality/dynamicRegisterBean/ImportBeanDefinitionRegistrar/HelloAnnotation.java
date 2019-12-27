package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar;

import java.lang.annotation.*;

/**
 * @author zhangboqing
 * @date 2019/12/13
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HelloAnnotation {
}
