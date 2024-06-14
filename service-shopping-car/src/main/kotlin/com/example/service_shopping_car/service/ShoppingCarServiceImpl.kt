package com.example.service_shopping_car.service

import com.example.service_shopping_car.domain.entities.ShoppingCar
import com.example.service_shopping_car.domain.models.AddToShoppingCar
import com.example.service_shopping_car.mapper.ShoppingCarMapper
import com.example.service_shopping_car.repository.ShoppingCarRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ShoppingCarServiceImpl(
    val shoppingCarRepository: ShoppingCarRepository,
    val shoppingCarMapper: ShoppingCarMapper) : ShoppingCarService {

    override fun addToShoppingCar(model: AddToShoppingCar): Mono<ShoppingCar> {
        TODO("Not yet implemented")
    }

    override fun deleteToShoppingCar(id: Long): Mono<Void> {
        TODO("Not yet implemented")
    }

    override fun getProductsFromShoppingCar(): Flux<ShoppingCar> {
        TODO("Not yet implemented")
    }
}