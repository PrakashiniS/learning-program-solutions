package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService bookService = context.getBean(BookService.class);
            bookService.addBook("Clean Architecture");
        }
    }
}
