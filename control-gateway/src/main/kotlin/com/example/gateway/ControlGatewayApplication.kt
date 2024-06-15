package com.example.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ControlGatewayApplication

fun main(args: Array<String>) {
	runApplication<ControlGatewayApplication>(*args)
}
