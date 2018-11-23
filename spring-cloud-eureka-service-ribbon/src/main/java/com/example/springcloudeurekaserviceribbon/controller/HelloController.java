package com.example.springcloudeurekaserviceribbon.controller;

import com.example.springcloudeurekaserviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    HelloService helloService;
    @RequestMapping(value = "/hello/getName")
    public String getName(@RequestParam String name){
       return helloService.hiService(name);
    }
}
