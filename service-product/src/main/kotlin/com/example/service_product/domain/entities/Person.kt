package com.example.service_product.domain.entities


import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("Person")
class Person(
    @Id
    var id: Long? = null,
    var name: String,
    var lastName: String,
    var age: Int
)