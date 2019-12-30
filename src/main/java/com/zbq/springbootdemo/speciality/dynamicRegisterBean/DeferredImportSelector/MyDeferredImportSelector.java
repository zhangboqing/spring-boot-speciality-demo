package com.zbq.springbootdemo.speciality.dynamicRegisterBean.DeferredImportSelector;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author zhangboqing
 * @Date 2019/12/30
 */
public class MyDeferredImportSelector implements ImportSelector, BeanFactoryAware {


    private BeanFactory beanFactory;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        MyDeferrdImportSelectorService myDeferrdImportSelectorService = beanFactory.getBean(MyDeferrdImportSelectorService.class);
        myDeferrdImportSelectorService.say();
        return new String[0];
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
