package com.example.service_product.mapper

import com.example.service_product.domain.entities.Product
import com.example.service_product.domain.models.CreateProduct
import com.example.service_product.domain.models.UpdateProduct

interface ProductMapper {
    fun toProductEntity(model: CreateProduct): Product
    fun toProductEntity(model: UpdateProduct, entity: Product): Product
}