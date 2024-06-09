package com.example.service_product.controller

import com.example.service_product.domain.entities.Person
import com.example.service_product.domain.model.CreatePerson
import com.example.service_product.domain.model.UpdatePerson
import com.example.service_product.service.PersonService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class PersonController(val personService: PersonService) {

    val log: Logger = LoggerFactory.getLogger(PersonController::class.java)

    @PostMapping("/person")
    fun create(@RequestBody model: CreatePerson): Mono<Person> {
        log.info("POST /person");

        return this.personService.createPerson(model)
    }

    @PutMapping("/person")
    fun update(@RequestBody model: UpdatePerson): Mono<Person> {
        log.info("PUT /person")

        return this.personService.updatePerson(model)
    }

    @DeleteMapping("/person/{id}")
    fun delete(@PathVariable id: Long): Mono<Void> {
        log.info("DELETE /person")

        return this.personService.deletePerson(id)
    }

    @GetMapping("/person/{id}")
    fun getPersonInfo(@PathVariable id: Long): Mono<Person> {
        log.info("GET /person/${id}")

        return this.personService.getPerson(id)
    }

    @GetMapping("/person/all")
    fun getPersons(): Flux<Person> {
        log.info("GET /person")

        return this.personService.getPersons()
    }
}