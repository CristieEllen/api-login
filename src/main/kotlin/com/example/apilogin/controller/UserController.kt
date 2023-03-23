package com.example.apilogin.controller;

import com.example.apilogin.exception.NotFoundException
import com.example.apilogin.models.User
import com.example.apilogin.service.UserService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional

@RestController(value = "/users")
public class UserController(val userService: UserService) {

    @GetMapping("/")
    fun findUser() : Any {
        return userService.findAll()
    }
    @GetMapping("/{id}")
    fun findUser(@PathVariable(value="id") id: Long) : User? {

        return userService.findUserById(id).orElseThrow{ NotFoundException("Usuário não Encontrado") }

    }
    @PostMapping("/")
    fun postUser(@Valid @RequestBody() user: User): User? {
        return userService.postFunction(user)
    }
}
