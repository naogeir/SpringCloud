package com.micro.system.manage.web;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage_hello")
@Api(description = "测试类")
public class HelloRest {
    private static final Logger logger = LoggerFactory.getLogger(HelloRest.class);

    @GetMapping("/test")
    public String test() {
        return "ok";
    }
}
