package com.aliashik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:config.properties")
public class TestController {

    @Value("${mongodb.url}")
    private String mongodbUrl;

    @Value("${mongodb.db}")
    private String defaultDb;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getEmployees(){

        System.out.println(mongodbUrl);
        System.out.println(defaultDb);

        return "Hello World!";
    }
}