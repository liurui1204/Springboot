package com.LiuR.springboot.config;

import com.LiuR.springboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description @Configuration的使用
 * @Auther 刘瑞
 * @create 2022-01-15
 */

/**
 * 1.配置类里面使用@Bean标注在方法上给容器注册组件，默认单例
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods：代理bean的方法
 * Full(proxyBeanMethods = true) (保证@Bean方法每次被调用的时候都是单例的)
 * Lite(proxyBeanMethods = false)(每次被调用时，都是重新创建的)
 */
@Configuration(proxyBeanMethods = true) //告诉springboot这个类是一个配置类====配置文件
public class MyConfig {

    @Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件的类型。返回的值，就是组件在容器的实例
    public User getUser(){
        return new User("张三",18);
    }
}
