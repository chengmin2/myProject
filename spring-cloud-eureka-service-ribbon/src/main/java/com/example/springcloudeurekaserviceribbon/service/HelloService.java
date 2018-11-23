package com.example.springcloudeurekaserviceribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {
    @Resource
    RestTemplate restTemplate;
    public String hiService(String name){
        return restTemplate.getForObject("http://service-ribbon:8085/getName?name="+name,String.class);
    }
}
