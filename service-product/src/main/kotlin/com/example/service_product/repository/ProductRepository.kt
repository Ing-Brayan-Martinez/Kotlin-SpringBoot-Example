package com.example.service_product.repository

import com.example.service_product.domain.entities.Product
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ProductRepository : ReactiveCrudRepository<Product, Long> {
}