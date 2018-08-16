package com.myself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author pengChong
 * @create 2018/8/10 - 11:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.myself.springcloud"})
@ComponentScan("com.myself.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
