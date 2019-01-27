package com.spring.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-server", fallback = UserFeignImpl.class)
public interface UserFeign {
    //访问user-server服务的hi接口,注意:feign不能识别下划线,所以服务名不能包含下划线!
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromUserServer(@RequestParam(value = "name") String name);
}
