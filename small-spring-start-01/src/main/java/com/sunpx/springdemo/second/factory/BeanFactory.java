package com.sunpx.springdemo.second.factory;


/**
 * 抽象 Bean 工厂
 */
public interface BeanFactory {

    // 根据 name 获取 bean
    Object getBean(String name);
}
