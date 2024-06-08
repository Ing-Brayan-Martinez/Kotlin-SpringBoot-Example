package com.example.service_product.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import org.springframework.data.annotation.Id

@Entity
class Person(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var name: String,
    var lastName: String,
    var age: Int
)