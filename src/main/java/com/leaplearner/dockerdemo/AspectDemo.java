package com.leaplearner.dockerdemo;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
@AllArgsConstructor
public class AspectDemo {
    private final HttpServletRequest request;
    @SneakyThrows
    @Around("@annotation(inner)")
    public Object around(ProceedingJoinPoint point, Inner inner) {
        String key = request.getParameter("key");
        if(inner.value()){
            System.out.println("sss");
        }
        ResultMsg data = (ResultMsg) point.proceed();
        data.setExtData("aop");
        return data;
    }
}
