package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService service = context.getBean(BookService.class);
            service.addBook("Spring Boot in Action");
        }
    }
}
