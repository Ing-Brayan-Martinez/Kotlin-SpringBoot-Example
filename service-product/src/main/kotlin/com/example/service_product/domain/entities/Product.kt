package com.example.service_product.domain.entities


import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table("\"Product\"")
class Product(
    @Id
    @Column
    val id: Long? = null,
    @Column("create_at")
    val createAt: LocalDate,
    @Column("update_at")
    var updateAt: LocalDate,
    @Column
    var name: String,
    @Column
    var description: String,
    @Column
    var price: Double,
    @Column
    var stock: Int,
    @Column
    var brandID: Int,
    @Column
    var categoryID: Int

) {
    fun copy(name: String, updateAt: LocalDate, description: String,
             price: Double, stock: Int, brandID: Int, categoryID: Int): Product {
        this.name = name
        this.updateAt = updateAt
        this.description = description
        this.price = price
        this.stock = stock
        this.brandID = brandID
        this.categoryID = categoryID
        return this
    }
}