package com.sunpx.springdemo.second.factory.support;

import com.sunpx.springdemo.second.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}