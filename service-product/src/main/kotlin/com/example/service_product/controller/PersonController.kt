package com.example.service_product.controller

import com.example.service_product.domain.Person
import com.example.service_product.repository.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class PersonController(val personRepository: PersonRepository) {

    @GetMapping("/person")
    fun main(): Mono<Person> {
        return this.personRepository.findById(1)
    }
}