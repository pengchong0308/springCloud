package com.myself.springcloud;

import com.myself.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author pengChong
 * @create 2018/8/10 - 11:41
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
