package com.futureweaver.custom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.futureweaver.custom.mapper")
public class SpringBootStarter {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringBootStarter.class, args);
    }
}
