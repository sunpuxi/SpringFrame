package com.sunpx.springdemo.second.factory;


import com.sunpx.springdemo.second.BeansException;

/**
 * 抽象 Bean 工厂
 */
public interface BeanFactory {

    // 根据 name 获取 bean
    Object getBean(String name);

    // 解决构造函数需要参数的问题
    Object getBean(String name, Object... args) throws BeansException;
}
