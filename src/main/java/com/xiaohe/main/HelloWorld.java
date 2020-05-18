package com.xiaohe.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 来标注这是一个springboot主程序类，说明这是一个spring boot类
 */
@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {

        //springboot应用启动起来
        SpringApplication.run(HelloWorld.class,args);


    }

}
