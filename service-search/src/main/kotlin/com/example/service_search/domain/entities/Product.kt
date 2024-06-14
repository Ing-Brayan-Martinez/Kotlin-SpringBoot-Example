package com.example.service_search.domain.entities


import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table("Product")
class Product(
    @Id
    val id: Long? = null,
    val createAt: LocalDate,
    var updateAt: LocalDate,
    var name: String,
    var description: String,
    var price: Double,
    var stock: Int
) {
    fun copy(name: String, updateAt: LocalDate?, description: String,
             price: Double, stock: Int): Product {
        this.name = name
        this.updateAt = updateAt!!
        this.description = description
        this.price = price
        this.stock = stock
        return this
    }
}