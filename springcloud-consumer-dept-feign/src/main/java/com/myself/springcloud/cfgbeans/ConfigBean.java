package com.myself.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author pengChong
 * @create 2018/8/10 - 11:11
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced                                           //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
////        return new RoundRobinRule();//默认的轮询
//        return new RandomRule();//为了达到目的，用我们重新选择的随机算法代替默认的轮询
//    }
}
