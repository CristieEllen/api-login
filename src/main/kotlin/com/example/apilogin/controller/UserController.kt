package com.example.apilogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    fun helloWorld(@RequestParam("name") name: String) = "Hello, $name!"
}
