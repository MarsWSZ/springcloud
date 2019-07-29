package com.example.feign.controller;

import org.springframework.stereotype.Component;

@Component
public class UserFeignFallback implements UserFeign{

    @Override
    public String hello(String name){
        return "error " + name;
    }
}
