package com.alberth.springbootexample1.sts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${app.name}")
    private String appname;
    @Value("${app.version}")
    private String appversion;

    // @RequestMapping is used to map the url
    @RequestMapping("/hello/world")
    public String demo() {
        return "Name: " + appname + " Version: " + appversion;
    }
}
