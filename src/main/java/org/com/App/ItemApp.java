package org.com.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * @Author: hlz
 * @Contact: zxc2404283049@163.com
 * @Date: 2020/2/25 13:10
 * @Version: 1.0
 * @Description:
 * */
@SpringBootApplication
@ComponentScan(basePackages = {"org.com.Controller","org.com.service"})
public class ItemApp {
    public static void main(String[] args){
        SpringApplication.run(ItemApp.class,args);
    }
}
