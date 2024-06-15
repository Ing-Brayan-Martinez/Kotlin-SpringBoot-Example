package com.example.service_category.repository

import com.example.service_category.domain.entities.Category
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : ReactiveCrudRepository<Category, Long> {
}