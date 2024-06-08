package com.example.service_product.repository

import com.example.service_product.domain.entities.Person
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PersonRepository : ReactiveCrudRepository<Person, Long> {
}