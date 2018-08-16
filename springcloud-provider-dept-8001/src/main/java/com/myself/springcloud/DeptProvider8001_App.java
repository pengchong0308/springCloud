package com.myself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengChong
 * @create 2018/8/10 - 0:48
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
