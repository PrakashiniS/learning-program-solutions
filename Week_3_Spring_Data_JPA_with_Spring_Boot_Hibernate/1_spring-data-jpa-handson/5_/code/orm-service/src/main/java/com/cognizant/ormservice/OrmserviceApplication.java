package com.cognizant.ormservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmserviceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmserviceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrmserviceApplication.class, args);
        LOGGER.info("Inside main");
    }
}