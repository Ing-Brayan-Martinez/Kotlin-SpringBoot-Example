package com.example.service_product.domain.models

data class CreateProduct(
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int,
    val brandID: Int,
    val categoryID: Int) {

    fun isInvalid(): Boolean {
        if (name.isBlank() || description.isBlank()
            || price <= 0 || stock < 0 || brandID < 0 || categoryID < 0) {
            return true
        }
        return false
    }
}

data class UpdateProduct(
    val id: Long,
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int,
    val brandID: Int,
    val categoryID: Int) {

    fun isInvalid(): Boolean {
        if (id <= 0 || name.isBlank() || description.isBlank()
            || price <= 0 || stock < 0 || brandID < 0 || categoryID < 0) {
            return true
        }
        return false
    }
}