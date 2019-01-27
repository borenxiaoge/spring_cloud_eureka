package com.spring.cloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    //    @Value("${name}")
    String name;

    @RequestMapping("/hi")
    public String getName() {
        return this.name;
    }

    @RequestMapping("/hello")
    public String sayHi() {
        return "hi spring cloud config client ~";
    }
}
