package com.micro.system.monitor;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author Noageir
 * Date:2018-05-06 22:20
 * Project:com.spring.cloud
 * Package:com.micro.system.eureka
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class MonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
