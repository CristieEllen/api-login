package com.example.apilogin.models

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import org.hibernate.validator.constraints.UniqueElements


@Entity(name = "users_tb")
data class User(

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_tb_seq")
   @SequenceGenerator(name = "users_tb_seq", sequenceName = "users_tb_seq", allocationSize = 1)
   val id: Long,

   @Column(name = "name", nullable = false)

   val name: String,

   @Column(name = "email", nullable = false, unique = true)
   @NotEmpty(message = "Preenchimento obrigatório!") @Email(message = "Email inválido!")
   val email: String,

   @Column(name = "phone", nullable = false)
   val phone: String,

   @Column(name = "password", nullable = false)
   val password: String,
)