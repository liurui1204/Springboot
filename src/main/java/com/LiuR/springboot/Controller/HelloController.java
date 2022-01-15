package com.LiuR.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther 刘瑞
 * @create 2022-01-15
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String Hello(){
        return "hello";
    }
}
