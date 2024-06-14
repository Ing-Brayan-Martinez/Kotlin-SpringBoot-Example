package com.example.service_search.mapper

import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.CreateProduct
import com.example.service_search.domain.models.UpdateProduct

interface ProductMapper {
    fun newProductEntityFromCreateProduct(model: CreateProduct): Product
    fun newProductEntityFromCreateProduct(model: UpdateProduct, entity: Product): Product
}