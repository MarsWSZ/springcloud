package com.example.feign.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sc-service-rest", fallback = UserFeignFallback.class)
public interface UserFeign {

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name);
    }
