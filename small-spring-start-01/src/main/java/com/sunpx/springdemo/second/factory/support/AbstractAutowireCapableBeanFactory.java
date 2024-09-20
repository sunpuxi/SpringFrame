package com.sunpx.springdemo.second.factory.support;

import com.sunpx.springdemo.second.BeansException;
import com.sunpx.springdemo.second.factory.config.BeanDefinition;

/**
 * 实例化 Bean 的类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * 实例化 Bean 之后，并添加到单例容器中
     *
     * @param beanName       name
     * @param beanDefinition class
     * @return object
     * @throws BeansException e
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            // 获取到对应的 CLass 之后，再实例化对象
            // todo 存在的问题，如果该 Class 的构造函数是有参数的，该如何处理？
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        // 层层继承抽象类和实现接口调用到的顶层设计的 addSingleton 方法，缓存起来
        addSingleton(beanName, bean);
        return bean;
    }

}
