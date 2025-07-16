package com.cognizant.spring_logging;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLoggingApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingApplication.class, args);
		LOGGER.info("SpringLoggingApplication started...");
		displayDate();
	}

	public static void displayDate() {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		try {
			Date date = format.parse("31/12/2018");
			LOGGER.debug("Parsed Date: {}", date);
		} catch (Exception e) {
			LOGGER.error("Date parsing failed", e);
		}

		LOGGER.info("END");
	}

}
