package com.example.service_category.controller

import com.example.service_category.domain.entities.Category
import com.example.service_category.domain.models.CreateCategory
import com.example.service_category.domain.models.UpdateCategory
import com.example.service_category.service.CategoryService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class CategoryController(val categoryService: CategoryService) {

    val log: Logger = LoggerFactory.getLogger(CategoryController::class.java)

    @PostMapping("/category")
    fun create(@RequestBody model: CreateCategory): Mono<Category> {
        log.info("POST /category");

        return this.categoryService.createCategory(model)
    }

    @PutMapping("/category")
    fun update(@RequestBody model: UpdateCategory): Mono<Category> {
        log.info("PUT /category")

        return this.categoryService.updateCategory(model)
    }

    @DeleteMapping("/category/{id}")
    fun delete(@PathVariable id: Long): Mono<Void> {
        log.info("DELETE /category/${id}")

        return this.categoryService.deleteCategory(id)
    }

    @GetMapping("/category")
    fun getCategories(): Flux<Category> {
        log.info("GET /category")

        return this.categoryService.getCategories()
    }

    @GetMapping("/category/{id}")
    fun getCategoryInfo(@PathVariable id: Long): Mono<Category> {
        log.info("GET /category/${id}")

        return this.categoryService.getCategoryByID(id)
    }
}