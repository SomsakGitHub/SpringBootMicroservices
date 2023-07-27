package com.somsak.productservice.model

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import jakarta.persistence.Entity
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.math.BigDecimal

@Entity(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
class Product {
    //@Id
    var id: String? = null
    var name: String? = null
    var description: String? = null
    var price: BigDecimal? = null
}