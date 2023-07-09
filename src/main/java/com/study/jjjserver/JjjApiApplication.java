package com.study.jjjserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class JjjApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JjjApiApplication.class, args);
    }

}
