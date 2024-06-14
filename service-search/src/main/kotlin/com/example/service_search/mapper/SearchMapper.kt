package com.example.service_search.mapper

import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.SearchResponse

interface SearchMapper {
    fun toSearchResponse(products: List<Product>): SearchResponse {
        return SearchResponse(
            products = products
        )
    }
}