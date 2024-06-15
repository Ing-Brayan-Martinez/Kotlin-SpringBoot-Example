package com.example.service_search.service

import com.example.service_search.domain.entities.Brand
import com.example.service_search.domain.entities.Category
import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.SearchResponse
import com.example.service_search.mapper.SearchMapper
import com.example.service_search.repository.BrandRepository
import com.example.service_search.repository.CategoryRepository
import com.example.service_search.repository.ProductRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class SearchServiceImpl(
    val productRepository: ProductRepository,
    val brandRepository: BrandRepository,
    val categoryRepository: CategoryRepository,
    val searchMapper: SearchMapper) : SearchService {

    override fun searchProducts(term: String): Mono<SearchResponse> {
        if (term.isEmpty() || term.isBlank()) {
            return Mono.error { Exception("Term cannot be empty or blank") }
        }

        val likeTerm = "%$term%"

        val products: Mono<List<Product>> = this.productRepository
            .findProductsByTerm(likeTerm)
            .collectList()

        val brands: Mono<List<Brand>> = this.brandRepository
            .findBrandsByTerm(likeTerm)
            .collectList()

        val categories: Mono<List<Category>> = this.categoryRepository
            .findCategoriesByTerm(likeTerm)
            .collectList()

        return Mono.zip(products,brands, categories)
            .map {
                SearchResponse(
                    products = it.t1,
                    brands = it.t2,
                    categories = it.t3
                )
            }
    }
}