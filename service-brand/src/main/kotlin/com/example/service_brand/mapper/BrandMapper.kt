package com.example.service_brand.mapper

import com.example.service_brand.domain.entities.Brand
import com.example.service_brand.domain.models.CreateBrand
import com.example.service_brand.domain.models.UpdateBrand

interface BrandMapper {
    fun toBrandEntity(model: CreateBrand): Brand
    fun toBrandEntity(model: UpdateBrand, entity: Brand): Brand
}