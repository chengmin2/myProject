package com.example.eurekafeign.controller;

import com.example.eurekafeign.service.CallEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class MyController {
    @Resource
    CallEurekaClient callEurekaClient;
    @RequestMapping(value="/getAge")
    public String getAge(@RequestParam String age){
       return callEurekaClient.getAge(age);
    }
}
