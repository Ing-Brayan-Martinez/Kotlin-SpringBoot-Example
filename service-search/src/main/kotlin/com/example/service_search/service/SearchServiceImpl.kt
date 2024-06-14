package com.example.service_search.service

import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.SearchResponse
import com.example.service_search.mapper.SearchMapper
import com.example.service_search.repository.ProductRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class SearchServiceImpl(
    val productRepository: ProductRepository,
    val searchMapper: SearchMapper) : SearchService {

    override fun searchProducts(term: String): Mono<SearchResponse> {
        if (term.isEmpty() || term.isBlank()) {
            return Mono.error { Exception("Term cannot be empty or blank") }
        }

        val likeTerm = "%$term%"

        val products: Mono<List<Product>> = productRepository.findProductsByTerm(likeTerm)
            .collectList()

        return products
            .map { searchMapper.toSearchResponse(it) }
    }
}