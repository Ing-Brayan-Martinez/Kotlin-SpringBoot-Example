package com.example.service_product.service

import com.example.service_product.domain.entities.Product
import com.example.service_product.domain.models.CreateProduct
import com.example.service_product.domain.models.UpdateProduct
import com.example.service_product.mapper.ProductMapper
import com.example.service_product.repository.ProductRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ProductServiceImpl(
    val productRepository: ProductRepository,
    val productMapper: ProductMapper) : ProductService {

    override fun createProduct(create: CreateProduct): Mono<Product> {
        // Validate input
        if (create.isInvalid()) {
            return Mono.error { Exception("Invalid input data") }
        }

        // Execute algorithm
        return Mono.justOrEmpty(create)
            .map { productMapper.toProductEntity(it) }
            .flatMap { productRepository.save(it) }
    }

    override fun  updateProduct(update: UpdateProduct): Mono<Product> {
        // Validate input
        if (update.isInvalid()) {
            return Mono.error { Exception("Invalid input data") }
        }

        // Execute algorithm
        return this.productRepository.findById(update.id)
            .map { productMapper.toProductEntity(update, it) }
            .flatMap { productRepository.save(it) }
    }

    override fun deleteProduct(id: Long): Mono<Void>{
        // Validate input
        if (id <= 0) {
            return Mono.error { Exception("Id cannot be empty or blank") }
        }

        // Execute algorithm
        return this.productRepository.findById(id)
            .flatMap { productRepository.delete(it) }
    }

    override fun getProducts(): Flux<Product> {
        // Execute algorithm
        return this.productRepository.findAll()
    }

    override fun getProductByID(id: Long): Mono<Product> {
        // Execute algorithm
        return this.productRepository.findById(id)
    }
}