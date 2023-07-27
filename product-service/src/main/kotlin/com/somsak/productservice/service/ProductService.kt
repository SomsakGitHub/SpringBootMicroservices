package com.somsak.productservice.service

import com.somsak.productservice.dto.ProductRequest
import com.somsak.productservice.dto.ProductResponse
import com.somsak.productservice.model.Product
import com.somsak.productservice.ropository.ProductRepository


class ProductService {

    private val productRepository: ProductRepository? = null

    fun createProduct(productRequest: ProductRequest) {
        val product = Product()
        product.name = productRequest.name
        product.description = productRequest.description
        product.price = productRequest.price
        productRepository?.save(product)
    }

    fun getAllProduct(): Boolean {
        val products = productRepository?.findAll()

        return true
    }

//    fun getAllProduct(): List<ProductResponse> {
//        val products = productRepository?.findAll()
//
//        return products?.stream()?.map(::mapToProductResponse).toList();
//    }

//    private fun mapToProductResponse(data: Product): ProductResponse? {
//        val product = ProductResponse()
//        product.name = data.name
//        product.description = data.description
//        product.price = data.price
//
//        return product;
//    }
}