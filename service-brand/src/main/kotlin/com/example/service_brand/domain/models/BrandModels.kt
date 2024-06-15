package com.example.service_brand.domain.models

data class CreateBrand(
    val name: String,
    val description: String) {

    fun isInvalid(): Boolean {
        if (name.isBlank() || description.isBlank()) {
            return true
        }
        return false
    }
}

data class UpdateBrand(
    val id: Long,
    val name: String,
    val description: String) {

    fun isInvalid(): Boolean {
        if (id <= 0 || name.isBlank() || description.isBlank()) {
            return true
        }
        return false
    }
}