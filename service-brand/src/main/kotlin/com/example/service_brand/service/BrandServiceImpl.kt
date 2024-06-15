package com.example.service_brand.service

import com.example.service_brand.domain.entities.Brand
import com.example.service_brand.domain.models.CreateBrand
import com.example.service_brand.domain.models.UpdateBrand
import com.example.service_brand.mapper.BrandMapper
import com.example.service_brand.repository.BrandRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class BrandServiceImpl(
    val brandRepository: BrandRepository,
    val brandMapper: BrandMapper) : BrandService {

    override fun createBrand(create: CreateBrand): Mono<Brand> {
        // Validate input
        if (create.isInvalid()) {
            return Mono.error { Exception("Invalid input data") }
        }

        // Execute algorithm
        return Mono.justOrEmpty(create)
            .map { brandMapper.toBrandEntity(it) }
            .flatMap { brandRepository.save(it) }
    }

    override fun  updateBrand(update: UpdateBrand): Mono<Brand> {
        // Validate input
        if (update.isInvalid()) {
            return Mono.error { Exception("Invalid input data") }
        }

        // Execute algorithm
        return this.brandRepository.findById(update.id)
            .map { brandMapper.toBrandEntity(update, it) }
            .flatMap { brandRepository.save(it) }
    }

    override fun deleteBrand(id: Long): Mono<Void>{
        // Validate input
        if (id <= 0) {
            return Mono.error { Exception("Id cannot be empty or blank") }
        }

        // Execute algorithm
        return this.brandRepository.findById(id)
            .flatMap { brandRepository.delete(it) }
    }

    override fun getBrands(): Flux<Brand> {
        // Execute algorithm
        return this.brandRepository.findAll()
    }

    override fun getBrandByID(id: Long): Mono<Brand> {
        // Execute algorithm
        return this.brandRepository.findById(id)
    }
}