package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void saveBook(String bookTitle) {
        System.out.println("Book '" + bookTitle + "' saved to the database.");
    }
}
