package com.leaplearner.dockerdemo;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Inner {

    boolean value() default true;
    String[] field() default {};
}
