package com.example.til.exception

import com.example.til.constant.ErrorCodeEnum

class NotFoundException(eroorCode: ErrorCodeEnum): RuntimeException() {
    val errorCode: ErrorCodeEnum = eroorCode;
}