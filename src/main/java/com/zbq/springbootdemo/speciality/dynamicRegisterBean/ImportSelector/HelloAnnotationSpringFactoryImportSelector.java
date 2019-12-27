package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportSelector;

import com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar.HelloAnnotation;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author zhangboqing
 * @date 2019/12/18
 */
public class HelloAnnotationSpringFactoryImportSelector implements DeferredImportSelector, BeanClassLoaderAware {

    private Class annotationClass = HelloAnnotation.class;

    private ClassLoader beanClassLoader;


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 加载META-INF/spring.factories中key为HelloAnnotation注解对应的value类
        List<String> factories = new ArrayList<>(new LinkedHashSet<>(SpringFactoriesLoader
                .loadFactoryNames(this.annotationClass, this.beanClassLoader)));

        return factories.toArray(new String[factories.size()]);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.beanClassLoader = classLoader;
    }

}
