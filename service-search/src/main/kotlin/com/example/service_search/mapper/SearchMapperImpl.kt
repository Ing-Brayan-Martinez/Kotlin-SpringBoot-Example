package com.example.service_search.mapper

import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.SearchResponse
import org.springframework.stereotype.Component

@Component
class SearchMapperImpl : SearchMapper {
    override fun toSearchResponse(products: List<Product>): SearchResponse {
        TODO()
    }
}