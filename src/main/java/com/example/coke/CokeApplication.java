package com.example.coke;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.coke.dao")
@SpringBootApplication
public class CokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CokeApplication.class, args);
    }

}
