package com.example.service_category.mapper

import com.example.service_category.domain.entities.Category
import com.example.service_category.domain.models.CreateCategory
import com.example.service_category.domain.models.UpdateCategory

interface CategoryMapper {
    fun toCategoryEntity(model: CreateCategory): Category
    fun toCategoryEntity(model: UpdateCategory, entity: Category): Category
}