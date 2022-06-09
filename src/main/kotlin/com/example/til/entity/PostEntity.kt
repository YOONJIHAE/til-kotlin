package com.example.til.entity

import javax.persistence.*

@Entity
@Table(name="post")
class PostEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 500, nullable = false)
    var title: String,
    @Column(columnDefinition = "TEXT", nullable = false)
    var content: String
)