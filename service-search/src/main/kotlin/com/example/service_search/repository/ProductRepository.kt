package com.example.service_search.repository

import com.example.service_search.domain.entities.Product
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface ProductRepository : ReactiveCrudRepository<Product, Long> {
    @Query("""
    SELECT * FROM "Product" p
        WHERE UPPER(p.name) ILIKE UPPER(:term)     
        OR UPPER(p.description) ILIKE UPPER(:term)
        LIMIT 100        
    """)
    fun findProductsByTerm(term: String): Flux<Product>
}