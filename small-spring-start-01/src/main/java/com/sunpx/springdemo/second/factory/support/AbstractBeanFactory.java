package com.sunpx.springdemo.second.factory.support;

import com.sunpx.springdemo.second.BeansException;
import com.sunpx.springdemo.second.factory.BeanFactory;
import com.sunpx.springdemo.second.factory.config.BeanDefinition;

/**
 * 抽象类定义模板方法
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    // 重写 BeanFactory 的方法
    @Override
    public Object getBean(String name) throws BeansException {
        // 首先从内存取（缓存思想）
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    // 获取 BeanDefinition
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    // 实例化 Bean
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
