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
class ProductRequest {
    val name: String? = null
    val description: String? = null
    val price: BigDecimal? = null
}

