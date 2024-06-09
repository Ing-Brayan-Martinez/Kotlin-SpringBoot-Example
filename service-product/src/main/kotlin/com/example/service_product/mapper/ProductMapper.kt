package com.example.service_product.mapper

import com.example.service_product.domain.entities.Product
import com.example.service_product.domain.model.CreateProduct
import com.example.service_product.domain.model.UpdateProduct

interface ProductMapper {
    fun newProductEntityFromCreateProduct(model: CreateProduct): Product
    fun newProductEntityFromCreateProduct(model: UpdateProduct, entity: Product): Product
}