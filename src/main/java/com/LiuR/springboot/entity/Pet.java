package com.LiuR.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 * @Auther 刘瑞
 * @create 2022-01-15
 */
@Data
@AllArgsConstructor
public class Pet {

    private String name;
    private Integer age;

}
