package com.example.service_search.service

import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.SearchProduct
import reactor.core.publisher.Flux

interface SearchService {
    fun searchProducts(model: SearchProduct): Flux<Product>
}