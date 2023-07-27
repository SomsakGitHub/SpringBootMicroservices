package com.somsak.productservice.dto

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.math.BigDecimal

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class ProductResponse {
     val id: String? = null
     var name: String? = null
    var description: String? = null
    var price: BigDecimal? = null
}