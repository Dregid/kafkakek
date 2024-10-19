package com.phoenix.kafkakek

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkakekApplication

fun main(args: Array<String>) {
    runApplication<KafkakekApplication>(*args)
}
