package com.bdqn.program.myshops;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.program.myshops.dao")
public class MyshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyshowApplication.class, args);
    }

}
