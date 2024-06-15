package com.example.service_search.repository

import com.example.service_search.domain.entities.Brand
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface BrandRepository : ReactiveCrudRepository<Brand, Long> {
    @Query("""
    SELECT * FROM "Brand" b
        WHERE UPPER(b.name) ILIKE UPPER(:term)     
        OR UPPER(b.description) ILIKE UPPER(:term)
        LIMIT 100        
    """)
    fun findBrandsByTerm(term: String): Flux<Brand>
}