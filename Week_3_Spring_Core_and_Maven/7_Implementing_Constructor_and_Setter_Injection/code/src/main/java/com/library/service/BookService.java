package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String serviceName;
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("[" + serviceName + "] Adding book...");
        bookRepository.saveBook(title);
    }
}
