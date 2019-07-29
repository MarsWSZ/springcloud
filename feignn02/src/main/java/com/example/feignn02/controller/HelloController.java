package com.example.feignn02.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    UserFeign userFeign;

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand
    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return userFeign.hello(name);
    }

    @GetMapping(value = "/hello/rest/{name}")
    public String helloRest(@PathVariable("name") String name) {
        return restTemplate.getForEntity("http://sc-service-rest/hello/wsz", String.class).getBody();
    }
}
