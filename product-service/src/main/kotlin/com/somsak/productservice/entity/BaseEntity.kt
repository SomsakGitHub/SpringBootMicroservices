package com.somsak.productservice.entity

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@MappedSuperclass
abstract class BaseEntity {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(length = 36, nullable = false, updatable = false)
    val id: String? = null
}