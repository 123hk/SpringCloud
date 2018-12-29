package com.inta.common.atom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication //SpringBoot 启动类
@EnableEurekaClient // Eureka 客户端
@MapperScan("com.inta.common.atom.mapper") //扫描 mapper 所在的路径
public class AtomApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtomApplication.class, args);
    }

}
