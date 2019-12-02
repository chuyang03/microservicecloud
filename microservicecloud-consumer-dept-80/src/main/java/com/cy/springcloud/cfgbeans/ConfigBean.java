package com.cy.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


//@Configuration 这个注解就相当于这个类是applicationContext.xml配置文件
//@Bean   相当于配置文件中的<bean id="">

@Configuration
public class ConfigBean {

    //@LoadBalanced 这个注解表示使用ribbon负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

}
