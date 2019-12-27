package com.zbq.springbootdemo.speciality.aopOperation;

import com.zbq.springbootdemo.common.annotation.MyAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Slf4j
public class MyAspect {
    /** 可以使用&&、||和!组合切入点表达式。您还可以通过名称引用切入点表达式。下面的例子展示了三个切入点表达式: */
    /**
     * 任何公共方法
     */
    @Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {
    }

    /**
     * springbootdemo包及其子包的所有方法
     */
    @Pointcut("within(com.zbq.springbootdemo..*)")
    private void inTrading() {
    }

    @Pointcut("anyPublicOperation() && inTrading()")
    private void tradingOperation() {
    }

    /**
     * Spring AOP用户可能最经常使用execution切入点指示器。执行表达式的格式如下:
     *   execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)
     *   modifiers-pattern 指定访问修饰符如public
     *   ret-type-pattern 指定返回类型如void；*是最常用的返回类型模式。它匹配任何返回类型
     *   declaring-type-pattern 指定类的全路径名称如com.zbq.springbootdemo.Myservice；如果指定了，通过 . 符号将其连接到name-pattern
     *   name-pattern 指定方法名称如get；您可以使用*通配符作为名称模式的全部或部分
     *   param-pattern 指定参数类型如String；()匹配不带参数的方法，而(..)匹配任意数量(零或更多)的参数。(*)模式匹配接受任意类型参数的方法；(*，String)匹配一个带有两个参数的方法。第一个可以是任何类型，第二个必须是字符串
     *   throws-pattern 指定抛出的异常类型
     *   除了返回类型模式(前面代码段中的rt-type-pattern)、name-pattern和param-pattern之外，其他所有部分都是可选的。
     *   AspectJ类型匹配的通配符：
     *
     *          *：匹配任何数量字符；
     *
     *          ..：匹配任何数量字符的重复，如在类型模式中匹配任何数量子包；而在方法参数模式中匹配任何数量参数。
     *
     *          +：匹配指定类型的子类型；仅能作为后缀放在类型模式后边。
     */

    /**
     * 其他
     */
    // 执行任何公用方法
    @Pointcut("execution(public * *(..))")
    private void pointcut1() {
    }

    // 任何以set开头的方法的执行:
    @Pointcut(" execution(* set*(..))")
    private void pointcut2() {
    }

    // 执行MyService接口定义的任何方法:
    @Pointcut("execution(* com.zbq.springbootdemo.service.MyService.*(..))")
    private void pointcut3() {
    }

    // 执行service包中定义的任何方法
    @Pointcut("execution(* com.zbq.springbootdemo.service..*(..))")
    private void pointcut4() {
    }

    // 执行service包及其子包中定义的任何方法
    @Pointcut("execution(* com.zbq.springbootdemo.service..*.*(..))")
    private void pointcut5() {
    }

    // 指定具体类中定义的任何方法
    @Pointcut("within(com.zbq.springbootdemo.service.MyService)")
    private void pointcut6_1() {
    }

    // 执行service包中定义的任何方法
    @Pointcut("within(com.zbq.springbootdemo.service.*)")
    private void pointcut6() {
    }

    // 执行service包及其子包中定义的任何方法
    @Pointcut("within(com.zbq.springbootdemo.service..*)")
    private void pointcut7() {
    }

    // 代理实现MyService接口的任何连接点(仅在Spring AOP中执行方法):
    @Pointcut("this(com.zbq.springbootdemo.service.MyService)")
    private void pointcut8() {
    }

    // 目标对象实现MyService接口的任何连接点(仅在Spring AOP中执行方法)
    @Pointcut("target(com.zbq.springbootdemo.service.MyService)")
    private void pointcut9() {
    }

    // 任何接受单个参数的连接点(只有在Spring AOP中才执行方法)，并且在运行时传递的参数是可序列化的:
    // 注意和execution(* *(java.io.Serializable))区分开，args(java.io.Serializable)表示在运行时传递的参数是可序列化的，后者表示参数是Serializable类型的
    @Pointcut("args(java.io.Serializable)")
    private void pointcut10() {
    }

    // 目标对象具有@MyAnnotation注释的任何连接点(仅在Spring AOP中执行方法):
    @Pointcut("@target(com.zbq.springbootdemo.common.annotation.MyAnnotation))")
    private void pointcut11() {
    }

    // 目标对象的声明类型具有@Transactional注释的任何连接点(仅在Spring AOP中执行方法):
    @Pointcut("@within(com.zbq.springbootdemo.common.annotation.MyAnnotation)")
    private void pointcut12() {
    }

    // 任何连接点(仅在Spring AOP中执行方法)，其中执行方法具有@MyAnnotation注解:
    @Pointcut("@annotation(com.zbq.springbootdemo.common.annotation.MyAnnotation)")
    private void pointcut13() {
    }

    // 任何接受单个参数的连接点(仅在Spring AOP中执行方法)，其中传递的参数的运行时类型有@classification注解:
//    @Pointcut("@args(com.xyz.security.Classified)")
    private void pointcut14() {
    }

    // 在名为tradeService的Spring bean上的任何连接点(仅在Spring AOP中执行方法):
    @Pointcut("bean(tradeService)")
    private void pointcut15() {
    }

    // 在具有匹配通配符表达式*Service的名称的Spring bean上的任何连接点(仅在Spring AOP中执行方法):
    @Pointcut("bean(*Service)")
    private void pointcut16() {
    }

    /** 演示代码  */
    @Pointcut("execution(* com.zbq.springbootdemo.service.MyService.*(..))")
    public void myPointcut() {
    }

    @Pointcut("execution(* com.zbq.springbootdemo.service.MyService.*(..))")
    public void myPointcut2() {
    }

    // 获取方法参数，必须使用args关键字
    @Pointcut(value = "execution(* com.zbq.springbootdemo.service.MyService.sayHelloByParam(String)) && args(param,.. )")
    public void myPointcut3(String param) {
    }

    // 拦截指定注解的
    // 指定注解并获取注解值，指定名称就行
    @Pointcut(value = "execution(* com.zbq.springbootdemo.service.MyService..*(..)) && @annotation(myAnnotation)")
    public void myPointcut4(MyAnnotation myAnnotation) {
    }

//    @Before("execution(* com.zbq.springbootdemo.service.MyService.*(..))")
//    @Before("myPointcut()")
//    @Before("within(com.zbq.springbootdemo.service.MyService)")
//    @Before("within(com.zbq.springbootdemo.service.IMyService+)")
//    @Before("this(com.zbq.springbootdemo.service.IMyService)")
//    @Before("this(com.zbq.springbootdemo.service.IMyService) && @target(com.zbq.springbootdemo.common.annotation.MyAnnotation)")
//    @Before("this(com.zbq.springbootdemo.service.IMyService) && @within(com.zbq.springbootdemo.common.annotation.MyAnnotation)")
    @Before("this(com.zbq.springbootdemo.service.MyService) && @args(com.zbq.springbootdemo.common.annotation.MyAnnotation)")
//    @Before("this(com.zbq.springbootdemo.service.MyService) && @annotation(com.zbq.springbootdemo.common.annotation.MyAnnotation)")
//    @Before("bean(myService)")
    public void before() {
        log.info("before ");
    }

//    @Before("myPointcut() && myPointcut2()")
//    public void before2() {
//        log.info("before ");
//    }

    // 参数
//    @Before("myPointcut3(param)")
    public void before3_1(String param) {
        log.info("before3_1 ,param="+param);
    }
    // 泛型参数
    // 注意这里，需要execution指定的方法对参数没有要求，但是args中param限制了参数必须为String,那么其他类型的参数方法不会被拦截
    // 但是对于泛型集合不生效，比如List<String> param，请求传List<Integer>也是可以的
//    @Before("execution(* com.zbq.springbootdemo.service.MyService.sayHelloByParam(..)) && args(param,.. )")
    public void before3_2(List<String> param) {
        log.info("before3_2 ,param="+param);
    }
    // 指定参数名,JoinPoint, ProceedingJoinPoint, JoinPoint.StaticPart不需要指定但是需要放在最前面
//    @Before(value = "execution(* com.zbq.springbootdemo.service.MyService.sayHelloByParam(..)) && target(target) && args(arg1,.. )",argNames="target,arg1")
    public void before3_3(JoinPoint joinPoint,Object target, String arg1) {
        log.info("before3_3 ,param="+arg1);
    }

//    @Before(value = "execution(* com.zbq.springbootdemo.service.MyService.sayHello(..))")
    public void before3_4(JoinPoint joinPoint) {
        log.info("before3_4");
    }



    // 注解
//    @Before("myPointcut4(myAnnotation)")
    public void before4(MyAnnotation myAnnotation) {
        log.info("before ,myAnnotation.value="+myAnnotation.value());
    }

//    @After("execution(* com.zbq.springbootdemo.service.MyService.*(..))")
    public void after() {
        log.info("after ");
    }

//    @AfterThrowing(value = "execution(* com.zbq.springbootdemo.service.MyService.*(..))",
//    throwing = "ex")
    public void afterThrowing(Throwable ex) {
        log.info("afterThrowing ");
        log.error("error:"+ex.getMessage());
    }

//    @AfterReturning(pointcut = "execution(* com.zbq.springbootdemo.service.MyService.*(..))",
//            returning = "retVal")
    public void afterReturning(String retVal) {
        log.info("AfterReturning ");
        // retVal为被拦截方法的返回结果
        log.info("retVal=" + retVal);
    }

//    @Around(value = "myPointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("around: before proceed");
        // 执行下一个通知或被拦截的方法，proceedResult为被拦截方法返回结果
        Object proceedResult = joinPoint.proceed();
        log.info("around: proceedResult="+proceedResult);
        // 代理对象
        Object proxyObject = joinPoint.getThis();
        log.info("around: proxyObject="+proxyObject);
        // 被代理对象
        Object target = joinPoint.getTarget();
        log.info("around: target="+target);
        // 方法请求参数
        Object[] args = joinPoint.getArgs();
        log.info("around: args="+args);
        // 方法签名
        Signature signature = joinPoint.getSignature();
        log.info("around: signature="+signature);
        log.info("around: after proceed");
        return proceedResult;
    }

}