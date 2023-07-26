package com.somsak.productservice.model

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
//import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal


//@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
class Product {
    //@Id
    private val id: String? = null
    private val name: String? = null
    private val description: String? = null
    private val price: BigDecimal? = null
}