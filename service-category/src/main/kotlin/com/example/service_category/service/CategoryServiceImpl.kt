package com.example.service_category.service

import com.example.service_category.domain.entities.Category
import com.example.service_category.domain.models.CreateCategory
import com.example.service_category.domain.models.UpdateCategory
import com.example.service_category.mapper.CategoryMapper
import com.example.service_category.repository.CategoryRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CategoryServiceImpl(
    val categoryRepository: CategoryRepository,
    val categoryMapper: CategoryMapper) : CategoryService {

    override fun createCategory(create: CreateCategory): Mono<Category> {
        // Validate input
        if (create.isInvalid()) {
            return Mono.error { Exception("Invalid input data") }
        }

        // Execute algorithm
        return Mono.justOrEmpty(create)
            .map { categoryMapper.toCategoryEntity(it) }
            .flatMap { categoryRepository.save(it) }
    }

    override fun  updateCategory(update: UpdateCategory): Mono<Category> {
        // Validate input
        if (update.isInvalid()) {
            return Mono.error { Exception("Invalid input data") }
        }

        // Execute algorithm
        return this.categoryRepository.findById(update.id)
            .map { categoryMapper.toCategoryEntity(update, it) }
            .flatMap { categoryRepository.save(it) }
    }

    override fun deleteCategory(id: Long): Mono<Void>{
        // Validate input
        if (id <= 0) {
            return Mono.error { Exception("Id cannot be empty or blank") }
        }

        // Execute algorithm
        return this.categoryRepository.findById(id)
            .flatMap { categoryRepository.delete(it) }
    }

    override fun getCategories(): Flux<Category> {
        // Execute algorithm
        return this.categoryRepository.findAll()
    }

    override fun getCategoryByID(id: Long): Mono<Category> {
        // Execute algorithm
        return this.categoryRepository.findById(id)
    }
}