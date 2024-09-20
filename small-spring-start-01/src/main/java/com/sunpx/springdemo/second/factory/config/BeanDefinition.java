package com.sunpx.springdemo.second.factory.config;

/**
 * Bean 的定义
 * 相当于在对象的外面包了一层，Bean 不是实例化后的对象！
 */
public class BeanDefinition {

    // 使用 class 代替 Object 存储 Bean
    // 把 bean 的实例化操作放到容器中处理
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    /**
     * 获取
     */
    public Class getBeanClass() {
        return beanClass;
    }

    /**
     * 设置
     */
    public void setBeanClass(Class bean) {
        this.beanClass = bean;
    }
}
