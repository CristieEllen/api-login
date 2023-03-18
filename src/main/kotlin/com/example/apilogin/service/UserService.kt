package com.example.apilogin.service

import com.example.apilogin.models.User
import com.example.apilogin.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserService(val userRepository: UserRepository) {

    fun findUserById(id: Int): Optional<User> {
        return userRepository.findById(id)
    }
}