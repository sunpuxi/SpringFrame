package com.sunpx.springdemo;

/**
 * Bean 的定义
 */
public class BeanDefinition {

    private Object bean;  // 存储 Bean

    BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return this.bean;
    }
}
