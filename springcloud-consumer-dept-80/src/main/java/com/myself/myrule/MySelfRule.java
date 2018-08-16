package com.myself.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengChong
 * @create 2018/8/11 - 11:59
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
//        return new RandomRule();
        return new RandoRule_ZY();
    }
}
