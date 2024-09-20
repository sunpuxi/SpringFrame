package com.sunpx.springdemo;


import org.junit.Test;

public class ApiTest {

    @Test
    public void testBeanFactory(){
        // 初始化
        BeanFactory beanFactory = new BeanFactory();

        // 服务注册
        UserService userService = new UserService();
        BeanDefinition beanDefinition = new BeanDefinition(userService);
        beanFactory.registerBean("UserService",beanDefinition);

        // 取出服务
        UserService userService1 = (UserService) beanFactory.getBean("UserService");
        userService1.queryUserInfo();
    }
}
