package com.example.service_product.service

import com.example.service_product.domain.entities.Product
import com.example.service_product.domain.model.CreateProduct
import com.example.service_product.domain.model.UpdateProduct
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface ProductService {
    fun createProduct(create: CreateProduct): Mono<Product>
    fun updateProduct(update: UpdateProduct): Mono<Product>
    fun deleteProduct(id: Long): Mono<Void>
    fun getProduct(id: Long): Mono<Product>
    fun getProducts(): Flux<Product>
}