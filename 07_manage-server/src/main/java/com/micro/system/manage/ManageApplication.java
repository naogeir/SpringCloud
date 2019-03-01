package com.micro.system.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Noageir
 * Date:2018-05-11 22:02
 * Project:com.spring.cloud
 * Package:com.micro.system.manage.web
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = "com.micro.system.manage.mapper")
public class ManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

}
