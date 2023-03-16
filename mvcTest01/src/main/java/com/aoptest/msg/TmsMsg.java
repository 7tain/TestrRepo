package com.aoptest.msg;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@Aspect
public class TmsMsg {
    @Pointcut("execution(* com.aoptest.service.impl.UserImpl.say1())")
    private void fun(){}
    @Pointcut("execution(* com.aoptest.service.impl.UserImpl.say2())")
    private void fun2(){}
    @Pointcut("execution(* com.aoptest.service.impl.UserImpl.say3())")
    private void fun3(){}
    @Pointcut("execution(* com.aoptest.service.impl.UserImpl.say4())")
    private void fun4(){}
    @Pointcut("execution(* com.aoptest.service.impl.UserImpl.say5())")
    private void fun5(){}


  //前置
   @Before("fun()")
    public  void say(){
        System.out.println("前置通知");
    }
    //后置
    @AfterReturning("fun2()")
    public  void say2(){
        System.out.println("后置通知");

    //环绕
    } @Around("fun3()")
    public  void say3(){
        System.out.println("环绕通知");

    }
    //异常
    @AfterThrowing("fun4()")
    public  void say4(){
        System.out.println("异常通知");
    }
    //最终通知
    @After("fun5()")
    public  void say5(){
        System.out.println("最终通知");
    }




}
