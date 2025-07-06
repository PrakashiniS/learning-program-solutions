package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/")
    public String home() {
        return "Welcome to Library Management API";
    }


    // Create
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // Read All
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Read by ID
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        return bookRepository.save(book);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
