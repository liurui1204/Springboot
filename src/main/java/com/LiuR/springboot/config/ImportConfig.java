package com.LiuR.springboot.config;

import com.LiuR.springboot.entity.Pet;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description  @Import注解的使用
 * @Auther 刘瑞
 * @create 2022-01-15
 */

//@Import({Pet.class}) 给容器自动创建出这两个类型的组件、默认组件的名字就是全类名
//@Import({Pet.class})
@Configuration(proxyBeanMethods = false)
public class ImportConfig {
}
