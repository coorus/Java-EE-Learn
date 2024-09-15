package io.github.coorus.section1_13;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOP {
    @Around("execution(* io.github.coorus.section1_13.user.UserService.*(..))")
    public Object fun(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法开始！");
        Object res = joinPoint.proceed(joinPoint.getArgs());
        System.out.println("方法结束！");
        return res;
    }
}
