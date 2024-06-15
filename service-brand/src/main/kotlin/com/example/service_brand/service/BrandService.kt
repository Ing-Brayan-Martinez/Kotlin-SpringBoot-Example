package com.example.service_brand.service

import com.example.service_brand.domain.entities.Brand
import com.example.service_brand.domain.models.CreateBrand
import com.example.service_brand.domain.models.UpdateBrand
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface BrandService {
    fun createBrand(create: CreateBrand): Mono<Brand>
    fun updateBrand(update: UpdateBrand): Mono<Brand>
    fun deleteBrand(id: Long): Mono<Void>
    fun getBrands(): Flux<Brand>
    fun getBrandByID(id: Long): Mono<Brand>
}