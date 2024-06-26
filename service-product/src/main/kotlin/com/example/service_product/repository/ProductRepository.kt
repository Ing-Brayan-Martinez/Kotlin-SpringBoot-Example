package com.example.service_product.repository

import com.example.service_product.domain.entities.Product
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : ReactiveCrudRepository<Product, Long> {
}