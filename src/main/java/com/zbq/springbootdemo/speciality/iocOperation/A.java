package com.zbq.springbootdemo.speciality.iocOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//@Service
@Component
public class A {
  @Autowired
  private B b;
 
  public A() {
    System.out.println("A construct");
  }
 
  @PostConstruct
  public void init() {
    initA();
  }
 
  private void initA() {
    System.out.println("A init");
  }

  public void say(){
    b.say();
    System.out.println("A say invoke");
  }
}