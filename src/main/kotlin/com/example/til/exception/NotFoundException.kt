package com.example.til.exception

import com.example.til.constant.ErrorCodeEnum

class NotFoundException(errorCode: ErrorCodeEnum): RuntimeException() {
    val errorCode: ErrorCodeEnum = errorCode;
}