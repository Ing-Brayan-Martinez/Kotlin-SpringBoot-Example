package com.example.service_brand.mapper

import com.example.service_brand.domain.entities.Brand
import com.example.service_brand.domain.models.CreateBrand
import com.example.service_brand.domain.models.UpdateBrand
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class BrandMapperImpl : BrandMapper {
    override fun toBrandEntity(model: CreateBrand): Brand {
        return Brand(
            name = model.name,
            createAt = LocalDate.now(),
            updateAt = LocalDate.now(),
            description = model.description)
    }

    override fun toBrandEntity(model: UpdateBrand, entity: Brand): Brand {
        return entity.copy(
            name = model.name,
            updateAt = LocalDate.now(),
            description = model.description)
    }
}