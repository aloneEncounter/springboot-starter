package com.miao.starter.starter;
/*
 *Created by IntelliJ IDEA.
 *@author Miao
 *@date 2019/5/31 17:05
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication   //如果时web应用才生效
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    public HelloService helloService(){

        HelloService service = new HelloService();
        service.setHelloProperties(helloProperties);
        return service;
    }


}
