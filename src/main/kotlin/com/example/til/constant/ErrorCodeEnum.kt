package com.example.til.constant

import org.springframework.http.HttpStatus

enum class ErrorCodeEnum(status: HttpStatus, message: String) {
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다.")
    ;

    val status: HttpStatus = status
    val message: String = message
}