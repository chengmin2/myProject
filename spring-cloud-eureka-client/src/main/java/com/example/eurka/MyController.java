package com.example.eurka;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @RequestMapping(value="/getName")
    public String getName(@RequestParam String name){
        System.out.println("ribbonService访问接口");
          return "hello:"+name;
    }
    @RequestMapping(value="/getAge")
    public String getAge(@RequestParam int age){
        System.out.println("feignService访问接口");
        return "my age is:"+age;
    }
}
