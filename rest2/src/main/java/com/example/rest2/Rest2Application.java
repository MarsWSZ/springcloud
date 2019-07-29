package com.example.rest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableFeignClients
public class Rest2Application {

    public static void main(String[] args) {
        SpringApplication.run(Rest2Application.class, args);
    }

}
