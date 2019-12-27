package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.util.Map;

/**
 * @author zhangboqing
 * @date 2019/12/13
 */
public class HelloImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 扫描注解
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        String[] basePackages = (String[]) annotationAttributes.get("basePackages");

        // 扫描类
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry, false);
        // 指定类
//        TypeFilter helloServiceFilter = new AssignableTypeFilter(HelloService.class);
        // 指定注解
        TypeFilter helloServiceFilter = new AnnotationTypeFilter(HelloAnnotation.class);
        scanner.addIncludeFilter(helloServiceFilter);
        scanner.scan(basePackages);
    }


}
