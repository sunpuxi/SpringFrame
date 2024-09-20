package com.sunpx.springdemo.second.factory.config;

/**
 * 单例注册
 */
public interface SingletonBeanRegistry {

    // 根据类名获取单例 bean
    Object getSingleton(String beanName);

}
