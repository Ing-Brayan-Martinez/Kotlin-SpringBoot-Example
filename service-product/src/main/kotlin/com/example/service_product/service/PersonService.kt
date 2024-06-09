package com.example.service_product.service

import com.example.service_product.domain.entities.Person
import com.example.service_product.domain.model.CreatePerson
import com.example.service_product.domain.model.UpdatePerson
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface PersonService {
    fun createPerson(create: CreatePerson): Mono<Person>
    fun updatePerson(update: UpdatePerson): Mono<Person>
    fun deletePerson(id: Long): Mono<Void>
    fun getPerson(id: Long): Mono<Person>
    fun getPersons(): Flux<Person>
}