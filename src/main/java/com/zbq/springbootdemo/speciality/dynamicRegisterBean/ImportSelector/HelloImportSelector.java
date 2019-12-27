package com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportSelector;

import com.zbq.springbootdemo.speciality.dynamicRegisterBean.ImportBeanDefinitionRegistrar.HelloService;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangboqing
 * @date 2019/12/18
 */
public class HelloImportSelector implements ImportSelector {

    private static final String[] IMPORTS = {
            HelloService.class.getName(),
    };


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return IMPORTS;
    }
}
