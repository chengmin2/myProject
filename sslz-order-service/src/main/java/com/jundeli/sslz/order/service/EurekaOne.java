package com.jundeli.sslz.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@RestController
@FeignClient("spring-cloud-eureka-client")
public interface EurekaOne {
  /*  @RequestMapping(value = "getName/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String getName(@PathVariable String name) {
        return null;
    }*/

 @RequestMapping(value = "getName/{name}", method = RequestMethod.GET)
 @ResponseBody
  String getName(@PathVariable("name") String name) ;
}
