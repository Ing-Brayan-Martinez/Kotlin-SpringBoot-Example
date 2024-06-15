package com.example.service_category.mapper

import com.example.service_category.domain.entities.Category
import com.example.service_category.domain.models.CreateCategory
import com.example.service_category.domain.models.UpdateCategory
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class CategoryMapperImpl : CategoryMapper {
    override fun toCategoryEntity(model: CreateCategory): Category {
        return Category(
            name = model.name,
            createAt = LocalDate.now(),
            updateAt = LocalDate.now(),
            description = model.description)
    }

    override fun toCategoryEntity(model: UpdateCategory, entity: Category): Category {
        return entity.copy(
            name = model.name,
            updateAt = LocalDate.now(),
            description = model.description)
    }
}