package com.example.frontend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Frontend UI updated via feature branch";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
