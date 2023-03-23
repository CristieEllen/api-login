package com.example.apilogin.service

import com.example.apilogin.exception.AlreadyRegisteredException
import com.example.apilogin.exception.NotFoundException
import com.example.apilogin.models.User
import com.example.apilogin.repository.UserRepository
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import java.sql.SQLIntegrityConstraintViolationException
import java.util.*

@Service
class UserService(val userRepository: UserRepository) {

    fun findAll(): List<User> {
        return userRepository.findAll()
    }
    fun findUserById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }
    fun postFunction(@RequestBody() user: User): User{
        return userRepository.save(user);
    }
}