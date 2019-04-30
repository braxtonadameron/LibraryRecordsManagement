package com.example.controller;

import com.example.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/library")
    Message getLibrary() {
        return new Message("sample data");
    }
}
