package com.zpyu.bootjsp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication()
public class BootJsp2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootJsp2Application.class, args);
    }

}
