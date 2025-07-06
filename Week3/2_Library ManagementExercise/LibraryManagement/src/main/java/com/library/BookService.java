package com.library;
import com.library.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        System.out.println("BookService is calling repository...");
        bookRepository.displayBooks();
    }
}


