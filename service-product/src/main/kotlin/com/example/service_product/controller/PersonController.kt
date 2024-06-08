package com.example.service_product.controller

import com.example.service_product.domain.entities.Person
import com.example.service_product.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class PersonController(val personService: PersonService) {

    @GetMapping("/person")
    fun main(): Mono<Person> {
        val person = Person(null, "Juan", "Perez", 20)
        return this.personService.createPerson(person)
    }
}