package com.example.service_shopping_car.repository

import com.example.service_shopping_car.domain.entities.ShoppingCar
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingCarRepository : ReactiveCrudRepository<ShoppingCar, Long> {
}