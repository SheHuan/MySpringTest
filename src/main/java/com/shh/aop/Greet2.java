package com.shh.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 向顾客打招呼
 */
@Component
@Aspect
public class Greet2 {
    /**
     * 定义切入点
     */
    @Pointcut("execution(* com.shh.aop.CoffeeShop.sale(..))")
    public void sale() {

    }

    /**
     * 前置通知
     */
    @Before("sale()")
    public void welcome() {
        System.out.println("前置通知：欢迎！");
    }

    /**
     * 后置通知
     */
    @AfterReturning("sale()")
    public void cashier() {
        System.out.println("后置通知：请扫码付款！");
    }

    /**
     * 异常通知
     */
    @AfterThrowing("sale()")
    public void soldOut() {
        System.out.println("异常通知：商品名不能为空！");
    }

    /**
     * 最终通知
     */
    @After("sale()")
    public void goodbye() {
        System.out.println("最终通知：再见！");
    }

    /**
     * 环绕通知
     */
//    @Around("sale()")
    public Object greeting(ProceedingJoinPoint pjp) {
        try {
            System.out.println("前置通知：欢迎！");
            // 获取切入点方法的参数
            Object[] params = pjp.getArgs();
            // 主动调用切入点方法
            Object result = pjp.proceed(params);
            System.out.println("后置通知：请扫码付款！");
            return result;
        } catch (Throwable throwable) {
            System.out.println("异常通知：商品名不能为空！");
            throw new RuntimeException(throwable);
        } finally {
            System.out.println("最终通知：再见！");
        }
    }
}
