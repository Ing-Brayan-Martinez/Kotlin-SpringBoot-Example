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
        return Mono.justOrEmpty(create)
            .map { productMapper.newProductEntityFromCreateProduct(it) }
            .flatMap { productRepository.save(it) }
    }

    override fun  updateProduct(update: UpdateProduct): Mono<Product> {
        return this.productRepository.findById(update.id)
            .map { productMapper.newProductEntityFromCreateProduct(update, it) }
            .flatMap { productRepository.save(it) }
    }

    override fun deleteProduct(id: Long): Mono<Void>{
        return this.productRepository.findById(id)
            .flatMap { productRepository.delete(it) }
    }

    override fun getProduct(id: Long): Mono<Product> {
        return this.productRepository.findById(id)
    }

    override fun getProducts(): Flux<Product> {
        return this.productRepository.findAll()
    }
}