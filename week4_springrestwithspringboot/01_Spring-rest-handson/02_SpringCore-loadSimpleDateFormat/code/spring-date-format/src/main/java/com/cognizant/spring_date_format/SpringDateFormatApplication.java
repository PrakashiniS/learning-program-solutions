package com.cognizant.spring_date_format;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringDateFormatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDateFormatApplication.class, args);
		System.out.println("SpringDateFormatApplication started...");

		displayDate();
	}

	public static void displayDate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		try {
			Date date = format.parse("31/12/2018");
			System.out.println("Parsed Date: " + date);
		} catch (Exception e) {
			System.out.println("Error parsing date: " + e.getMessage());
		}
	}

}
