package com.example.til.dto

import com.example.til.entity.PostEntity

class PostRequestV1 {
    data class PostSaveRequestV1(
        val title: String,
        val content: String
    ) {
        fun toEntity(): PostEntity = PostEntity(
            title = title,
            content = content
        )
    }

    data class PostUpdateRequestV1(
        val title: String = "",
        val content: String = ""
    )

}