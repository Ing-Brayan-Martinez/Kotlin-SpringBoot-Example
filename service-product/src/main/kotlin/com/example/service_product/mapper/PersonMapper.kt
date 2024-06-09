package com.example.service_product.mapper

import com.example.service_product.domain.entities.Person
import com.example.service_product.domain.model.CreatePerson
import com.example.service_product.domain.model.UpdatePerson

interface PersonMapper {
    fun newPersonEntityFromCreatePerson(model: CreatePerson): Person
    fun newPersonEntityFromCreatePerson(model: UpdatePerson, entity: Person): Person
}