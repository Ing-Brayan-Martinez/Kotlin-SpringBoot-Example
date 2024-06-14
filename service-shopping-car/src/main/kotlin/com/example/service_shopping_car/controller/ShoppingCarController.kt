package com.example.service_shopping_car.controller

import com.example.service_shopping_car.domain.entities.ShoppingCar
import com.example.service_shopping_car.domain.models.AddToShoppingCar
import com.example.service_shopping_car.service.ShoppingCarService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class ShoppingCarController(val shoppingCarService: ShoppingCarService) {

    val log: Logger = LoggerFactory.getLogger(ShoppingCarController::class.java)

    @PostMapping("/shopping-car")
    fun add(@RequestBody model: AddToShoppingCar): Mono<ShoppingCar> {
        log.info("POST /shopping-car");

        return this.shoppingCarService.addToShoppingCar(model)
    }

    @DeleteMapping("/shopping-car/{id}")
    fun delete(@PathVariable id: Long): Mono<Void> {
        log.info("DELETE /shopping-car/${id}")

        return this.shoppingCarService.deleteToShoppingCar(id)
    }

    @GetMapping("/shopping-car")
    fun getPersons(): Flux<ShoppingCar> {
        log.info("GET /shopping-car")

        return this.shoppingCarService.getProductsFromShoppingCar()
    }
}