package com.sunpx.springdemo.second.factory.support;

import com.sunpx.springdemo.second.BeansException;
import com.sunpx.springdemo.second.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * JDK 实例化
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    /**
     * 实例化
     * @param beanDefinition Bean
     * @param beanName name
     * @param ctor 构造函数
     * @param args 构造函数所需的参数
     * @return 对象
     * @throws BeansException ex
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
            throws BeansException {
        // 获取到对应的 class
        Class clazz = beanDefinition.getBeanClass();
        try {
            // 根据构造函数的有无来实例化对象
            if (null != ctor) {
                // 有构造函数
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }

}
