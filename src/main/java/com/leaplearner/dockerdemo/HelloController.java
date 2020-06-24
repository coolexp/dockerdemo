package com.leaplearner.dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/foo", produces = "application/json;charset=UTF-8")
    public String foo(HttpServletRequest request) {
        return "foo";
    }
    @RequestMapping(value = "/bar", produces = "application/json;charset=UTF-8")
    @Inner
    public String bar(HttpServletRequest request) {
        return "bar";
    }
}
