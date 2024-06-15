package com.example.service_category.domain.models

data class CreateCategory(
    val name: String,
    val description: String) {

    fun isInvalid(): Boolean {
        if (name.isBlank() || description.isBlank()) {
            return true
        }
        return false
    }
}

data class UpdateCategory(
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