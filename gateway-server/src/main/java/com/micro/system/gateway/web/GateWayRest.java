package com.micro.system.gateway.web;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noageir
 * Date:2018-05-11 23:11
 * Project:com.spring.cloud
 * Package:com.micro.system.manage.web
 */
@RestController
@RequestMapping("/gate_way")
@Api(description = "员工信息管理")
public class GateWayRest {
    private static final Logger logger = LoggerFactory.getLogger(GateWayRest.class);

    @GetMapping("/test")
    public String test() {
        return "ok";
    }

}
