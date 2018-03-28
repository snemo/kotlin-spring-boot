package com.nuxsoftware.kotlindemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinDemo

fun main(args: Array<String>) {
    SpringApplication.run(KotlinDemo::class.java, *args)
}