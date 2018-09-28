package com.example.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggingApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootLoggingApplication.class);

    public static void main(String[] args) {
        log.info("this is a info message");
        log.warn("this is a warn message");
        log.error("this is a error message");
        SpringApplication.run(SpringBootLoggingApplication.class, args);
    }
}
