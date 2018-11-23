package com.example.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client",fallback = CallEurekaClientImp.class)
public interface CallEurekaClient {
    @RequestMapping(value="/getAge")
    String  getAge(@RequestParam(value="age") String age);
}
