package com.example.service_product.service

import com.example.service_product.domain.entities.Person
import com.example.service_product.domain.model.CreatePerson
import com.example.service_product.domain.model.UpdatePerson
import com.example.service_product.mapper.PersonMapper
import com.example.service_product.repository.PersonRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PersonServiceImpl(
    val personRepository: PersonRepository,
    val personMapper: PersonMapper) : PersonService {

    override fun createPerson(create: CreatePerson): Mono<Person> {
        return Mono.justOrEmpty(create)
            .map { personMapper.newPersonEntityFromCreatePerson(it) }
            .flatMap { personRepository.save(it) }
    }

    override fun  updatePerson(update: UpdatePerson): Mono<Person> {
        return this.personRepository.findById(update.id)
            .map { personMapper.newPersonEntityFromCreatePerson(update, it) }
            .flatMap { personRepository.save(it) }
    }

    override fun deletePerson(id: Long): Mono<Void>{
        return this.personRepository.findById(id)
            .flatMap { personRepository.delete(it) }
    }

    override fun getPerson(id: Long): Mono<Person> {
        return this.personRepository.findById(id)
    }

    override fun getPersons(): Flux<Person> {
        return this.personRepository.findAll()
    }
}