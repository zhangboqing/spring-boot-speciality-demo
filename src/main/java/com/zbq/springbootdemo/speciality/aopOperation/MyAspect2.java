package com.zbq.springbootdemo.speciality.aopOperation;

import com.zbq.springbootdemo.service.MyOperation;
import com.zbq.springbootdemo.service.MyOperationManager;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@Order(1)
public class MyAspect2 {

    @DeclareParents(value="com.zbq.springbootdemo.service..*", defaultImpl=MyOperationManager.class)
    public static MyOperation myOperation;


//    @Before("execution(* com.zbq.springbootdemo.service.MyService.*(..))")
    public void before2() {
        log.info("before2 ");
    }


//    @Before("execution(* com.zbq.springbootdemo.service.MyService.*(..))")
    public void before3() {
        log.info("before3 ");
    }


//    @After("execution(* com.zbq.springbootdemo.service.MyService.*(..)) && this(myOperation)" )
    public void after2(JoinPoint joinPoint, MyOperation myOperation) {
        myOperation.operation();
        log.info("after2 ");
    }



}