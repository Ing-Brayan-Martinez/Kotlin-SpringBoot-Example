package com.example.service_product.service

import com.example.service_product.domain.entities.Person
import com.example.service_product.repository.PersonRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PersonServiceImpl(val personRepository: PersonRepository) : PersonService {

    override fun createPerson(person: Person): Mono<Person> {
        return personRepository.save(person)
    }

    override fun updatePerson(id: Long, person: Person): Person {
        TODO("Not yet implemented")
    }

    override fun deletePerson(id: Long) {
        TODO("Not yet implemented")
    }

    override fun getPerson(id: Long): Person {
        TODO("Not yet implemented")
    }

    override fun getPersons(): List<Person> {
        TODO("Not yet implemented")
    }
}