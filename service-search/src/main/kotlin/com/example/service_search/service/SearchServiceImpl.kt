package com.example.service_search.service

import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.SearchProduct
import com.example.service_search.mapper.ProductMapper
import com.example.service_search.repository.ProductRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class SearchServiceImpl(
    val productRepository: ProductRepository,
    val productMapper: ProductMapper) : SearchService {

    override fun searchProducts(model: SearchProduct): Flux<Product> {
        TODO("Not yet implemented")
    }
}