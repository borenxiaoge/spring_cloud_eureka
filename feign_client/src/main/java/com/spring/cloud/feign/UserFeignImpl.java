package com.spring.cloud.feign;

import com.spring.cloud.feign.UserFeign;
import org.springframework.stereotype.Component;

@Component
public class UserFeignImpl implements UserFeign {

    @Override
    public String sayHiFromUserServer(String name) {
        return "糟糕," + name + "~服务挂了!";
    }
}
