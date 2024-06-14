package com.example.service_shopping_car.service

import com.example.service_shopping_car.domain.entities.ShoppingCar
import com.example.service_shopping_car.domain.models.AddToShoppingCar
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface ShoppingCarService {
    fun addToShoppingCar(model: AddToShoppingCar): Mono<ShoppingCar>
    fun deleteToShoppingCar(id: Long): Mono<Void>
    fun getProductsFromShoppingCar(): Flux<ShoppingCar>
}