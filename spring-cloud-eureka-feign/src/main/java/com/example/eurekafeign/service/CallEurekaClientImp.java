package com.example.eurekafeign.service;

import org.springframework.stereotype.Service;

@Service
public class CallEurekaClientImp implements CallEurekaClient {
    @Override
    public String getAge(String age) {
        return "sorry,internal service error ";
    }
}
