/**
 * @author zhangboqing
 * @date 2019/12/13
 */
package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar;

/*
    简介
        ImportBeanDefinitionRegistrar类通过其他@Configuration类通过@Import的方式来加载，通常是启动类或配置类。
        然后会调用该接口方法，将其中要注册的类注册成bean。
        通过实现该接口的类拥有注册bean的能力。
        可以实现遗下Aware接口
            EnvironmentAware
            BeanFactoryAware
            BeanClassLoaderAware
            ResourceLoaderAware
*/