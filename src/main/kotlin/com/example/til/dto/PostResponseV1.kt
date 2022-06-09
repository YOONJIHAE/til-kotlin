package com.example.til.dto

import com.example.til.entity.PostEntity

data class PostResponseV1 (
    val id: Long,
    val title: String,
    val content: String,
){
    constructor(post: PostEntity) : this(
        id = post.id!!,
        title = post.title,
        content = post.content
    )
}