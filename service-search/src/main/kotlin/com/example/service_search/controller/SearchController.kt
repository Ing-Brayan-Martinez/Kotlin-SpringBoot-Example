package com.example.service_search.controller

import com.example.service_search.domain.entities.Product
import com.example.service_search.domain.models.SearchProduct
import com.example.service_search.service.SearchService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class SearchController(val searchService: SearchService) {

    val log: Logger = LoggerFactory.getLogger(SearchController::class.java)

    @GetMapping("/search")
    fun getPersons(model: SearchProduct): Flux<Product> {
        log.info("GET /search")

        return this.searchService.searchProducts(model)
    }
}