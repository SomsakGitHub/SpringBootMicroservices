package com.somsak.productservice.controller

import com.somsak.productservice.dto.ProductRequest
import com.somsak.productservice.dto.ProductResponse
import com.somsak.productservice.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/product")
class ProductController {

    private val productService: ProductService? = null
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createProduct(@RequestBody productRequest: ProductRequest) {
        productService?.createProduct(productRequest)
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    fun getAllProduct(): List<ProductResponse> {
//        productService?.getAllProduct();
//    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllProduct(): Boolean? {
        return productService?.getAllProduct();
    }
}