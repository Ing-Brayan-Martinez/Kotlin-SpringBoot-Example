package com.example.service_search.domain.models

import com.example.service_search.domain.entities.Product

data class SearchResponse(
    val products: List<Product>)