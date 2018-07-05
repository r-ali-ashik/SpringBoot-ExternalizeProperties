package com.aliashik.controller;

import com.aliashik.custombean.PropertyConfig;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PropertyConfig propertyConfig;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getEmployees(){

        System.out.println("Properties injected using @value annotation");
        System.out.println(mongodbUrl);
        System.out.println(defaultDb);

        System.out.println("Properties injected into a bean");
        System.out.println(propertyConfig.getDb());
        System.out.println(propertyConfig.getUrl());

        return "Hello World!";
    }
}