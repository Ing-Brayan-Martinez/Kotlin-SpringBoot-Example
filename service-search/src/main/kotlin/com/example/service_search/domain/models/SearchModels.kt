package com.example.service_search.domain.models

import com.example.service_search.domain.entities.Brand
import com.example.service_search.domain.entities.Category
import com.example.service_search.domain.entities.Product

data class SearchResponse(
    val products: List<Product>,
    val brands: List<Brand>,
    val categories: List<Category>)