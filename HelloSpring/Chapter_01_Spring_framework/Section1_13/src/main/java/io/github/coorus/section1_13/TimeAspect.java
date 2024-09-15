//package io.github.coorus.section1_13;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//import io.github.coorus.section1_13.user.User;
//
//@Aspect
//@Component  // 要被IOC管理才可以生效
//public class TimeAspect {
//    @Around("execution(* io.github.coorus.section1_13.user.UserService.*(..))")
//    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("方法开始");
//        long begin = System.currentTimeMillis();
//        Object res = joinPoint.proceed(joinPoint.getArgs());
//        System.out.println("方法结束");
//        System.out.println("执行时间为：" + (System.currentTimeMillis() - begin));
//        return res;
//    }
//}
