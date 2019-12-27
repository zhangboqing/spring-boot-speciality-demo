package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar;

import org.springframework.context.annotation.Configuration;

/**
 * @author zhangboqing
 * @date 2019/12/13
 */
@Configuration
//@ComponentScan("com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar")
//@Import(HelloImportBeanDefinitionRegistrar.class)
//@Import(HelloImportSelector.class)
//@Import(HelloAnnotationSpringFactoryImportSelector.class)
//@Import(MySpringFactoryImportSelector.class)
@EnableHelloAnnotation(scanBasePackages = {"com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar"})
public class HelloConfiguration {

}
