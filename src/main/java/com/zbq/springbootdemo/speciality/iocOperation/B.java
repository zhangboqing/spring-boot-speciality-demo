package com.zbq.springbootdemo.speciality.iocOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//@Service
@Component
public class B {
  @Autowired
  private A a;
 
  public B() {
    System.out.println("B construct");
  }
 
  @PostConstruct
  public void init() {
    initB();
  }
 
  private void initB(){
    System.out.println("B init");
  }

  public void say(){
    System.out.println("b say invoke");
  }
}