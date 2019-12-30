package com.zbq.springbootdemo.speciality.dynamicRegisterBean.DeferredImportSelector;

import com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar.EnableHelloAnnotation;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhangboqing
 * @date 2019/12/13
 */
@Configuration
@Import(MyDeferredImportSelector.class)
@AutoConfigureAfter({MyDeferrdImportSelectorServiceAutoConfiguraion.class})
public class MyDeferredImportSelectorConfiguration {

}
