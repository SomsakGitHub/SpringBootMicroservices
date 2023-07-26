package com.somsak.productservice.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity(name = "m_user")
class User: BaseEntity() {
    @Column(nullable = false, unique = true, length = 60)
    private val email: String? = null

    @Column(nullable = false, length = 120)
    private val password: String? = null

    @Column(nullable = false, length = 120)
    private val name: String? = null
}