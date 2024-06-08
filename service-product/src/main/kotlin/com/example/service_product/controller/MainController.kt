package com.example.service_product.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class MainController {
    @GetMapping("/")
    fun main(): Mono<String> {
        return Mono.just("Hello World!")
    }
}