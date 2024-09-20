package com.sunpx.springdemo.second.factory.support;

import com.sunpx.springdemo.second.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例 bean 的相关服务
 * 获取单例
 * 注册单例，缓存
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    // 容器存储 bean
    private Map<String, Object> singletonObjects = new HashMap<>();

    // 重写实现获取单例 bean 的方法
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    // 添加单例 bean，理解为 bean 的注册
    // 同一个包内的其他类可以访问，子类可以访问，其他包不能访问。
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
