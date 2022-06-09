package com.example.til.handler

import com.example.til.dto.BaseResponseV1
import com.example.til.exception.NotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(NotFoundException::class)
    protected fun handleBaseException(e: NotFoundException): ResponseEntity<BaseResponseV1> {
        return ResponseEntity.status(e.errorCode.status)
            .body(BaseResponseV1(e.errorCode.status, e.errorCode.message))
    }
}