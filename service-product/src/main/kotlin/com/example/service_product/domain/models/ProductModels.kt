package com.example.service_product.domain.models

data class CreateProduct(
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int)

data class UpdateProduct(
    val id: Long,
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int)