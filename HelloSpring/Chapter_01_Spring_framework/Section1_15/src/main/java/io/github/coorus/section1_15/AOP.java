package io.github.coorus.section1_15;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AOP {
    //static int flag = 0;
    //@Before("execution(* io.github.coorus.section1_15.user.UserService.*(..))")
    //public void before(JoinPoint joinPoint) {
    //    System.out.println((++flag) + " 前置通知@Before");
    //}
    //
    //@After("execution(* io.github.coorus.section1_15.user.UserService.*(..))")
    //public void after(JoinPoint joinPoint) {
    //    System.out.println((++flag) + " 后置通知@After");
    //}
    //
    //@AfterReturning(value = "execution(* io.github.coorus.section1_15.user.UserService.*(..))",
    //        returning = "returnValue")
    //public void afterReturning(JoinPoint joinPoint, Object returnValue) {
    //    String methodName = joinPoint.getSignature().getName();
    //    System.out.println((++flag) + " 返回通知 目标方法: " + methodName
    //            + "  返回值: " + returnValue);
    //}
    //
    //@Around("execution(* io.github.coorus.section1_15.user.UserService.*(..))")
    //public void around(ProceedingJoinPoint joinPoint) {
    //    System.out.println((++flag) + " @Around前置通知");
    //    try {
    //        Object proceed = joinPoint.proceed(joinPoint.getArgs());
    //        System.out.println((++flag) + " @Around返回通知");
    //    } catch (Throwable e) {
    //        System.out.println((++flag) + " @Around异常通知");
    //        throw new RuntimeException(e);
    //    } finally {
    //        System.out.println((++flag) + " @Around后置通知");
    //    }
    //}

    //@Before("@annotation(io.github.coorus.section1_15.annotation.Log)")
    //public void before() {
    //    System.out.println("前置通知@Before");
    //}

    //@Before("@within(org.springframework.stereotype.Service) && !execution(* io.github.coorus.section1_15.user.UserService.remove(..))")
    //public void before() {
    //    System.out.println("前置通知@Before");
    //}

    @Around("@annotation(io.github.coorus.section1_15.annotation.Log)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getSignature().getName());
        try {
            Object proceed = joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable e) {
            throw new RuntimeException();
        } finally {
            System.out.println(joinPoint.getSignature());
        }
        return joinPoint.getSignature().getName();
    }
}
