package com.spring.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return "hello~ user-server! i'm " + name;
    }

}
