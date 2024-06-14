package com.example.service_product.controller

import com.example.service_product.domain.entities.Product
import com.example.service_product.domain.models.CreateProduct
import com.example.service_product.domain.models.UpdateProduct
import com.example.service_product.service.ProductService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class ProductController(val productService: ProductService) {

    val log: Logger = LoggerFactory.getLogger(ProductController::class.java)

    @PostMapping("/product")
    fun create(@RequestBody model: CreateProduct): Mono<Product> {
        log.info("POST /product");

        return this.productService.createProduct(model)
    }

    @PutMapping("/product")
    fun update(@RequestBody model: UpdateProduct): Mono<Product> {
        log.info("PUT /product")

        return this.productService.updateProduct(model)
    }

    @DeleteMapping("/product/{id}")
    fun delete(@PathVariable id: Long): Mono<Void> {
        log.info("DELETE /product/${id}")

        return this.productService.deleteProduct(id)
    }

    @GetMapping("/product")
    fun getProducts(): Flux<Product> {
        log.info("GET /product")

        return this.productService.getProducts()
    }

    @GetMapping("/product/{id}")
    fun getProductInfo(@PathVariable id: Long): Mono<Product> {
        log.info("GET /product/${id}")

        return this.productService.getProductByID(id)
    }
}