package com.example.controller;

import com.example.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    Book[]  getBooks() {
        Book book1 = new Book("Sample Book 1" );
        Book book2 = new Book( "Sample Book 2" );

        Book[] books = new Book[] { book1, book2 };

        return books;
    }
}
