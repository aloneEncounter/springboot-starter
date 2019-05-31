package com.miao.starter.starter;
/*
 *Created by IntelliJ IDEA.
 *@author Miao
 *@date 2019/5/31 16:59
 *
 */

public class HelloService {


    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloMiao(String name){
        return helloProperties.getPrefix()+"--"+name+helloProperties.getSuffix();
    }
}
