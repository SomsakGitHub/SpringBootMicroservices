package com.somsak.productservice.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestApi {
    @GetMapping
    public fun test(): String{
        return "Hello Test"
    }
}