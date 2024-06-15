package com.example.service_brand.controller

import com.example.service_brand.domain.entities.Brand
import com.example.service_brand.domain.models.CreateBrand
import com.example.service_brand.domain.models.UpdateBrand
import com.example.service_brand.service.BrandService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class BrandController(val brandService: BrandService) {

    val log: Logger = LoggerFactory.getLogger(BrandController::class.java)

    @PostMapping("/brand")
    fun create(@RequestBody model: CreateBrand): Mono<Brand> {
        log.info("POST /brand");

        return this.brandService.createBrand(model)
    }

    @PutMapping("/brand")
    fun update(@RequestBody model: UpdateBrand): Mono<Brand> {
        log.info("PUT /brand")

        return this.brandService.updateBrand(model)
    }

    @DeleteMapping("/brand/{id}")
    fun delete(@PathVariable id: Long): Mono<Void> {
        log.info("DELETE /brand/${id}")

        return this.brandService.deleteBrand(id)
    }

    @GetMapping("/brand")
    fun getBrands(): Flux<Brand> {
        log.info("GET /brand")

        return this.brandService.getBrands()
    }

    @GetMapping("/brand/{id}")
    fun getBrandInfo(@PathVariable id: Long): Mono<Brand> {
        log.info("GET /brand/${id}")

        return this.brandService.getBrandByID(id)
    }
}