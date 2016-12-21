package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication 
public class RestServiceExample {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestServiceExample.class, args);
    }

}
