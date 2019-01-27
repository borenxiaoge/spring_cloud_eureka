package com.spring.cloud.web;

import com.spring.cloud.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class UserController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    UserFeign userFeign;

    @RequestMapping("hello")
    public String sayHello(@RequestParam("name") String name) {
        System.out.println("获取到请求name值为:" + name);
        String str = userFeign.sayHiFromUserServer(name);
        return str;
    }

    @RequestMapping("hi")
    public String sayHi(String name) {
        return "Hi~ fm-client!,I'm " + name;
    }
}
