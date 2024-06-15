package com.example.service_search.repository

import com.example.service_search.domain.entities.Category
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface CategoryRepository : ReactiveCrudRepository<Category, Long> {
    @Query("""
    SELECT * FROM "Category" c
        WHERE UPPER(c.name) ILIKE UPPER(:term)     
        OR UPPER(c.description) ILIKE UPPER(:term)
        LIMIT 100        
    """)
    fun findCategoriesByTerm(term: String): Flux<Category>
}