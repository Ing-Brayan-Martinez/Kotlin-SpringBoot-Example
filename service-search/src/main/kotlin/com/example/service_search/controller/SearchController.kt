package com.example.service_search.controller

import com.example.service_search.domain.models.SearchResponse
import com.example.service_search.service.SearchService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class SearchController(val searchService: SearchService) {

    val log: Logger = LoggerFactory.getLogger(SearchController::class.java)

    @GetMapping("/search/{term}")
    fun search(@PathVariable term: String): Mono<SearchResponse> {
        log.info("GET /search/${term}")

        return this.searchService.searchProducts(term)
    }
}