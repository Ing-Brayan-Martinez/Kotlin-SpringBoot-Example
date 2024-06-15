package com.example.service_brand.repository

import com.example.service_brand.domain.entities.Brand
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BrandRepository : ReactiveCrudRepository<Brand, Long> {
}