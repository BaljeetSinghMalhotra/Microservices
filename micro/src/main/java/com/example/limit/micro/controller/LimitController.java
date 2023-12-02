package com.example.limit.micro.controller;

import com.example.limit.micro.bean.Limit;
import com.example.limit.micro.configuration.limitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private limitConfiguration config;

    @GetMapping("/showLimit")
    public Limit showlimit(){

        return  new Limit(config.getMin(), config.getMax());
    }

}
