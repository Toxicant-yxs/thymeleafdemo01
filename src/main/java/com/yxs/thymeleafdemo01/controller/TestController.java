package com.yxs.thymeleafdemo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/helloGit")
    public String hello() {
        System.out.println("hello");
        return "hello git";
    }
}
