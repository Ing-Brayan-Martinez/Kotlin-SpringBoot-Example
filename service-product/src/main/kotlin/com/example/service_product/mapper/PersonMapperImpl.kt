package com.example.service_product.mapper

import com.example.service_product.domain.entities.Person
import com.example.service_product.domain.model.CreatePerson
import com.example.service_product.domain.model.UpdatePerson
import org.springframework.stereotype.Component

@Component
class PersonMapperImpl : PersonMapper {
    override fun newPersonEntityFromCreatePerson(model: CreatePerson): Person {
        TODO("Not yet implemented")
    }

    override fun newPersonEntityFromCreatePerson(model: UpdatePerson, entity: Person): Person {
        TODO("Not yet implemented")
    }
}