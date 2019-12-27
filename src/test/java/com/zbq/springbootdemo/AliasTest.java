package com.zbq.springbootdemo;

import com.zbq.springbootdemo.common.annotation.MyAnnotation;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;

import java.util.Arrays;

@MyAnnotation(location = "location",basePackages = "2121")
public class AliasTest  {

    @Test
    public void test() {
        MyAnnotation myAnnotation = AnnotationUtils.getAnnotation(this.getClass(), MyAnnotation.class);
        System.out.println("value:" + myAnnotation.value() + ";loation:" + myAnnotation.location()+";basePackage:"+ Arrays.toString(myAnnotation.basePackages()));

//        ComponentScan componentScan = AnnotatedElementUtils.getMergedAnnotation(this.getClass(), ComponentScan.class);
        ComponentScan componentScan = AnnotatedElementUtils.findMergedAnnotation(this.getClass(), ComponentScan.class);
//        ComponentScan componentScan = AnnotationUtils.findAnnotation(this.getClass(), ComponentScan.class);
        System.out.println("basePackage:"+ Arrays.toString(componentScan.basePackages()));

    }
}