package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring IoC container
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService service = context.getBean("bookService", BookService.class);
            service.addBook("The Clean Coder");
        }
    }
}
