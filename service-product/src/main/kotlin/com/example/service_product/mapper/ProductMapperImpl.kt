package com.example.service_product.mapper

import com.example.service_product.domain.entities.Product
import com.example.service_product.domain.model.CreateProduct
import com.example.service_product.domain.model.UpdateProduct
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class ProductMapperImpl : ProductMapper {
    override fun newProductEntityFromCreateProduct(model: CreateProduct): Product {
        return Product(
            name = model.name,
            createAt = LocalDate.now(),
            updateAt = LocalDate.now(),
            description = model.description,
            price = model.price,
            stock = model.stock)
    }

    override fun newProductEntityFromCreateProduct(model: UpdateProduct, entity: Product): Product {
        return entity.copy(
            name = model.name,
            updateAt = LocalDate.now(),
            description = model.description,
            price = model.price,
            stock = model.stock)
    }
}