package com.LiuR.springboot;

import com.LiuR.springboot.config.MyConfig;
import com.LiuR.springboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description
 * @Auther 刘瑞
 * @create 2022-01-15
 */
@SpringBootApplication
public class ApplicationBootMain {
    public static void main(String[] args) {
        //1.返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(ApplicationBootMain.class, args);
        //2.查看容器里面的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        //3.从容器中获取组件
        User user1 = run.getBean(User.class);
        User user2 = run.getBean(User.class);
        System.out.println(user1 == user2); //true,表示@Bean创建的实例对象是单例
        //4.查看配置类返回的对象类型
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
        //proxyBeanMethods = false时，
        // 返回值：com.LiuR.springboot.config.MyConfig@2f6bcf87
        // 说明MyConfig是一个普通的配置类对象
        //proxyBeanMethods = true时，
        // 返回值：com.LiuR.springboot.config.MyConfig$$EnhancerBySpringCGLIB$$10f1fa21@35e478f
        // 说明MyConfig是一个代理对象
        System.out.println(user1==null);
        boolean tomcat = run.containsBean("tomcat");
        System.out.println(tomcat);
    }
}
