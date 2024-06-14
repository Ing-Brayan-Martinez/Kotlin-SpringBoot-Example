package com.example.service_search.service

import com.example.service_search.domain.models.SearchResponse
import reactor.core.publisher.Mono

interface SearchService {
    fun searchProducts(term: String): Mono<SearchResponse>
}