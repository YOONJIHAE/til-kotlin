package com.example.til.dto

import org.springframework.http.HttpStatus

data class BaseResponseV1(
    val status: HttpStatus,
    val msg: String,
)