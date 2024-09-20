package com.sunpx.springdemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂
 */
public class BeanFactory {

    // IoC 容器
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    // 根据名称获取 Bean 对象
    public Object getBean(String name){
        return this.beanDefinitionMap.get(name).getBean();
    }

    // bean 注册
    public void registerBean(String name,BeanDefinition bean){
        this.beanDefinitionMap.put(name,bean);
    }
}
