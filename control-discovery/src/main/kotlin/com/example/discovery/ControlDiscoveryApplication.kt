package com.example.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ControlDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<ControlDiscoveryApplication>(*args)
}
