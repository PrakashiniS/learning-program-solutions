package com.cognizant.spring_scope_demo;

import com.cognizant.springscopedemo.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringScopeDemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringScopeDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringScopeDemoApplication.class, args);
        displayCountry();
    }

    public static void displayCountry() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);
        Country anotherCountry = context.getBean("country", Country.class);

        LOGGER.debug("Country : {}", country.toString());
        LOGGER.debug("Another Country : {}", anotherCountry.toString());

        LOGGER.info("END");
    }
}