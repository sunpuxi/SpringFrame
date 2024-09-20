package com.sunpx.springdemo.second.factory.support;

import com.sunpx.springdemo.second.BeansException;
import com.sunpx.springdemo.second.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略
 */
public interface InstantiationStrategy {

    /**
     * 实例化
     * @param beanDefinition Bean
     * @param beanName name
     * @param ctor 构造函数
     * @param args 构造函数所需的参数
     * @return 对象
     * @throws BeansException ex
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
            throws BeansException;

}
