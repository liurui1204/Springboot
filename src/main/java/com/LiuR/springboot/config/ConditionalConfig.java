package com.LiuR.springboot.config;

import com.LiuR.springboot.entity.Pet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description @Conditional 注解的使用
 * @Auther 刘瑞
 * @create 2022-01-15
 */
@ConditionalOnMissingBean(name = "user") //bean容器中没有user，才会启动下方配置
@Configuration(proxyBeanMethods = false)
public class ConditionalConfig {

//    @Bean
//    public User getUser2(){
//        return new User("李四",20);
//    }

    @Bean("tomcat")
    public Pet getPet(){
        return new Pet("tomcat",12);
    }
}
