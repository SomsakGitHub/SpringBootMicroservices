package com.somsak.productservice.ropository

import com.somsak.productservice.model.Product
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
interface ProductRepository : JpaRepository<Product?, String?> {

}