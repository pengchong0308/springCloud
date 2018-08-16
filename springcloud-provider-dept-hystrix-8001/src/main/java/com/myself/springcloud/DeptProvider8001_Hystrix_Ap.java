package com.myself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengChong
 * @create 2018/8/10 - 0:48
 */
@SpringBootApplication
@EnableEurekaClient                     //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker                   //对hystrixR熔断机制的支持
public class DeptProvider8001_Hystrix_Ap {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_Ap.class,args);
    }
}
