package com.example.service_product.service

import com.example.service_product.domain.entities.Person
import reactor.core.publisher.Mono

interface PersonService {
    fun createPerson(person: Person): Mono<Person>
    fun updatePerson(id: Long, person: Person): Person
    fun deletePerson(id: Long)
    fun getPerson(id: Long): Person
    fun getPersons(): List<Person>
}