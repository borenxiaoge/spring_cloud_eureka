package com.spring.cloud.fm_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.spring.cloud.feign"})
@ComponentScan(basePackages = {"com.spring.cloud.web","com.spring.cloud.feign"})
public class FmClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmClientApplication.class, args);
    }

}

