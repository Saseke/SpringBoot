package com.study.sbstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.study.sbstudy.dao")
public class SbstudyApplication {
    //		程序启动入口
    public static void main(String[] args) {
        SpringApplication.run(SbstudyApplication.class, args);
    }
}
