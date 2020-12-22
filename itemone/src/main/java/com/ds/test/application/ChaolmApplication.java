package com.ds.test.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
@MapperScan("com.ds.test.mapper")
public class ChaolmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaolmApplication.class, args);
    }

}
