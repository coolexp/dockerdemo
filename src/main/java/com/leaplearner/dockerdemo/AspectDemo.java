package com.leaplearner.dockerdemo;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

    @SneakyThrows
    @Around("@annotation(inner)")
    public Object around(ProceedingJoinPoint point, Inner inner) {
        if(inner.value()){
            System.out.println("sss");
        }
        ResultMsg data = (ResultMsg) point.proceed();
        data.setExtData("aop");
        return data;
    }
}
