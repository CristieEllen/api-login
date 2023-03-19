package com.example.apilogin.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Column
import jakarta.persistence.Table


@Entity()
@Table(name = "users_tb")
data class User(

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   val id: Long,

   @Column(name = "name", nullable = false)
   val name: String,

   @Column(name = "email", nullable = false)
   val email: String,

   @Column(name = "phone", nullable = false)
   val phone: String,

   @Column(name = "password", nullable = false)
   val password: String,
)