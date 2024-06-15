package com.example.service_category.service

import com.example.service_category.domain.entities.Category
import com.example.service_category.domain.models.CreateCategory
import com.example.service_category.domain.models.UpdateCategory
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface CategoryService {
    fun createCategory(create: CreateCategory): Mono<Category>
    fun updateCategory(update: UpdateCategory): Mono<Category>
    fun deleteCategory(id: Long): Mono<Void>
    fun getCategories(): Flux<Category>
    fun getCategoryByID(id: Long): Mono<Category>
}