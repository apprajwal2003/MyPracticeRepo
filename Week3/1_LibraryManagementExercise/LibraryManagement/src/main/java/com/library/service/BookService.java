package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring to inject the dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookTitle(String title) {
        System.out.println("Book Title: " + title);
    }
}



