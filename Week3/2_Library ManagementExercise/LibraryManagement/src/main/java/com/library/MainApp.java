package com.library;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Call service method to verify DI
        bookService.showBooks();
    }
}

